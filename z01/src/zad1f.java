import java.util.Scanner;
import java.lang.Math;
public class zad1f {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        double wynikF = 0;
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 1; i <= n; i++){
            double x = scanner.nextDouble();
            wynikF += Math.pow(x, 2);
        }
        System.out.println(wynikF);
    }
}
