import java.util.Scanner;

public class Cappuccino extends WarmeDrank {

    public Cappuccino() {
        super("Cappuccino", 2.50);
    }

    @Override
    public String getOrderline() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat voor figuurtje wilt u in het melkschuim?");
        return "--- Figuurtje: " + scanner.nextLine() + " ---\r\n";
    }
}
