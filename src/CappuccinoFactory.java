public class CappuccinoFactory extends WarmeDrankFactory{
    @Override
    public WarmeDrank maakWarmeDrank() {
        return new Cappuccino();
    }
}
