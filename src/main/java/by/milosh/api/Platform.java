package by.milosh.api;

public class Platform {

    private int[] sequenceNumber;

    public Platform() {
    }

    public Platform(int[] sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public int[] getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int[] sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
}
