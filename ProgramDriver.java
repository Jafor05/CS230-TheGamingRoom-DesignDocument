public class ProgramDriver {
    public static void main(String[] args) {
        GameService gameService = GameService.getInstance();

        // Add a new game
        Game game = gameService.addGame("Draw It or Lose It");

        // Add teams to the game
        Team team1 = gameService.addTeam(game, "Team A");
        Team team2 = gameService.addTeam(game, "Team B");

        // Add players to teams
        gameService.addPlayer(team1, "Alice");
        gameService.addPlayer(team1, "Bob");
        gameService.addPlayer(team2, "Charlie");
        gameService.addPlayer(team2, "David");

        // Display game details
        System.out.println("Game: " + game.getName());
        for (Team team : game.getTeams()) {
            System.out.println("  Team: " + team.getName());
            for (Player player : team.getPlayers()) {
                System.out.println("    Player: " + player.getName());
            }
        }
    }
}
