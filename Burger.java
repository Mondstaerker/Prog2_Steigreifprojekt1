public class Burger {
    
    private String name;
    private Zutat[] zutaten;
    private int zutatenmenge;

    public Burger(String name) {
        this.name = name;
        zutaten = new Zutat[Burgerladen.MAXIMALE_ZUTATEN];
        zutatenmenge = 0;
    }

    public void zutatHinzufuegen(Zutat zutat) {
        if(zutatenmenge < Burgerladen.MAXIMALE_ZUTATEN) {
            System.out.println(zutat.getName() + " wurde hinzugefügt");
            zutaten[zutatenmenge] = zutat;
            zutatenmenge++;
        } else {
            System.out.println("Maximale Anzahl Zutaten erreicht");
        }
    }

    public boolean istKlassisch() {
        for (Zutat zutat : zutaten) {
            if(!zutat.istKlassisch()) {
                return false;
            }
        }
        return true;
    }

    public float berechnePreis() {
        float preis = 0;
        for (Zutat zutat : zutaten) {
            preis += zutat.getPreis();
        } 
        return preis;
    }

    public String toString() {
        String burger = getName() + ":";
        for(int i = 0; i < zutatenmenge; i++) {
            burger = burger.concat(zutaten[i].getName());
        }
        return burger;
    }

    public int getZutatenmenge() {
        return zutatenmenge;
    }

    public String getName() {
        return name;
    }
}
