package gameapp;

public class SingletonTester {
    public void testSingleton() {
        // Access Singleton instance
        GameService service1 = GameService.getInstance();
        GameService service2 = GameService.getInstance();

        // Check if only one instance is created
        System.out.println("Are both instances the same? " + (service1 == service2));

        // Test adding games
        service1.addGame("Adventure");
        service1.addGame("Puzzle");
        service1.addGame("Adventure"); // Duplicate, should be prevented

        // Display all games
        for (int i = 0; i < service1.getGameCount(); i++) {
            System.out.println(service1.getGame(i));
        }
    }
}
