import java.util.Scanner;
import java.lang.Math;
public class zad1i {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        double wynikI = 0;
        int silnia = 1;
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 1; i <= n; i++){
            double x = scanner.nextDouble();
            silnia *= i;
            wynikI += Math.pow(-1, i)*x/silnia;
        }
        System.out.println(wynikI);
    }
}
