public class Burger {
    
    private String name;
    private Zutat[] zutaten;
    private int zutatenmenge;

    public Burger(String name) {
        this.name = name;
        zutaten = new Zutat[Burgerladen.MAXIMALE_ZUTATEN];
        zutatenmenge = 0;
    }

    
    /** 
     * @param zutat
     */
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

    public String typBerechnen() {
        // Ist eine Zutat klassisch, ist der gesamte Burger klassisch
        for(Zutat zutat : zutaten) {
            if(zutat != null) {
                if(zutat.istKlassisch()) {
                    return "klassisch";
                }
            }
        }
        // Ist eine Zutat vegetarisch, aber keine klassich, ist der Burger vegetarisch
        for(Zutat zutat : zutaten) {
            if(zutat != null) {
                if(zutat.istVegetarisch()) {
                    return "vegetarisch";
                }
            }
        }
        // Alle Zutaten sind vegan
        return "vegan";
    }

    public double berechnePreis() {
        float preis = 0;
        for (Zutat zutat : zutaten) {
            preis += zutat.getPreis();
        } 
        return preis;
    }

    public double berechneHoehe() {
        double hoehe = 0;
        for (Zutat zutat : zutaten) {
            if(zutat != null) {
                hoehe += zutat.berechneHoehe();
            }
        } 
        return hoehe;
    }

    public String berechneGeschmack() {
        String geschmack = "";
        for(Zutat zutat : zutaten) {
            if(zutat instanceof Sauce) {
                if(((Sauce)zutat).getGeschmack() != "normal") {
                    return ((Sauce)zutat).getGeschmack();
                }
            }
        }
        return geschmack;
    }

    public String toString() {
        String burger = getName() + " (" + berechneHoehe() + typBerechnen() + berechneGeschmack() +  ") " + ":\n";
        for(int i = 0; i < zutatenmenge; i++) {
            burger = burger.concat(zutaten[i].getName() + " ");
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
