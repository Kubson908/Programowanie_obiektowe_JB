import java.util.Scanner;
public class zad2_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        double min = 0, max = 0;
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 1; i <= n; i++){
            double x = scanner.nextDouble();
            if(i == 1){
                min = x;
                max = x;
            }
            else if(x > max){
                max = x;
            }
            else if(x < min){
                min = x;
            }
        }
        System.out.print("Najmniejsza liczba: ");
        System.out.println(min);
        System.out.print("Najwieksza liczba: ");
        System.out.println(max);
    }
}
