import java.util.HashMap;
import java.util.Map;

public class GameService {
    private static GameService instance;
    private Map<Integer, Game> games;
    private int gameIdCounter = 1;
    private int teamIdCounter = 1;
    private int playerIdCounter = 1;

    private GameService() {
        games = new HashMap<>();
    }

    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    public Game addGame(String name) {
        for (Game game : games.values()) {
            if (game.getName().equalsIgnoreCase(name)) {
                throw new IllegalArgumentException("Game name must be unique.");
            }
        }
        Game game = new Game(gameIdCounter++, name);
        games.put(game.getId(), game);
        return game;
    }

    public Team addTeam(Game game, String teamName) {
        for (Team team : game.getTeams()) {
            if (team.getName().equalsIgnoreCase(teamName)) {
                throw new IllegalArgumentException("Team name must be unique.");
            }
        }
        Team team = new Team(teamIdCounter++, teamName);
        game.addTeam(team);
        return team;
    }

    public Player addPlayer(Team team, String playerName) {
        Player player = new Player(playerIdCounter++, playerName);
        team.addPlayer(player);
        return player;
    }

    public Game getGame(int id) {
        return games.get(id);
    }
}
