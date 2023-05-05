public class Menu {
    
    private Zutat[] meineZutaten;
    private int letzteZutat;

    public Menu(int laenge) {
        meineZutaten = new Zutat[18];
        letzteZutat = 0;
    }

    public void menuAusgeben() {
        for (Zutat zutat : meineZutaten) {
            if(zutat != null) {
                System.out.println(zutat.toString());
            }
        }
    }
    
    public void zutatHinzufuegen(Zutat zutat) {
        meineZutaten[letzteZutat] = zutat;
        letzteZutat++;
    }

    public Zutat getZutat(int nummer) {
        for(Zutat zutat : meineZutaten) {
            if(zutat.getNummer() == nummer) {
                return zutat;
            }
        }
        return null;
    }
}
