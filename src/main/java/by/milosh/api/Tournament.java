package by.milosh.api;

import java.util.List;

public class Tournament {

    private List<Attempt> attempts;

    public Tournament() {
    }

    public List<Attempt> getAttempts() {
        return attempts;
    }

    public void setAttempts(List<Attempt> attempts) {
        this.attempts = attempts;
    }
}
