import java.util.Scanner;

public class KoffieVerkeerd extends WarmeDrank{

    public KoffieVerkeerd() {
        super("Koffie Verkeerd", 2.8);
    }

    @Override
    public String getOrderline() {
        Scanner scanner = new Scanner(System.in);
        String orderline =  "";
        return orderline;
    }

}
