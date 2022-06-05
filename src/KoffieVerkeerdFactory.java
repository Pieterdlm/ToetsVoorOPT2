public class KoffieVerkeerdFactory extends WarmeDrankFactory{
    @Override
    public WarmeDrank maakWarmeDrank() {
        return new KoffieVerkeerd();
    }
}
