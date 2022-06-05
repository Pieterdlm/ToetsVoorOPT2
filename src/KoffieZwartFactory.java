public class KoffieZwartFactory extends WarmeDrankFactory{
    @Override
    public WarmeDrank maakWarmeDrank() {
        return new KoffieZwart();
    }
}
