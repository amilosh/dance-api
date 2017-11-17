package by.milosh.api.oop;

public class Step {

    public static final int INITIAL_STEPS = 0;

    private int steps;

    public Step() {
        this.steps = INITIAL_STEPS;
    }

    public void increaseSteps(int valueToIncrease) {
        this.steps = this.steps + valueToIncrease;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
