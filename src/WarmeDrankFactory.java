public abstract class WarmeDrankFactory {
    public static final CappuccinoFactory CAPPUCCINO_FACTORY = new CappuccinoFactory();
    public static final KoffieVerkeerdFactory KOFFIE_VERKEERD_FACTORY = new KoffieVerkeerdFactory();
    public static final MuntTheeFactory MUNT_THEE_FACTORY = new MuntTheeFactory();
    public static final KoffieZwartFactory KOFFIE_ZWART_FACTORY = new KoffieZwartFactory();
    public static final TheeFactory THEE_FACTORY = new TheeFactory();

    public abstract WarmeDrank maakWarmeDrank();
}
