import java.util.ArrayList;
import java.util.Scanner;

public class Gebruiker {
    private String naam;
    private int code;
    private int jaarInDienstTreden;
    private int functieGroep;
    private final boolean isBeheerder;
    private boolean isTester;


    Scanner scanner = new Scanner(System.in);

    public Gebruiker(String naam, int code, boolean isBeheerder, int jaarInDienstTreden, int functieGroep, boolean isTester) {
        this.naam = naam;
        this.code = code;
        this.isBeheerder = isBeheerder;
        this.jaarInDienstTreden = jaarInDienstTreden;
        this.functieGroep = functieGroep;
        this.isTester = isTester;
    }

    public boolean MagProductGroepAanmaken(int jaarInDienstTreden, int functieGroep, boolean isBeheerder, boolean isTester) {
        return (getisBeheerder()) || (getFunctieGroep() == 2 && 2022 - getJaarInDienstTreden() > 4) || (getIsTester() && (getFunctieGroep() == 3));
    }

    public boolean getisBeheerder() {
        return isBeheerder;
    }


    public void WarmeDrankOpnemen() {
        ArrayList<WarmeDrank> warmeDranken = Kassa.warmeDrankenAL();

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

    public void zoekJuisteTafel(){
        ArrayList<Tafel> alleTafelsAL = Kassa.maakAlleTafels();
        String welkProduct = welkProduct();

        for (Tafel tafel : alleTafelsAL){
            ArrayList<Product> alleProductenOpTafel = tafel.getProducten();

            for (Product product : alleProductenOpTafel){
                if (product.getProductNaam().equals(welkProduct)){
                    System.out.println("******************************************");
                    System.out.println(product + "\r\nIs gevonden op tafel: " + tafel.getTafelNummer());
                    System.out.println("******************************************\r\n");
            }
            }
        }
    }

    public String welkProduct(){
        System.out.println("Naar welk Product bent u op zoek:");
        ArrayList<Product> alleProducten = Kassa.maakProductAL();
        for (Product product : alleProducten){
            System.out.println(product + "");
        }
        return scanner.nextLine();
    }


    public int getFunctieGroep() {
        return functieGroep;
    }

    public int getJaarInDienstTreden() {
        return jaarInDienstTreden;
    }

    public boolean getIsTester() {
        return isTester;
    }
}

