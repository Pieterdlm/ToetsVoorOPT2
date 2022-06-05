import java.util.Scanner;

public class Melk implements IToevoeging{

    @Override
    public String getNaam() {
        return "Melk";
    }

    public String getOrderLine() {
        Scanner scanner = new Scanner(System.in);
        String orderline =  "";
        System.out.println("Wilt u gewone melk of havermelk");
        System.out.println("1. Gewone melk");
        System.out.println("2. Havermelk");
        if (scanner.nextInt() == 1){
            orderline += "!!! gewone melk !!!\r\n";
        }
        else {
            orderline += "!!! havermelk !!!\r\n";
        }
        return orderline;
    }

}
