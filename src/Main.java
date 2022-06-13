import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KassaConnection kassaConnection = new GraanVoorVisch();
        ArrayList<Keuze> keuzes = new ArrayList<>();

        keuzes.add(new KeuzeMaakProductGroep());
        keuzes.add(new KeuzeZoekJuisteTafel());
        keuzes.add(new KeuzeWarmeDrankOpnemen());
        toonMenu();
        int gemaakteKeuze = maakKeuze();

        keuzes.get(gemaakteKeuze - 1).maakKeuze();
        }

    private static int maakKeuze(){
        Scanner scanner = new Scanner(System.in);
        int keuze = scanner.nextInt();

        //keuze kan alleen tussen 1 en 2
        while (keuze < 1 || keuze > 3) {
            System.out.println("kies 1, 2 of 3");
            keuze = scanner.nextInt();
        }
        return keuze;
    }

    private static void toonMenu(){
        System.out.println("Welk menu wilt u openen: (Voer het getal in)");
        System.out.println("1. Productgroepen aanmaken");
        System.out.println("2. Tafel zoeken");
        System.out.println("3. Warme Drank bestellen");
    }
}

