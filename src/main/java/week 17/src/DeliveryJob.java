package main;

public class DeliveryJob implements Runnable {

    private PackageGroup packageGroup;

    public DeliveryJob(PackageGroup packageGroup) {
        this.packageGroup = packageGroup;
    }

    @Override
    public void run() {
        String location = packageGroup.getPackages().get(0).getTargetLocation();
        String targetDate = packageGroup.getPackages().get(0).getDeliveryDate().toString();
        int distanceInKm = packageGroup.getPackages().get(0).getDistanceInKm() >= 20 ? 20 : packageGroup.getPackages().get(0).getDistanceInKm();
        System.out.println("[Delivering for <" + location + "> and date <" + targetDate + "> in <" + distanceInKm + "> seconds]");
        try {
            Thread.sleep(distanceInKm * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("done");
    }

    public PackageGroup getPackageGroup() {
        return packageGroup;
    }

    public void setPackageGroup(PackageGroup packageGroup) {
        this.packageGroup = packageGroup;
    }
}
