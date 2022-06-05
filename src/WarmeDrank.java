import java.util.ArrayList;

abstract public class WarmeDrank {
    private String productNaam;
    private double productPrijs;
    private int productID;
    private static int initialKoffieNum = 2000; //2000 nummers zijn allemaal koffie producten
    private ArrayList<IToevoeging> toevoegingen = new ArrayList<>();


    public WarmeDrank(String productNaam, double productPrijs) {
        this.productNaam = productNaam;
        this.productPrijs = productPrijs;
        this.productID = maakProductID();
    }

    public void addToevoegingen(IToevoeging toevoeging){
        toevoegingen.add(toevoeging);
    }

    public int maakProductID(){
        productID = initialKoffieNum++;
        return productID;
    }

    public abstract String getOrderline();

    public String getOrder(){
        String order = "\r\n**************************\r\n";
        order += "De bestelling: " + getProductNaam() + " €" + String.format("%.2f",getProductPrijs()) + "\r\n";
        order += getOrderline();

        for (IToevoeging toevoeging : toevoegingen){
            order += toevoeging.getOrderLine();
        }

        order += "**************************\r\n";
        return order ;
    }


    public String getProductNaam() {
        return productNaam;
    }

    public double getProductPrijs() {
        return productPrijs;
    }
}
