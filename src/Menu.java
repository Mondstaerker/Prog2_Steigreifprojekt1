/**
 * Verwaltung der Zutaten 
 */

public class Menu {
    
    private Zutat[] meineZutaten;
    private int letzteZutat;

    public Menu(int laenge) {
        meineZutaten = new Zutat[18];
        letzteZutat = 0;
    }

    public void menuAusgeben() {
        for (Zutat zutat : meineZutaten) {
            switch(Integer.toString(zutat.getNummer())) {
                case "10":
                    System.out.println("\nBrötchen");
                    break;
                case "20":
                    System.out.println("\nBratlinge");
                    break;
                case "30":
                    System.out.println("\nSalate");
                    break;
                case "40":
                    System.out.println("\nGemüse");
                    break;
                case "50":
                    System.out.println("\nSaucen");
                    break;
                default:
                    break;
            }
            if(zutat != null) {
                System.out.println(zutat.toString());
            }
        }
    }
    
    
    /** 
     * @param zutat
     */
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
