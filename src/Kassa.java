
import java.util.ArrayList;

abstract public class Kassa {
    //------------------- Verwijderen -------------------
    private ArrayList<Product> alleProducten = maakProductAL();
    private ArrayList<WarmeDrank> warmeDranken = warmeDrankenAL();
    private ProductGroep productGroep;
    Gebruiker gebruiker = new Gebruiker("Sjaak", 2222, false, 2016, 2, false);


    public static ArrayList<Product> maakProductAL() {
        ArrayList<Product> alleProducten = new ArrayList<>();
        alleProducten.add(new Bier("Warsteiner Fluitje", 2.50, "Pilsener", 0.2));
        alleProducten.add(new Bier("Warsteiner Vaasje", 3.00, "Pilsener", 0.3));
        alleProducten.add(new Bier("Pater Linus", 4.25, "Blond", 0.3));

        alleProducten.add(new Wijn("Glas Chardonnay", 4.00, "Wit"));
        alleProducten.add(new Wijn("Glas Sauvignon", 4.00, "Wit"));
        alleProducten.add(new Wijn("Glas Merlot", 4.00, "Rood"));

        alleProducten.add(new Snack("Appeltaart", 3.75, "Zonder Slagroom"));
        alleProducten.add(new Snack("Red Velvet", 4.00, "Met aardbei"));
        alleProducten.add(new Snack("bitterballen", 6.35, "Met mosterd"));
        return alleProducten;
    }

    public static ArrayList<WarmeDrank> warmeDrankenAL() {
        ArrayList<WarmeDrank> warmeDranken = new ArrayList<>();

        WarmeDrank koffieZwart = KoffieZwartFactory.KOFFIE_ZWART_FACTORY.maakWarmeDrank();
        warmeDranken.add(koffieZwart);
        koffieZwart = WarmeDrankFactory.KOFFIE_ZWART_FACTORY.maakWarmeDrank();
        koffieZwart.addToevoegingen(new Suiker());
        koffieZwart.addToevoegingen(new MelkCupje());
        koffieZwart.addToevoegingen(new Koekje());
        warmeDranken.add(koffieZwart);

        WarmeDrank cappuccino = CappuccinoFactory.CAPPUCCINO_FACTORY.maakWarmeDrank();
        warmeDranken.add(cappuccino);
        cappuccino = CappuccinoFactory.CAPPUCCINO_FACTORY.maakWarmeDrank();
        cappuccino.addToevoegingen(new Melk());
        cappuccino.addToevoegingen(new Suiker());
        cappuccino.addToevoegingen(new Koekje());
        warmeDranken.add(cappuccino);

        WarmeDrank koffieVerkeerd = KoffieVerkeerdFactory.KOFFIE_VERKEERD_FACTORY.maakWarmeDrank();
        warmeDranken.add(koffieVerkeerd);
        koffieVerkeerd = KoffieVerkeerdFactory.KOFFIE_VERKEERD_FACTORY.maakWarmeDrank();
        koffieVerkeerd.addToevoegingen(new Melk());
        koffieVerkeerd.addToevoegingen(new Suiker());
        koffieVerkeerd.addToevoegingen(new Koekje());
        warmeDranken.add(koffieVerkeerd);

        WarmeDrank thee = TheeFactory.THEE_FACTORY.maakWarmeDrank();
        warmeDranken.add(thee);
        thee = TheeFactory.THEE_FACTORY.maakWarmeDrank();
        thee.addToevoegingen(new Suiker());
        thee.addToevoegingen(new Koekje());
        warmeDranken.add(thee);

        WarmeDrank muntThee = MuntTheeFactory.MUNT_THEE_FACTORY.maakWarmeDrank();
        warmeDranken.add(muntThee);
        muntThee = MuntTheeFactory.MUNT_THEE_FACTORY.maakWarmeDrank();
        muntThee.addToevoegingen(new Koekje());
        warmeDranken.add(muntThee);

        return warmeDranken;
    }

    public static ArrayList<Tafel> maakAlleTafels(){
        ArrayList<Tafel> alleTafels = new ArrayList<>();
        alleTafels.add(new Tafel(101));
        alleTafels.add(new Tafel(102));
        alleTafels.add(new Tafel(103));
        alleTafels.add(new Tafel(104));
        alleTafels.add(new Tafel(105));
        for (Tafel tafel : alleTafels){
            tafel.bestellingPlaatsen();
        }
        return alleTafels;
    }
}