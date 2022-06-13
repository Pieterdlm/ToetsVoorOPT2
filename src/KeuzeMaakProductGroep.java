public class KeuzeMaakProductGroep extends Keuze{

    WerkInfo werkInfo = new WerkInfo(false, 2016, 2, false);
    Gebruiker gebruiker = new Gebruiker("Sjaak de Beheerder", 2222, werkInfo);
    ProductGroep productGroep = new ProductGroep();

    @Override
    void maakKeuze() {
        if (gebruiker.werkInfo.MagProductGroepAanmaken(gebruiker)) {
            productGroep.maakProductGroep();
        }
        else {
            System.out.println("U heeft geen toegang tot het aanmaken van Productgroepen.");}
    }
}
