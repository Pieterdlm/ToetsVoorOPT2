import java.util.Scanner;

public class MuntThee extends WarmeDrank{

    public MuntThee() {
        super("MuntThee", 2.75);
    }

    @Override
    public String getOrderline() {
        Scanner scanner = new Scanner(System.in);
        String orderline =  "";
        System.out.println("Wilt u er een schijfje citroen in? j/n");
        if (scanner.nextLine().equals("j")){
            orderline += "+ Schijfje Citroen\r\n";
        }
        return orderline;
    }

}
