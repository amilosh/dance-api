package by.milosh.api;

import by.milosh.api.Attempt;
import by.milosh.api.util.DanceTournament;

import java.util.List;

public interface TaskTournament extends DanceTournament {

    public List<Attempt> getAttempts();

    public void setAttempts(List<Attempt> attempts);

}
