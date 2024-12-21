package gameapp;

public class Game {
    // Attributes
    private long id;
    private String name;

    // Constructor
    public Game(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // String representation
    @Override
    public String toString() {
        return "Game ID: " + id + ", Name: " + name;
    }
}
