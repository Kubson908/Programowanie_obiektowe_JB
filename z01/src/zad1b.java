import java.util.Scanner;
import java.lang.Math;
public class zad1b {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        double wynikB = 1;
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 1; i <= n; i++){
            double x = scanner.nextDouble();
            wynikB *= x;
        }
        System.out.println(wynikB);
    }
}
