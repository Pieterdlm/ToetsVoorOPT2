import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gebruiker gebruiker = new Gebruiker("Sjaak de Beheerder", 2222, false, 2016, 2);
        ProductGroep productGroep = new ProductGroep();
        Kassa kassa = new Kassa();

        //voor later gebruik
        Tafel tafel1 = new Tafel(101);
        Tafel tafel2 = new Tafel(102);
        Tafel tafel3 = new Tafel(103);
        Tafel tafel4 = new Tafel(104);
        Tafel tafel5 = new Tafel(105);

        //aanmaken van producten en ze vullen in een Arraylist van type Product


        System.out.println("Welk menu wilt u openen: (Voer het getal in)");
        System.out.println("1. Productgroepen aanmaken");
        System.out.println("2. Producten invullen");
        int keuze = scanner.nextInt();


        //keuze kan alleen tussen 1 en 2
        while (keuze < 1 || keuze > 2) {
            System.out.println("kies 1 of 2");
            keuze = scanner.nextInt();
        }

        //if verder als beheerder
        if (keuze == 1) {
            if (gebruiker.MagProductGroepAanmaken(gebruiker.getJaarInDienstTreden(), gebruiker.getFunctieGroep(), gebruiker.getisBeheerder())) {
                productGroep.maakProductGroep();
            }
            else {
                System.out.println("U heeft geen toegang tot het aanmaken van Productgroepen.");}
        }
        //if verder als gebruiker
        if (keuze == 2) {
                gebruiker.voerProductenIn();
        }

        }
    }

