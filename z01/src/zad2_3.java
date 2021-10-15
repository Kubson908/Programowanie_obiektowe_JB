import java.util.Scanner;
public class zad2_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        int dodatnie = 0, ujemne = 0, zera = 0;
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 1; i <= n; i++){
            double x = scanner.nextDouble();
            if(x > 0){
                dodatnie++;
            }
            else if(x<0){
                ujemne++;
            }
            else{
                zera++;
            }
        }
        System.out.print("Ilosc liczb dodatnich: ");
        System.out.println(dodatnie);
        System.out.print("Ilosc liczb ujemnych: ");
        System.out.println(ujemne);
        System.out.print("Ilosc zer: ");
        System.out.println(zera);
    }
}
