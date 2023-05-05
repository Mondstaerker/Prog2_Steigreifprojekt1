import javax.management.loading.MLet;

public class Burgerladen {

    public static final int MAXIMALE_ZUTATEN = 9;
    public static final int MAXIMALE_BURGER = 10;

    private static String eingabe;
    private static Menu menu;
    private static Bestellliste meineBestellungen;
    private static boolean laufend;

    public Burgerladen() {

        menu = new Menu(16);

        menu.zutatHinzufuegen(new Broetchen(10, "Hamburger (Standard)", 0.85f, true, false, 90, 27));
        menu.zutatHinzufuegen(new Broetchen(11, "Hamburger Sesam", 0.95f, true, false, 90, 28));
        menu.zutatHinzufuegen(new Broetchen(13, "Vegan-Brötchen", 0.55f, false, true, 240, 34));
        menu.zutatHinzufuegen(new Broetchen(14, "Ciabatta", 0.45f, true, false, 330, 41));

        menu.zutatHinzufuegen(new Bratling(20, "Rindfleisch (Original)", 1.85f, true, false, false, 270, 25));
        menu.zutatHinzufuegen(new Bratling(21, "Hähnchenfleisch gegrillt", 1.15f, true, false, false, 180, 11));
        menu.zutatHinzufuegen(new Bratling(22, "Falafel-Bratling", 1.45f, false, false, true, 210, 21));
        menu.zutatHinzufuegen(new Bratling(23, "Gemüse-Bratling", 1.75f, false, true, false, 240, 25));

        menu.zutatHinzufuegen(new Salat(30, "Eisbergsalat", 0.18f));
        menu.zutatHinzufuegen(new Salat(31, "Rucolasalat", 0.25f));

        menu.zutatHinzufuegen(new Gemuese(40, "Tomate", 0.25f));
        menu.zutatHinzufuegen(new Gemuese(41, "Salzgurke", 0.15f));
        menu.zutatHinzufuegen(new Gemuese(42, "Rote Zwiebelringe", 0.08f));
        menu.zutatHinzufuegen(new Gemuese(43, "Jalapeno-Ringe", 0.08f));

        menu.zutatHinzufuegen(new Sauce(50, "Ketchup", 0.10f, false, false, true, 5, "normal"));
        menu.zutatHinzufuegen(new Sauce(51, "Sandwich-Sauce", 0.15f, false, true, false, 10, "normal"));
        menu.zutatHinzufuegen(new Sauce(52, "Chili-Sauce", 0.25f, false, false, true, 8, "scharf"));
        menu.zutatHinzufuegen(new Sauce(52, "Honig-Senf-Sauce", 0.25f, false, true, false, 8, "süß"));

        meineBestellungen = new Bestellliste();

    }

    public static void burgerErstellen() {
        String name;
        System.out.println("Wie soll der Burger heißen?");
        name = StaticScanner.nextString();
        Burger burger = new Burger(name);
        meineBestellungen.burgerHinzufuegen(burger);
        zutatenlisteErstellen(burger);
        System.out.println("Fertiggestellter Burger:");
        System.out.println(burger.toString());
    }

    public static void zutatenlisteErstellen(Burger burger) {
        int eingabe;
        Zutat zutat;
        do {
            System.out.println("Zutat-Nr. eingeben: ('0' stellt den Burger fertig)");
            eingabe = StaticScanner.nextInt();
            if(eingabe == 0) {
                System.out.println("Zutatenliste wird fertiggestellt.");
                return;
            } else {
                zutat = menu.getZutat(eingabe);
                if(zutat != null) {
                    burger.zutatHinzufuegen(zutat);
                }
                System.out.println("Keine gültige Zutat-Nr.");
            }
        } while(burger.getZutatenmenge() < MAXIMALE_ZUTATEN);
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