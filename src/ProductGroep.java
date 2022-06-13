import java.util.ArrayList;
import java.util.Scanner;

public class ProductGroep {
    private String productGroepNaam;
    private ArrayList<Product> alleProductenInPG = new ArrayList<>();
    KassaConnection kassaConnection = new GraanVoorVisch();

    //Constructor van ProductGroep
    public ProductGroep(){}

    public ProductGroep(String productGroepNaam, ArrayList<Product> alleProductenInPG) {
        this.productGroepNaam = productGroepNaam;
        this.alleProductenInPG = alleProductenInPG;
    }

    public void maakProductGroep(){
        Scanner scanner = new Scanner(System.in);
        Tafel tafel = new Tafel(1);
        System.out.println("Geef de naam van de ProductGroep dat u wilt aanmaken:");
        productGroepNaam = scanner.nextLine();
        tafel.toonMenu();
        System.out.println("Voer het getal in van de producten die u toe wilt voegen, toets 0 in als u klaar bent");
        int index = scanner.nextInt();
        while (index > 0) {
            alleProductenInPG.add(kassaConnection.alleProducten().get(index - 1));
            index = scanner.nextInt();
        }
        System.out.println("Naam van de productgroep: " + productGroepNaam + "\r\nBevat de volgende producten:");
        for (Product product : alleProductenInPG){
            System.out.println(product + "");
        }
    }

}
