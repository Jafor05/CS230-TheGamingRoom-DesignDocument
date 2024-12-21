package gameapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameService {
    // Step 1: Singleton instance of GameService
    private static GameService instance;

    // Attributes
    private List<Game> games; // List to hold Game objects
    private static long nextGameId = 1; // Track next unique ID

    // Step 2: Private constructor for singleton pattern
    private GameService() {
        games = new ArrayList<>(); // Initialize the list
    }

    // Step 3: Singleton pattern - getInstance method
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService(); // Creates the instance if none exists
        }
        return instance; // Returns the single instance
    }

    // Iterator pattern - addGame method to check for duplicates
    public Game addGame(String name) {
        for (Game game : games) {
            if (game.getName().equals(name)) {
                System.out.println("Game with this name already exists.");
                return null; // Game with this name already exists
            }
        }
        Game newGame = new Game(nextGameId++, name);
        games.add(newGame);
        return newGame;
    }

    // Retrieve game by index
    public Game getGame(int index) {
        if (index >= 0 && index < games.size()) {
            return games.get(index);
        }
        return null;
    }

    // Retrieve game by name
    public Game getGame(String name) {
        for (Game game : games) {
            if (game.getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    // Get the count of games
    public int getGameCount() {
        return games.size();
    }
}
