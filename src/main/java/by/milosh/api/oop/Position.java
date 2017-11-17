package by.milosh.api.oop;

public class Position {

    public static final int INITIAL_POSITION_IN_ARRAY = 0;

    private int positionInArray;

    public Position() {
        this.positionInArray = INITIAL_POSITION_IN_ARRAY;
    }

    public int getPositionInArray() {
        return positionInArray;
    }

    public void setPositionInArray(int positionInArray) {
        this.positionInArray = positionInArray;
    }

    public void changePosition(int value) {
        this.positionInArray += value;
    }
}
