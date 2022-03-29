public class Snack extends Product {
    private String toevoeging;
    private int productID;
    private static int initialSnackNum = 5000; //5000 nummers zijn allemaal snacks

    //constructor van childclass Snack met als parentclass Product
    public Snack(String productNaam, double productPrijs, String toevoeging) {
        super(productNaam, productPrijs);
        this.toevoeging = toevoeging;
        this.productID = maakProductID();
    }
    public int maakProductID(){
        productID = initialSnackNum++;
        return productID;
    }

    public void setToevoeging(String toevoeging) {
        this.toevoeging = toevoeging;
    }

}


