public class Wijn extends Product {
    private String soortWijn;
    private int productID;
    private static int initialWijnNum = 6000; //6000 nummers zijn allemaal wijnen

    //constructor van childclass Wijn met als parentclass Product
    public Wijn(String productNaam, double productPrijs, String soortWijn) {
        super(productNaam, productPrijs);
        this.soortWijn = soortWijn;
        this.productID = maakProductID();
    }
    public int maakProductID(){
        productID = initialWijnNum++;
        return productID;
    }

    public String getSoortWijn() {
        return soortWijn;
    }
}
