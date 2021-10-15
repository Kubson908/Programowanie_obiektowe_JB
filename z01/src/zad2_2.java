import java.util.Scanner;
public class zad2_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        double wynik = 0;
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 1; i <= n; i++){
            double x = scanner.nextDouble();
            if(x > 0) {
                wynik += x;
            }
        }
        wynik *= 2;
        System.out.println(wynik);
    }
}
