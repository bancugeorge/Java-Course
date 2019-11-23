public abstract class Iphone extends Phone {

    Iphone () {}

    Iphone (float nominalBatteryLife) {
        super (nominalBatteryLife);
    }

    Iphone (float nominalBatteryLife, String phoneNumber) {
        super (nominalBatteryLife, phoneNumber);
    }
}
