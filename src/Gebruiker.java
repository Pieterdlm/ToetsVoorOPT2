import java.util.ArrayList;
import java.util.Scanner;

public class Gebruiker {
    private String naam;
    private int code;
    private int jaarInDienstTreden;
    private int functieGroep;
    private final boolean isBeheerder;
    private Kassa kassa;
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

    public boolean MagProductGroepAanmaken(int jaarInDienstTreden, int functieGroep, boolean isBeheerder, boolean isTester){
        return (getisBeheerder()) || (getFunctieGroep() == 2 && 2022 - getJaarInDienstTreden() > 4) || (getIsTester() && (getFunctieGroep() == 3));
    }

    public boolean getisBeheerder() {
        return isBeheerder;
    }

    public void voerProductenIn() {
        kassa = new Kassa();
        ArrayList<Product> alleProducten = kassa.maakProductAL();
        ArrayList<Product> ingevoerdeProducten = new ArrayList<>();
        for (Product lijst : alleProducten) {
            System.out.println(lijst + "");
        }
        System.out.println("Welke product wilt u toevoegen:");
        System.out.println("U kunt kiezen uit bovenstaande producten:");

        String invoer = scanner.nextLine();

        for (int j = 0 ; j < 5 ;j++){
            for (Product product : alleProducten) {
                if (product.getProductNaam().equals(invoer)) {
                    ingevoerdeProducten.add(product);
                }
            }
            System.out.println("De lijst bevat de volgende producten:");
            for (Product product : ingevoerdeProducten){
                System.out.println(product);
            }
            System.out.println("U kunt nog een product toevoegen:");
            invoer = scanner.nextLine();
        }


    }

    public int getFunctieGroep() {
        return functieGroep;
    }

    public int getJaarInDienstTreden() {
        return jaarInDienstTreden;
    }

    public boolean getIsTester(){
        return isTester;
    }
}

