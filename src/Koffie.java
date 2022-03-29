public class Koffie extends Product {
    private boolean isMetSuiker;
    private boolean ismetMelk;
    private boolean ismetKoekje;
    private int productID;
    private static int initialKoffieNum = 2000; //2000 nummers zijn allemaal koffie producten

    //constructor van childclass Koffie met als parentclass Product
    public Koffie(String productNaam, double productPrijs, boolean isMetSuiker, boolean ismetMelk, boolean ismetKoekje) {
        super(productNaam, productPrijs);
        this.isMetSuiker = isMetSuiker;
        this.ismetMelk = ismetMelk;
        this.ismetKoekje = ismetKoekje;
        this.productID = maakProductID();
    }

    @Override
    public int maakProductID(){
        productID = initialKoffieNum++;
        return productID;
    }

    public void setIsmetKoekje(boolean ismetKoekje) {
        this.ismetKoekje = ismetKoekje;
    }

    public void setIsmetMelk(boolean ismetMelk) {
        this.ismetMelk = ismetMelk;
    }

    public void setMetSuiker(boolean metSuiker) {
        isMetSuiker = metSuiker;
    }
}
