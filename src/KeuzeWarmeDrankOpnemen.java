public class KeuzeWarmeDrankOpnemen extends Keuze{

    WerkInfo werkInfo = new WerkInfo(false, 2016, 2, false);
    Gebruiker gebruiker = new Gebruiker("Sjaak de Beheerder", 2222, werkInfo);

    @Override
    void maakKeuze() {
        gebruiker.WarmeDrankOpnemen();
    }
}
