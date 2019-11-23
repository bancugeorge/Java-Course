public class MessageOverMaximumAdmissibleLengthException extends Throwable {
    private int length;
    public MessageOverMaximumAdmissibleLengthException (int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
