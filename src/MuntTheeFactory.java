public class MuntTheeFactory extends WarmeDrankFactory{
    @Override
    public WarmeDrank maakWarmeDrank() {
        return new MuntThee();
    }
}
