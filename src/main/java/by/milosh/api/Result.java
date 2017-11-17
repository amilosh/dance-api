package by.milosh.api;

import by.milosh.api.oop.Position;
import by.milosh.api.oop.Proxy;
import by.milosh.api.oop.Step;
import by.milosh.api.oop.Value;
import by.milosh.api.service.ResultService;

public class Result implements TaskResult {

    // ~ Instance fields
    // =======================================================================================================
    private int steps;

    // ~ Constructors
    // =======================================================================================================
    public Result() {
    }

    // ~ Methods
    // =======================================================================================================
    public int getSteps() {
        return steps;
    }

    /**
     * Метод который вычисляет колчисетво шагов, которые пройдёт танцор.
     * И устанавливает это значение в поле steps.
     *
     * @param dancer dancer who takes part in competitions
     * @param platform platform with it sequence number
     */
    public void setSteps(Dancer dancer, Platform platform) {
        ResultService resultService = new ResultService();
        this.steps = resultService.getNumberOfSteps(platform);
    }




}
