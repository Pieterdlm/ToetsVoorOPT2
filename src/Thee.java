import java.util.Scanner;

public class Thee extends WarmeDrank {

    public Thee() {
        super("Thee", 2.5);
    }

    @Override
    public String getOrderline() {
        Scanner scanner = new Scanner(System.in);
        String orderline = "";

        System.out.println("Wat voor thee wilt u?");
        String theesmaak = scanner.nextLine();
        orderline += "Smaak: " + theesmaak + "\r\n";

        System.out.println("Wilt u honing bij de thee? j/n");
        if (scanner.nextLine().equals("j")) {
            orderline += "+ Honing\r\n";
        }
        return orderline;
        }
    }
