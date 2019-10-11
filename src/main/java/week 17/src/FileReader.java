package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    public static List<Package> getPackages() throws IOException {
        String file ="src/main/packages.txt";

        BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
        List<String> fileLines = reader.lines().collect(Collectors.toList());
        List<Package> packages = new ArrayList<>();
        for(String line : fileLines){
            String[] lineItems = line.split(",");
            Package aPackage = new Package();
            aPackage.setTargetLocation(lineItems[0]);
            aPackage.setDistanceInKm(Integer.valueOf(lineItems[1]));
            aPackage.setValue(Integer.valueOf(lineItems[2]));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(lineItems[3], formatter);
            aPackage.setDeliveryDate(date);

            packages.add(aPackage);
        }
        return packages;
    }

}
