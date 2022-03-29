public class Bier extends Product {
    private String soortBier;
    private double inhoud;
    private int productID;
    private static int initialBierNum = 4000; //4000 nummers zijn allemaal bieren

    //constructor van childclass Bier met als parentclass Product
    public Bier(String productNaam, double productPrijs, String soortBier, double inhoud) {
        super(productNaam, productPrijs);
        this.soortBier = soortBier;
        this.inhoud = inhoud;
        this.productID = maakProductID();
    }

    @Override
    public int maakProductID(){
        productID = initialBierNum++;
        return productID;
    }

    public String getSoortBier() {
        return soortBier;
    }

    public double getInhoud() {
        return inhoud;
    }
}
