public class Broetchen extends Zutat{
    
    private int backzeit;
    private int hoehe;

    public Broetchen(int nummer, String name, float preis, boolean vegetarisch, boolean vegan, int backzeit, int hoehe) {
        super(nummer, name, preis, false, vegetarisch, vegan); // Brtöchen sind nie klassisch, sondern mindestens vegetarisch!
        this.backzeit = backzeit;
        this.hoehe = hoehe;
    }

    
    /** 
     * @return float
     */
    public float berechneHoehe() {
        return hoehe;
    }

}
