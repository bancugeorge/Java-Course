import java.util.ArrayList;
import java.util.List;

public abstract class Phone implements Phoneable {

    private String phoneNumber;
    private List<Contact> contactList;
    private List<Message> messagesList;
    private List<Call> callsList;

    private final float nominalBatteryLife; //will be immutable once set

    private float remainingBattery; //in hours
    private Color color;
    private Material material;

    private String IMEI;

    public static int lastIMEI = 0;

    //constructors
    public Phone() {
        nominalBatteryLife = 0;
        contactList = new ArrayList<>();
        messagesList = new ArrayList<>();
        callsList = new ArrayList<>();
    }

    public Phone(float nominalBatteryLife) {
        this.nominalBatteryLife = nominalBatteryLife;
        this.remainingBattery = this.nominalBatteryLife;
        contactList = new ArrayList<>();
        messagesList = new ArrayList<>();
        callsList = new ArrayList<>();
    }

    public Phone(float nominalBatteryLife, String phoneNumber) {
        this.nominalBatteryLife = nominalBatteryLife;
        this.remainingBattery = this.nominalBatteryLife;
        this.phoneNumber = phoneNumber;
        contactList = new ArrayList<>();
        messagesList = new ArrayList<>();
        callsList = new ArrayList<>();
    }

    //implement interface
    public void addContact(int position, String phoneNumber, String firstName, String lastName) {
        //what's the point of 'position' here?
        contactList.add(new Contact(phoneNumber, firstName, lastName));
    }

    public void listContacts() {
        contactList.stream().forEach(c -> System.out.println(c.toString()));
    }

    public void sendMessage(String phoneNumber, String content) throws MessageOverMaximumAdmissibleLengthException,
            OutOfBatteryException {
        if (content.length() > 500) throw new MessageOverMaximumAdmissibleLengthException(content.length());
        if (remainingBattery <= 1) throw new OutOfBatteryException();

        //TODO: implement notification + listener
        System.out.println("Sending message: " + content + ". Going from " + this.phoneNumber + " to " + phoneNumber);
        remainingBattery -= 1;
    }

    public void listMessages(String phoneNumber) {
        System.out.println(messagesList.stream().filter(p -> p.getReceiverNumber().equals(phoneNumber)));
        System.out.println(messagesList.stream().filter(p -> p.getSenderNumber().equals(phoneNumber)));
    }

    public void call(String phoneNumber) throws OutOfBatteryException {

        if (remainingBattery <= 2) throw new OutOfBatteryException();
        System.out.println("number called" + phoneNumber);
        System.out.println("calling number " + this.phoneNumber);

        //TODO: implement event listener

        /* System.out.println("testing phone calls");
        contactList.stream().filter(contact -> contact.getPhoneNumber().equals(phoneNumber)).
                forEach(contact -> contact.callContact(phoneNumber));*/

        remainingBattery -= 2;
    }

    public void viewHistory() {
        callsList.stream().forEach(call -> System.out.println(call.toString()));
    }

    //utility methods
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Message> getMessagesList() {
        return messagesList;
    }

    public void setMessagesList(List<Message> messagesList) {
        this.messagesList = messagesList;
    }

    public List<Call> getCallsList() {
        return callsList;
    }

    public void setCallsList(List<Call> callsList) {
        this.callsList = callsList;
    }

    public float getNominalBatteryLife() {
        return nominalBatteryLife;
    }

    public float getRemainingBattery() {
        return remainingBattery;
    }

    public void setRemainingBattery(float remainingBattery) {
        this.remainingBattery = remainingBattery;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
