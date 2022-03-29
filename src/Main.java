import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gebruiker gebruiker = new Gebruiker("Sjaak de Beheerder", 2222, true);
        ProductGroep productGroep = new ProductGroep();
        Kassa kassa = new Kassa();

        //voor later gebruik
        Tafel tafel1 = new Tafel(101);
        Tafel tafel2 = new Tafel(102);
        Tafel tafel3 = new Tafel(103);
        Tafel tafel4 = new Tafel(104);
        Tafel tafel5 = new Tafel(105);

        //aanmaken van producten en ze vullen in een Arraylist van type Product
        kassa.maakProductAL();


        System.out.println("Ga verder als: (Voer het getal in)");
        System.out.println("1. Beheerder");
        System.out.println("2. Gebruiker");
        int keuze = scanner.nextInt();;

        //keuze kan alleen tussen 1 en 2
        while (keuze < 1 || keuze > 2){
            System.out.println("kies 1 of 2");
            keuze = scanner.nextInt();
        }

        //if verder als beheerder
        if (keuze == 1){
            if (gebruiker.getisBeheerder()) {
                productGroep.maakProductGroep();
            }
        }
        //if verder als gebruiker
        else if (keuze == 2){
            gebruiker.voerProductenIn();
        }

    }
}


