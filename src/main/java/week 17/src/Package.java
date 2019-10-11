package main;

import java.time.LocalDate;

public class Package {

    private String targetLocation;
    private Integer distanceInKm;
    private Integer value;
    private LocalDate deliveryDate;

    public Package() {
    }

    public Package(String targetLocation, Integer distanceInKm, Integer value, LocalDate deliveryDate) {
        this.targetLocation = targetLocation;
        this.distanceInKm = distanceInKm;
        this.value = value;
        this.deliveryDate = deliveryDate;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    public Integer getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(Integer distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Package{" +
                "targetLocation='" + targetLocation + '\'' +
                ", distanceInKm=" + distanceInKm +
                ", value=" + value +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
