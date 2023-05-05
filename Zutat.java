public class Zutat {
    
    private int nummer;
    private String name;
    private float preis;
    private boolean klassisch, vegetarisch, vegan;

    public Zutat(int nummer, String name, float preis, boolean klassisch, boolean vegetarisch, boolean vegan) {
        this.nummer = nummer;
        this.name = name;
        this.preis = preis;
        this.klassisch = klassisch;
        this.vegetarisch = vegetarisch;
        this.vegan = vegan;
    }

    public int zubereiten() {
        return 0;
    }

    public float berechneHoehe() {
        return 0;
    }

    public String toString() {
        return nummer + " | " + name + " | " + preis + " Euro";
    }

    public float getPreis() {
        return preis;
    }

    public boolean istKlassisch() {
        return klassisch;
    }

    public int getNummer() {
        return nummer;
    }

    public String getName() {
        return name;
    }

}
