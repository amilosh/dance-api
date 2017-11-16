package by.milosh.api;

import by.milosh.api.Dancer;
import by.milosh.api.Platform;
import by.milosh.api.util.ResultUtil;

/**
 * A representation of result by the condition of our problem..
 *
 * @author Aliaksandr Milash
 */
public interface TaskResult extends ResultUtil {

    /**
     * Returns the number of steps the dancer made.
     *
     * @return number of steps the dancer made
     */
    int getSteps();

    /**
     * The method calculates the number of steps that a dancer will take, depending on the platform.
     *
     * @param dancer dancer who takes part in competitions
     * @param platform platform with it sequence number
     */
    void setSteps(Dancer dancer, Platform platform);
}
