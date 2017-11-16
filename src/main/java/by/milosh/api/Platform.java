package by.milosh.api;

public class Platform {

    public static final int MIN_VALUE = 2;
    public static final int MAX_VALUE = 49;

    private int[] sequenceNumber;

    public Platform() {
    }

    public Platform(int[] sequenceNumber) throws NumberFormatException {
        int size = sequenceNumber.length;
        if ((size < MIN_VALUE) || (size > MAX_VALUE)) {
            throw new NumberFormatException("Sequence number size value out of range. It must be between " + MIN_VALUE +  " and" + MAX_VALUE + " inclusive.");
        }
        this.sequenceNumber = sequenceNumber;
    }

    public int[] getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int[] sequenceNumber) throws NumberFormatException{
        int size = sequenceNumber.length;
        if ((size < MIN_VALUE) || (size > MAX_VALUE)) {
            throw new NumberFormatException("Sequence number size value out of range. It must be between " + MIN_VALUE +  " and " + MAX_VALUE + " inclusive.");
        }
        this.sequenceNumber = sequenceNumber;
    }
}
