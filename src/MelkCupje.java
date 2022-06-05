import java.util.Scanner;

public class MelkCupje implements IToevoeging{

    @Override
    public String getNaam() {
        return "Bonbon";
    }

    @Override
    public String getOrderLine() {
        Scanner scanner = new Scanner(System.in);
        String orderline = "";
        System.out.println("Wilt u er een Melkcupje bij? j/n");
        if (scanner.nextLine().equals("j")){
            orderline += "+ Melkcupje\r\n";
        }
        return orderline;
    }
}
