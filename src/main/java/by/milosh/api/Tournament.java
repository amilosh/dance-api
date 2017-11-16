package by.milosh.api;

import java.util.List;

public class Tournament implements TaskTournament {

    // ~ Instance fields
    // ================================================================================================
    private List<Attempt> attempts;

    // ~ Constructors
    // ===================================================================================================
    public Tournament() {
    }

    // ~ Methods
    // ========================================================================================================
    public List<Attempt> getAttempts() {
        return attempts;
    }

    public void setAttempts(List<Attempt> attempts) {
        this.attempts = attempts;
    }
}
