public class WerkInfo {
    private int jaarInDienstTreden;
    private int functieGroep;
    private final boolean isBeheerder;
    private boolean isTester;

    public WerkInfo(boolean isBeheerder, int jaarInDienstTreden, int functieGroep, boolean isTester) {
        this.isBeheerder = isBeheerder;
        this.jaarInDienstTreden = jaarInDienstTreden;
        this.functieGroep = functieGroep;
        this.isTester = isTester;
    }

    public boolean isTester() {
        return isTester;
    }

    public boolean isBeheerder() {
        return isBeheerder;
    }

    public boolean MagProductGroepAanmaken(Gebruiker gebruiker) {
        return (isBeheerder || (functieGroep == 2 && 2022 - jaarInDienstTreden > 4) || (isTester && functieGroep == 3));
    }


}
