package by.milosh.api;

public class Platform {

    // ~ Static fields/initializers
    // ================================================================================================
    public static final int MIN_VALUE = 2;
    public static final int MAX_VALUE = 49;

    // ~ Instance fields
    // ================================================================================================
    private int[] sequenceNumber;
    private int size;

    // ~ Constructors
    // ===================================================================================================
    public Platform() {
    }

    public Platform(int[] sequenceNumber) throws NumberFormatException {
        int size = sequenceNumber.length;
        if ((size < MIN_VALUE) || (size > MAX_VALUE)) {
            throw new NumberFormatException("Sequence number size value out of range. It must be between " + MIN_VALUE +  " and" + MAX_VALUE + " inclusive.");
        }
        this.sequenceNumber = sequenceNumber;
    }

    // ~ Methods
    // ========================================================================================================
    public int[] getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int[] sequenceNumber) throws NumberFormatException{
        int size = sequenceNumber.length;
        if ((size < MIN_VALUE) || (size > MAX_VALUE)) {
            throw new NumberFormatException("Sequence number size value out of range. It must be between " + MIN_VALUE +  " and " + MAX_VALUE + " inclusive.");
        }
        this.sequenceNumber = sequenceNumber;
        this.size = sequenceNumber.length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = sequenceNumber.length;
    }
}
