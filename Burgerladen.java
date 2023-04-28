public class Burgerladen {

    private static String eingabe;
    private static Menu menu;
    private static Bestellliste meineBestellungen;
    private static boolean laufend;

    public Burgerladen() {

        menu = new Menu();
        meineBestellungen = new Bestellliste();

    }

    public static void burgerErstellen() {
        String name;
        System.out.println("Wie soll der Burger heißen?");
        name = StaticScanner.nextString();
        Burger burger = new Burger(name);
        meineBestellungen.burgerHinzufuegen(burger);
    }

    public static void eingabeVerarbeiten(String eingabe) {
        switch(eingabe) {
            case "menu":
                System.out.println("Das ist das Menü:");
                menu.menuAusgeben();
                break;
            case "neuer Burger":
                System.out.println("Neuer Burger wird erstellt!");
                burgerErstellen();
                break;
            case "meine Burger":
                System.out.println("Das sind die aktuellen Bestellungen:");
                meineBestellungen.bestellungenAusgeben();
                break;
            case "beenden":
                System.out.println("Die Bestellung wird beendet");
                laufend = false;
                break;
            default:
                System.out.println(eingabe + " ist keine gültige Eingabe!");
                break;
        }
    }
    public static void main(String[] args) {

        Burgerladen meinLaden = new Burgerladen();
        laufend = true;

        while(laufend) {
            System.out.println("Geben Sie ein, was Sie tun möchten");
            eingabe = StaticScanner.nextString();
            eingabeVerarbeiten(eingabe);
        }
    }
}