public class Bestellliste {
    
    private Burger[] meineBurger;
    private final int MAXIMALE_BURGER = 10;
    private int bestellteBurger;

    public Bestellliste() {
        meineBurger = new Burger[MAXIMALE_BURGER];
        bestellteBurger = 0;
    }

    public void burgerHinzufuegen(Burger burger) {
        meineBurger[bestellteBurger] = burger;
        bestellteBurger++;
    }

    public void bestellungenAusgeben() {

        for (int i = 0; i < meineBurger.length; i++) {
            if(meineBurger[i] != null) {
                System.out.println(i + meineBurger[i].toString());   
            }
        }

    }

}
