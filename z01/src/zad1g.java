import java.util.Scanner;
import java.lang.Math;
public class zad1g {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        double wynikG1 = 0;
        double wynikG2 = 1;
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 1; i <= n; i++){
            double x = scanner.nextDouble();
            wynikG1 += x;
            wynikG2 *= x;
        }
        System.out.println(wynikG1);
        System.out.println(wynikG2);
    }
}
