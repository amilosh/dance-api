package by.milosh.api;

public class Result implements TaskResult {

    private int steps;

    public Result() {
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(Dancer dancer, Platform platform) {
        this.steps = getNumberOfSteps(platform.getSequenceNumber());
    }

    private static int getNumberOfSteps(int[] sequence) {
        int steps = 0;
        int value = sequence[0];
        int point = 1;
        int size = sequence.length;
        boolean loop = true;

        boolean[] proxySequence = initProxySequence(sequence);

        while (isCanNextStep(value, point, size) & (loop == true)) {
            proxySequence[point - 1] = true;

            if ((value % 2) == 0) {
                steps = steps + value;
                point = point + value;
                value = sequence[point - 1];
            } else if ((value % 2) != 0) {
                steps = steps + value;
                point = point - value;
                value = sequence[point - 1];
            }

            if (proxySequence[point - 1] == true) {
                loop = false;
            }
        }

        steps = steps + point -1 ;

        if (loop == false) {
            return -1;
        } else {
            return steps;
        }

    }

    static boolean isCanNextStep(int value, int point, int size) {
        boolean canStep = true;
        if (value == 0) {
            canStep = false;
        } else if ((value % 2) == 0) {
            if ((size - point) < value) {
                canStep = false;
            }
        } else if ((value % 2) != 0) {
            if (value >= point) {
                canStep = false;
            }
        }
        return canStep;
    }

    private static boolean[] initProxySequence(int[] sequence) {
        boolean[] proxy = new boolean[sequence.length];
        for (boolean bool : proxy) {
            bool = false;
        }
        return proxy;
    }


}
