package by.milosh.api;

import by.milosh.api.Result;
import by.milosh.api.util.AttemptUtil;

public interface TaskAttempt extends AttemptUtil {

    public Result getResult();

}
