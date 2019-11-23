public interface Phoneable {

    void addContact (int position, String phoneNumber, String firstName, String lastName);

    //List<Contact> listContacts();
    void listContacts();

    void sendMessage (String phoneNumber, String content) throws MessageOverMaximumAdmissibleLengthException, OutOfBatteryException;

    //List<Message> listMessages (Contact destination); //for a more comprehensive future implementation
    void listMessages (String phoneNumber);

    void call (String phoneNumber) throws OutOfBatteryException;

    void viewHistory();

}
