package by.milosh.api;

import by.milosh.api.Attempt;
import by.milosh.api.util.DanceTournament;

import java.util.List;

/**
 * A representation of tournament by the condition of our problem.
 *
 * @author Aliaksandr Milash
 */
public interface TaskTournament extends DanceTournament {

    /**
     * Returns list of attempts.
     *
     * @return list of attempts
     */
    public List<Attempt> getAttempts();

    /**
     * Set list of attempts to tournament.
     *
     * @param attempts list of attempts each containing dancer, platform and result
     */
    public void setAttempts(List<Attempt> attempts);

}
