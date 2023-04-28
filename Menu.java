public class Menu {
    
    private Zutat[] meineZutaten;

    public Menu() {
        meineZutaten = new Zutat[3];

        meineZutaten[0] = new Broetchen("Mein Brötchen");
        meineZutaten[1] = new Sauce("Meine Sauce");
        meineZutaten[2] = new Bratling("Mein Bratling");

    }

    public void menuAusgeben() {
        for (Zutat zutat : meineZutaten) {
            System.out.println(zutat.toString());
        }
    }

}
