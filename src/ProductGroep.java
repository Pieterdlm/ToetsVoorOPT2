import java.util.ArrayList;
import java.util.Scanner;

public class ProductGroep {
    private String productGroepNaam;
    private ArrayList<Product> alleProductenInPG;
    Kassa kassa = new Kassa();
    private ArrayList<Product> alleProducten = kassa.maakProductAL();

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
        for (int i = 0 ; i < witteWijnen.size(); i++){
            System.out.println(witteWijnen.get(i));
        }
    }

    public void maakProductGTaart() {
        ArrayList<Product> taarten = new ArrayList<>();
        taarten.add(alleProducten.get(6)); // Chardonnay
        taarten.add(alleProducten.get(7)); // Sauvignon
        ProductGroep taart = new ProductGroep("Taart", taarten);
        System.out.println("U heeft toegevoegd 'Taart' met de volgende producten:");
        for (int i = 0 ; i < taarten.size();i++) {
            System.out.println(taarten.get(i));
        }
    }

}
