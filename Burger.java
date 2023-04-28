public class Burger {
    
    private String name;
    private Zutat[] zutaten;
    private final int MAXIMALE_ZUTATEN = 9;

    public Burger(String name) {
        this.name = name;
        zutaten = new Zutat[MAXIMALE_ZUTATEN];
    }

    public String toString() {
        return name;
    }

}
