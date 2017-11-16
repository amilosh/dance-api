package by.milosh.api;

import by.milosh.api.Result;
import by.milosh.api.util.AttemptUtil;

/**
 * A representation of attempt by the condition of our problem.
 *
 * @author Aliaksandr Milash
 */
public interface TaskAttempt extends AttemptUtil {

    /**
     * Returns result.
     *
     * @return result
     */
    public Result getResult();

}
