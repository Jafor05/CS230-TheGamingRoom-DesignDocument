import java.util.ArrayList;
import java.util.List;

public class Game extends Entity {
    private List<Team> teams;

    public Game(int id, String name) {
        super(id, name);
        this.teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public List<Team> getTeams() {
        return teams;
    }
}
