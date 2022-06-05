abstract public class Product {
    private String productNaam;
    private double productPrijs;
    private static int initialNum = 1000;
    private int productID;

    //constructor van Product
    public Product(String productNaam, double productPrijs) {
        this.productNaam = productNaam;
        this.productPrijs = productPrijs;
        this.productID = maakProductID();
    }

    public int maakProductID(){
        productID = initialNum++;
        return productID;
    }

    public String getProductNaam() {
        return productNaam;
    }

    public double getProductPrijs() {
        return productPrijs;
    }

    @Override
    public String toString() {
        return
                "Product: " + productNaam + " --- Prijs: " + productPrijs + "";
    }
}
