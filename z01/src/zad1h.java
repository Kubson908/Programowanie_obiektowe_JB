import java.util.Scanner;
import java.lang.Math;
public class zad1h {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        double wynikH = 0;
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 1; i <= n; i++){
            double x = scanner.nextDouble();
            wynikH += x*Math.pow(-1, i+1);
        }
        System.out.println(wynikH);
    }
}
