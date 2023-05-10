public class Gemuese extends Zutat {
    
    private int scheibenAnzahl;
    private int scheibenDicke;

    public Gemuese(int nummer, String name, float preis, int scheibenAnzahl, int scheibenDicke) {
        super(nummer, name, preis, false, false, true); // Gemüse ist immer vegan
        this.scheibenAnzahl = scheibenAnzahl;
        this.scheibenDicke = scheibenDicke;
    }

    
    /** 
     * @return float
     */
    public float berechneHoehe() {
        return scheibenAnzahl * scheibenDicke;
    }

}
