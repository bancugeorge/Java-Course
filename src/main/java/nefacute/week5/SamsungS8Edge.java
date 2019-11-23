public class SamsungS8Edge extends Samsung {
    private String thisIMEI;

    public SamsungS8Edge() {
        thisIMEI = String.valueOf(++lastIMEI);
    }

    public SamsungS8Edge(float nominalBatteryLife) {
        super(nominalBatteryLife);
        thisIMEI = String.valueOf(++lastIMEI);
    }

    public SamsungS8Edge(float nominalBatteryLife, String phoneNumber) {
        super(nominalBatteryLife, phoneNumber);
        thisIMEI = String.valueOf(++lastIMEI);
    }
}
