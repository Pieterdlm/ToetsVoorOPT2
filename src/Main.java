import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gebruiker gebruiker = new Gebruiker("Sjaak de Beheerder", 2222, false, 2016, 2, false);
        ProductGroep productGroep = new ProductGroep();
        KassaConnection kassaConnection = new GraanVoorVisch();


        System.out.println("Welk menu wilt u openen: (Voer het getal in)");
        System.out.println("1. Productgroepen aanmaken");
        System.out.println("2. Tafel zoeken");
        System.out.println("3. Warme Drank bestellen");
        int keuze = scanner.nextInt();


        //keuze kan alleen tussen 1 en 2
        while (keuze < 1 || keuze > 3) {
            System.out.println("kies 1, 2 of 3");
            keuze = scanner.nextInt();
        }

        //if verder als beheerder
        if (keuze == 1) {
            if (gebruiker.MagProductGroepAanmaken(gebruiker.getJaarInDienstTreden(), gebruiker.getFunctieGroep(), gebruiker.getisBeheerder(), gebruiker.getIsTester())) {
                productGroep.maakProductGroep();
            }
            else {
                System.out.println("U heeft geen toegang tot het aanmaken van Productgroepen.");}
        }
        //if verder als gebruiker
        if (keuze == 2) {
            ArrayList<Tafel> alleTafels = kassaConnection.alleTafels();
            for (Tafel tafel : alleTafels){
                tafel.bestellingPlaatsen();
            }
                gebruiker.zoekJuisteTafel();

        }
        if (keuze == 3){
            gebruiker.WarmeDrankOpnemen();
        }
    }
}

