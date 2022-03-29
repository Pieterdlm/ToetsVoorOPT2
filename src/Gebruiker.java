import java.util.ArrayList;
import java.util.Scanner;

public class Gebruiker {
    private String naam;
    private int code;
    private boolean isBeheerder;
    private Kassa kassa;

    Scanner scanner = new Scanner(System.in);

    public Gebruiker(String naam, int code, boolean isBeheerder) {
        this.naam = naam;
        this.code = code;
        this.isBeheerder = isBeheerder;
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
            for (int i = 0; i < ingevoerdeProducten.size(); i++) {
                System.out.println(ingevoerdeProducten.get(i));

            }
            System.out.println("U kunt nog een product toevoegen:");
            invoer = scanner.nextLine();
        }


    }
}

