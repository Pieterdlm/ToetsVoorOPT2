public class KeuzeWarmeDrankOpnemen extends Keuze{

    @Override
    void maakKeuze() {
        WerkInfo werkInfo = new WerkInfo(false, 2016, 2, false);
        Gebruiker gebruiker = new Gebruiker("Sjaak de Beheerder", 2222, werkInfo);
        gebruiker.WarmeDrankOpnemen();
    }
}
