import java.util.ArrayList;
import java.util.Scanner;

public class Tafel {

    private int tafelNummer;
    private int aantalPersonen;
    private ArrayList<Product> producten = new ArrayList<>();
    KassaConnection kassaConnection = new GraanVoorVisch();

    public Tafel(int tafelNummer) {
        this.tafelNummer = tafelNummer;
    }

    private void toonMenu(){
        ArrayList<Product> alleProducten = kassaConnection.alleProducten();
        System.out.println("Het menu:");
        int teller = 1;
        for (Product product : alleProducten){
            System.out.println(teller + ") " + product + "");
            teller++;
        }
    }

    public void bestellingPlaatsen(){
        Scanner scanner = new Scanner(System.in);
        aantalPersonen = setAantalPersonen();
        toonMenu();
        System.out.println("Voer het getal in van de producten die u toe wilt voegen, toets 0 in als u klaar bent");
        int index = scanner.nextInt();
        while (index > 0) {
            producten.add(kassaConnection.alleProducten().get(index - 1));
            index = scanner.nextInt();
        }

        System.out.println("Tafel: " + tafelNummer + "\r\nAantal personen: " + aantalPersonen + "\r\nDe bestelde producten:");

        for (Product product : producten){
            System.out.println(product);
        }
        System.out.println();
    }

    private int setAantalPersonen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoeveel personen zitten er aan tafel?");
        aantalPersonen = scanner.nextInt();
        return aantalPersonen;
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
