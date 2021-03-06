import java.util.ArrayList;

public class KeuzeZoekJuisteTafel extends Keuze{

    @Override
    void maakKeuze() {
        WerkInfo werkInfo = new WerkInfo(false, 2016, 2, false);
        Gebruiker gebruiker = new Gebruiker("Sjaak de Beheerder", 2222, werkInfo);
        KassaConnection kassaConnection = new GraanVoorVisch();
        ArrayList<Tafel> alletafels = kassaConnection.alleTafels();
        for (Tafel tafel : alletafels){
            tafel.bestellingPlaatsen();
        }
        gebruiker.zoekJuisteTafel(alletafels);
    }
}
