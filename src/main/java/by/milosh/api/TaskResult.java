package by.milosh.api;

import by.milosh.api.Dancer;
import by.milosh.api.Platform;
import by.milosh.api.util.ResultUtil;

public interface TaskResult extends ResultUtil {

    int getSteps();

    void setSteps(Dancer dancer, Platform platform);
}
