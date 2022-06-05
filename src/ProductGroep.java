import java.util.ArrayList;
import java.util.Scanner;

public class ProductGroep {
    private String productGroepNaam;
    private ArrayList<Product> alleProductenInPG;
    KassaConnection kassaConnection = new GraanVoorVisch();
    private ArrayList<Product> alleProducten = kassaConnection.alleProducten();

    //Constructor van ProductGroep
    public ProductGroep(){

    }

    public ProductGroep(String productGroepNaam, ArrayList<Product> alleProductenInPG) {
        this.productGroepNaam = productGroepNaam;
        this.alleProductenInPG = alleProductenInPG;
    }

    public void maakProductGroep() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de naam van de ProductGroep dat u wilt aanmaken:");
        String naamVanPG = scanner.nextLine();
        if (naamVanPG.equals("Witte wijn")){
            maakProductGWitteWijn();
        }
        else if (naamVanPG.equals("Taart")){
            maakProductGTaart();
        }
    }

    public void maakProductGWitteWijn() {
        ArrayList<Product> witteWijnen = new ArrayList<>();
        witteWijnen.add(alleProducten.get(3)); // Chardonnay
        witteWijnen.add(alleProducten.get(4)); // Sauvignon
        ProductGroep witteWijn = new ProductGroep("Witte wijn", witteWijnen);
        System.out.println("U heeft toegevoegd 'Witte wijn' met de volgende producten:");
        for (Product product : witteWijnen){
            System.out.println(product);
        }
    }

    public void maakProductGTaart() {
        ArrayList<Product> taarten = new ArrayList<>();
        taarten.add(alleProducten.get(6));
        taarten.add(alleProducten.get(7));
        ProductGroep taart = new ProductGroep("Taart", taarten);
        System.out.println("U heeft toegevoegd 'Taart' met de volgende producten:");
        for (Product product : taarten){
            System.out.println(product);
        }
    }

}
