public class SamsungS7 extends Samsung {

    private String thisIMEI;

    public SamsungS7() {
        thisIMEI = String.valueOf(++lastIMEI);
    }

    public SamsungS7(float nominalBatteryLife) {
        super(nominalBatteryLife);
        thisIMEI = String.valueOf(++lastIMEI);
    }

    public SamsungS7(float nominalBatteryLife, String phoneNumber) {
        super(nominalBatteryLife, phoneNumber);
        thisIMEI = String.valueOf(++lastIMEI);
    }
}
