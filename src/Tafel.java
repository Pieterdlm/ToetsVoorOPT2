import java.util.ArrayList;
import java.util.Scanner;

public class Tafel {

    private int tafelNummer;
    private int aantalPersonen;
    private ArrayList<Product> producten = new ArrayList<>();

    public Tafel(int tafelNummer) {
        this.tafelNummer = tafelNummer;
    }

    public void bestellingPlaatsen(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> alleProducten = Kassa.maakProductAL();
        System.out.println("Hoeveel personen zitten er aan tafel?");
        aantalPersonen = scanner.nextInt();

        System.out.println("Het menu:");
        int teller = 1;
        for (Product product : alleProducten){
            System.out.println(teller + ") " + product + "");
            teller++;
        }
        int index;
        System.out.println("Voer het getal in van de producten die u toe wilt voegen, toets 0 in als u klaar bent");
        index = scanner.nextInt();
        while (index > 0) {
            producten.add(alleProducten.get(index - 1));
            index = scanner.nextInt();
        }

        System.out.println("Tafel:" + tafelNummer + "\r\nAantal personen: " + aantalPersonen + "\r\nDe bestelde producten:");

        for (Product product : producten){
            System.out.println(product);
        }
        System.out.println();
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    public ArrayList<Product> getProducten(){
        return producten;
    }

    public int getTafelNummer(){
        return tafelNummer;
    }

    public int getGroepKorting(){
        if (aantalPersonen >= 20){
            return 20;
        }
        else if (aantalPersonen >= 10){
            return 10;
        }
        else {
            return 0;
        }
    }
}
