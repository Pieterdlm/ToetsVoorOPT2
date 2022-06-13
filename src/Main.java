import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WerkInfo werkInfo = new WerkInfo(false, 2016, 2, false);
        Gebruiker gebruiker = new Gebruiker("Sjaak de Beheerder", 2222, werkInfo);
        ProductGroep productGroep = new ProductGroep();
        KassaConnection kassaConnection = new GraanVoorVisch();
        ArrayList<Tafel> alletafels = kassaConnection.alleTafels();

        System.out.println("Welk menu wilt u openen: (Voer het getal in)");
        System.out.println("1. Productgroepen aanmaken");
        System.out.println("2. Tafel zoeken");
        System.out.println("3. Warme Drank bestellen");

        int keuze = maakKeuze();

        switch (keuze){
            case 1:
                if (gebruiker.werkInfo.MagProductGroepAanmaken(gebruiker)) {
                    productGroep.maakProductGroep();
                }
                else {
                    System.out.println("U heeft geen toegang tot het aanmaken van Productgroepen.");}
                break;
            case 2:
                for (Tafel tafel : alletafels){
                    tafel.bestellingPlaatsen();
                }
                gebruiker.zoekJuisteTafel(alletafels);
                break;
            case 3:
                gebruiker.WarmeDrankOpnemen();
                break;
        }
    }

    public static int maakKeuze(){
        Scanner scanner = new Scanner(System.in);
        int keuze = scanner.nextInt();

        //keuze kan alleen tussen 1 en 2
        while (keuze < 1 || keuze > 3) {
            System.out.println("kies 1, 2 of 3");
            keuze = scanner.nextInt();
        }
        return keuze;
    }
}

