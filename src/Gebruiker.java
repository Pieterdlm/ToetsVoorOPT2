import java.util.ArrayList;
import java.util.Scanner;

public class Gebruiker {
    private String naam;
    private int code;
    WerkInfo werkInfo;

    private KassaConnection kassaConnection = new GraanVoorVisch();

    Scanner scanner = new Scanner(System.in);

    public Gebruiker(String naam, int code, WerkInfo werkInfo) {
        this.naam = naam;
        this.code = code;
        this.werkInfo = werkInfo;
    }

    public void WarmeDrankOpnemen() {
        ArrayList<WarmeDrank> warmeDranken = kassaConnection.alleWarmeDranken();

        System.out.println("Welke warme drank?");
        System.out.println("1. Zwarte Koffie");
        System.out.println("2. Cappuccino");
        System.out.println("3. Koffie Verkeerd");
        System.out.println("4. Thee");
        System.out.println("5. Verse Munt Thee");

        Scanner scanner = new Scanner(System.in);
        int keuze = scanner.nextInt();
        if (keuze > 0) {
            WarmeDrank warmeDrank = warmeDranken.get(keuze - 1);
            String order = warmeDrank.getOrder();
            System.out.println(order);
        }
    }

    public void zoekJuisteTafel(ArrayList<Tafel> alletafels){
        String welkProduct = welkProduct();
        ArrayList<Product> alleProductenOpTafel = new ArrayList<>();

        for (Tafel tafel : alletafels){ //5
            alleProductenOpTafel = tafel.getProducten();

            for (Product product : alleProductenOpTafel){
                if (product.getProductNaam().equals(welkProduct)){
                    System.out.println("******************************************");
                    System.out.println(product + "\r\nIs gevonden op tafel: " + tafel.getTafelNummer());
                    System.out.println("******************************************\r\n");
                }
            }
        }
    }

    private String welkProduct(){
        System.out.println("Naar welk Product bent u op zoek:");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        ArrayList<Product> alleProducten = kassaConnection.alleProducten();
        for (Product product : alleProducten){
            System.out.println(product + "");
        }
        return scanner.nextLine();
    }
}

