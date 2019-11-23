public class IphoneX extends Iphone {
    private String thisIMEI;

    public IphoneX () {
        thisIMEI = String.valueOf(++lastIMEI);
    }

    public IphoneX (float nominalBatteryLife) {
        super(nominalBatteryLife);
        thisIMEI = String.valueOf(++lastIMEI);
    }

    public IphoneX (float nominalBatteryLife, String phoneNumber) {
        super(nominalBatteryLife, phoneNumber);
        thisIMEI = String.valueOf(++lastIMEI);
    }
}
