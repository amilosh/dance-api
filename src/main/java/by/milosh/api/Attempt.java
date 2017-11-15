package by.milosh.api;

public class Attempt {

    private Dancer dancer;

    private Platform platform;

    private Result result;

    public Attempt() {
    }

    public Attempt(Dancer dancer, Platform platform) {
        this.dancer = dancer;
        this.platform = platform;
        Result result1 = new Result();
        result1.setSteps(dancer, platform);
        this.result = result1;
    }

    public Dancer getDancer() {
        return dancer;
    }

    public void setDancer(Dancer dancer) {
        this.dancer = dancer;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Result getResult() {
        return result;
    }
}
