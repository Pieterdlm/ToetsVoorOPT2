import java.util.ArrayList;

public class GraanVoorVisch implements KassaConnection{

    @Override
    public ArrayList<Product> alleProducten() {
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

    @Override
    public ArrayList<WarmeDrank> alleWarmeDranken() {
        ArrayList<WarmeDrank> warmeDranken = new ArrayList<>();

        WarmeDrank koffieZwart = KoffieZwartFactory.KOFFIE_ZWART_FACTORY.maakWarmeDrank();
        warmeDranken.add(koffieZwart);
        koffieZwart.addToevoegingen(new Suiker());
        koffieZwart.addToevoegingen(new MelkCupje());
        koffieZwart.addToevoegingen(new Koekje());

        WarmeDrank cappuccino = CappuccinoFactory.CAPPUCCINO_FACTORY.maakWarmeDrank();
        warmeDranken.add(cappuccino);
        cappuccino.addToevoegingen(new Melk());
        cappuccino.addToevoegingen(new Suiker());
        cappuccino.addToevoegingen(new Koekje());

        WarmeDrank koffieVerkeerd = KoffieVerkeerdFactory.KOFFIE_VERKEERD_FACTORY.maakWarmeDrank();
        warmeDranken.add(koffieVerkeerd);
        koffieVerkeerd.addToevoegingen(new Melk());
        koffieVerkeerd.addToevoegingen(new Suiker());
        koffieVerkeerd.addToevoegingen(new Koekje());

        WarmeDrank thee = TheeFactory.THEE_FACTORY.maakWarmeDrank();
        warmeDranken.add(thee);
        thee.addToevoegingen(new Suiker());
        thee.addToevoegingen(new Koekje());

        WarmeDrank muntThee = MuntTheeFactory.MUNT_THEE_FACTORY.maakWarmeDrank();
        warmeDranken.add(muntThee);
        muntThee.addToevoegingen(new Koekje());

        return warmeDranken;
    }

    @Override
    public ArrayList<Tafel> alleTafels() {
        ArrayList<Tafel> alleTafels = new ArrayList<>();
        alleTafels.add(new Tafel(101));
        alleTafels.add(new Tafel(102));
        alleTafels.add(new Tafel(103));
        //alleTafels.add(new Tafel(104));
        //alleTafels.add(new Tafel(105));
        return alleTafels;
    }
}
