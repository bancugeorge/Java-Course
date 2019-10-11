package main;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SystemMain {

    public static void main(String[] args) throws IOException, InterruptedException {
        List<Package> packages = FileReader.getPackages();
        Map<String, List<Package>> groupedPackages = new LinkedHashMap<>();
        for(Package aPackage : packages){
            String mapKey = aPackage.getTargetLocation() + "-" + aPackage.getDeliveryDate();
            if(groupedPackages.get(mapKey) == null){
                List<Package> mapPackages = new ArrayList<>();
                mapPackages.add(aPackage);
                groupedPackages.put(mapKey, mapPackages);
            } else {
                groupedPackages.get(mapKey).add(aPackage);
            }
        }

        List<PackageGroup> packageGroups = new ArrayList<>();
        int totalAmount = 0;
        int totalRevenue = 0;
        for(String mapKey : groupedPackages.keySet()){
            System.out.println("----------- For group : " + mapKey + "-----------");
            List<Package> groupPackages = groupedPackages.get(mapKey);
            int amount = groupPackages.stream().mapToInt(Package::getValue).sum();
            totalAmount += amount;
            int revenue = groupPackages.stream().mapToInt(Package::getDistanceInKm).sum();
            totalRevenue += revenue;
            System.out.println("Amount : " + amount);
            System.out.println("Revenue : " + revenue);
            System.out.println("--------------------------------------------");

            PackageGroup packageGroup = new PackageGroup();
            packageGroup.setGroupKey(mapKey);
            packageGroup.setPackages(groupPackages);
            packageGroups.add(packageGroup);
        }

        ExecutorService executorService = Executors.newFixedThreadPool(9);
        for(PackageGroup packageGroup : packageGroups){
            DeliveryJob deliveryJob = new DeliveryJob(packageGroup);
            executorService.submit(deliveryJob);
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        System.out.println("Everything finished");
        System.out.println("Total amount " + totalAmount);
        System.out.println("Total revenue " + totalRevenue);
    }

}
