public class Zutat {
    
    private int nummer;
    private String name;
    private float preis;
    private boolean klassisch, vegetarisch, vegan;

    public Zutat(String name) {
        this.name = name;
    }

    public int zubereiten() {
        return 0;
    }

    public float berechneHoehe() {
        return 0;
    }

    public String toString() {
        return nummer + name;
    }

}
