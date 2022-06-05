import java.util.Scanner;

public class Koekje implements IToevoeging{

    @Override
    public String getNaam() {
        return "Koekje";
    }

    public String getOrderLine() {
        Scanner scanner = new Scanner(System.in);
        String orderline = "";
        System.out.println("Wilt u er een koekje bij? j/n");
        if (scanner.nextLine().equals("j")){
            orderline += "+ Koekje\r\n";
        }
        return orderline;
    }

}
