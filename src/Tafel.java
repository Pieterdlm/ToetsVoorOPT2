public class Tafel {

    private int tafelNummer;
    private int aantalPersonen;

    public Tafel(int tafelNummer, int aantalPersonen) {
        this.tafelNummer = tafelNummer;
        this.aantalPersonen = aantalPersonen;
    }

    public int getGroepKorting(){
        if (aantalPersonen >= 20){
            return 20;
        }
        else if (aantalPersonen >= 10){
            return 10;
        }
        else {
            return 0;
        }
    }
}
