public class PhoneApp {
    public static void main(String[] args) {

        Phone S7 = new SamsungS7(69, "074 302 0314");
        Phone S8Edge = new SamsungS8Edge(42, "073 423 4231");
        Phone iphoneX = new IphoneX(88, "074 923 4233");

        S7.addContact(1, "0734959322", "Diana", "Enoiu");
        S7.addContact(2, "0723214654", "George", "Bancu");
        S7.addContact(3, "0722156543", "Octavian", "Floarea");
        S7.addContact(4, "0749292380", "Alexandra", "Margarit");

        S7.listContacts();
        System.out.println(S7.getNominalBatteryLife());
        System.out.println(S7.getPhoneNumber());

        S8Edge.addContact(1, "0734959322", "Diana", "Enoiu");
        S8Edge.addContact(2, "0723214654", "George", "Bancu");
        S8Edge.addContact(3, "0722156543", "Octavian", "Floarea");
        S8Edge.addContact(4, "0749292380", "Alexandra", "Margarit");

        S8Edge.listContacts();

        iphoneX.addContact(1, "0734959322", "Diana", "Enoiu");
        iphoneX.addContact(2, "0723214654", "George", "Bancu");
        iphoneX.addContact(3, "0722156543", "Octavian", "Floarea");
        iphoneX.addContact(4, "0749292380", "Alexandra", "Margarit");

        iphoneX.listContacts();

        System.out.println();
        System.out.println("Send a message");
        try {
            iphoneX.sendMessage(S8Edge.getPhoneNumber(), " this is my test text message");
        } catch (OutOfBatteryException e) {
            e.printStackTrace();
        } catch (MessageOverMaximumAdmissibleLengthException e) {
            e.printStackTrace();
        }

        System.out.println("Make a call");
        try {
            S7.call(iphoneX.getPhoneNumber());
        } catch (OutOfBatteryException e) {
            e.printStackTrace();
        }
    }
}
