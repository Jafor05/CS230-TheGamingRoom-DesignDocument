import java.util.ArrayList;
import java.util.List;

public class Team extends Entity {
    private List<Player> players;

    public Team(int id, String name) {
        super(id, name);
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}
