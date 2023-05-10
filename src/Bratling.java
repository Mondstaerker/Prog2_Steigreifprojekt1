public class Bratling extends Zutat{
    
    private int bratzeit;
    private int hoehe;

    public Bratling(int nummer, String name, float preis, boolean klassisch, boolean vegetarisch, boolean vegan, int bratzeit, int hoehe) {
        super(nummer, name, preis, klassisch, vegetarisch, vegan);
        this.bratzeit = bratzeit;
        this.hoehe = hoehe;
    }

    
    /** 
     * @return float
     */
    public float berechneHoehe() {
        return hoehe;
    }

}
