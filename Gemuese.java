public class Gemuese extends Zutat {
    
    private int scheibenDicke;
    private int scheibenAnzahl;

    public Gemuese(int nummer, String name, float preis) {
        super(nummer, name, preis, false, false, true); // Gemüse ist immer vegan
    }

}
