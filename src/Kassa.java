import java.util.ArrayList;
import java.util.Scanner;

public class Kassa {
    private ArrayList<Product> alleProducten = maakProductAL();
    private ProductGroep productGroep;


    public ArrayList<Product> maakProductAL() {
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

        alleProducten.add(new Koffie("Cappucino", 2.70, true, false, true));
        alleProducten.add(new Koffie("Koffie", 2.50, true, true, true));
        alleProducten.add(new Koffie("Koffie Verkeerd", 2.75, true, false, true));
        return alleProducten;
    }
}
