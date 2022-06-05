public class TheeFactory extends WarmeDrankFactory{
    @Override
    public WarmeDrank maakWarmeDrank() {
        return new Thee();
    }
}
