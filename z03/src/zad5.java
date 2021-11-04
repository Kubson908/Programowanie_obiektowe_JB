import java.math.BigDecimal;
import java.math.RoundingMode;

public class zad5 {
    public static void main(String args[]) {
        double k = Double.parseDouble(args[0]);
        double p = Double.parseDouble(args[1]);
        double n = Double.parseDouble(args[2]);
        BigDecimal kn = BigDecimal.valueOf(k).multiply(BigDecimal.valueOf(Math.pow(1 + p/(100*k), n*k)));
        System.out.println(kn.setScale(2, RoundingMode.HALF_UP));
    }
}
