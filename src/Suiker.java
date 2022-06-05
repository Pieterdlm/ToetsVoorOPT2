import java.util.Scanner;

public class Suiker implements IToevoeging{
    @Override
    public String getNaam() {
        return "Suiker";
    }

    @Override
    public String getOrderLine() {
        Scanner scanner = new Scanner(System.in);
        String orderline = "";
        System.out.println("Wilt u er suiker bij? j/n");
        if (scanner.nextLine().equals("j")){
            orderline += "+ Suiker\r\n";
        }
        return orderline;
    }
}

//        String orderline = "";
//        System.out.println("Wilt u er een Bonbon bij? j/n");
//        if (scanner.nextLine().equals("j")){
//            orderline += "+ Bonbon\r\n";
//        }
//        return orderline;