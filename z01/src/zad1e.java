import java.util.Scanner;
import java.lang.Math;
public class zad1e {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        double wynikE = 1;
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 1; i <= n; i++){
            double x = scanner.nextDouble();
            wynikE *= Math.abs(x);
        }
        System.out.println(wynikE);
    }
}
