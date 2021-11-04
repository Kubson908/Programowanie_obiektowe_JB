import java.math.BigInteger;
public class zad4 {
    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        BigInteger sum = BigInteger.valueOf(1);
        int temp = 1;
        for (int i = 2; i <= n*n; i++){
            sum = sum.add(BigInteger.valueOf(temp*2));
            temp *= 2;
        }
        System.out.println(sum);
    }
}