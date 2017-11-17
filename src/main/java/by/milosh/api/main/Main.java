package by.milosh.api.main;

import by.milosh.api.Attempt;
import by.milosh.api.Dancer;
import by.milosh.api.Platform;
import by.milosh.api.Result;

public class Main {

    private void pr() {
        System.out.println("hello");
        pr2();
    }

    private void pr2() {
        System.out.println("sasha");
    }

    public static void main(String[] args) {
        Dancer dancer = new Dancer();
        dancer.setName("Alexander");
        dancer.setSerialNumber(1);

        int[] sequenceNumber = {2, 0, 7, 100};
        int[] sequenceNumber2 = {2, 0, 2, 4, 1};

        int[] sequenceNumberLooping = {4, 2, 1, 3, 3};  // for looping

        Platform platform = new Platform();
        platform.setSequenceNumber(sequenceNumber);

        Platform platform2 = new Platform();
        platform2.setSequenceNumber(sequenceNumber2);

        Attempt attempt1 = new Attempt(dancer, platform);
        Result result1 = attempt1.getResult();
        int numberOfStep = result1.getSteps();

        Attempt attempt2 = new Attempt(dancer, platform2);
        Result result2 = attempt2.getResult();
        int numberOfStep2 = result2.getSteps();






    }

}
