import java.util.Scanner;

public class KoffieZwart extends WarmeDrank{

    public KoffieZwart() {
        super("Zwarte Koffie", 2.5);
    }

    @Override
    public String getOrderline() {
        Scanner scanner = new Scanner(System.in);
        String orderline =  "";
        return orderline;
    }
}
