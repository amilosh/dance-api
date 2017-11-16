package by.milosh.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APITest {

    @Test
    public void apiTest() {

        Dancer dancer = new Dancer();
        dancer.setName("Alexander");
        dancer.setSerialNumber(1);

        int[] sequenceNumber = {2, 3, 1};
        int[] sequenceNumberLooping = {4, 2, 1, 3, 3};  // for looping

        Platform platform = new Platform();
        platform.setSequenceNumber(sequenceNumberLooping);

        Attempt attempt = new Attempt(dancer, platform);

        Result result = attempt.getResult();

        int numberOfStep = result.getSteps();

        assertEquals(-1, numberOfStep);

    }

}
