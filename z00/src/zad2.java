import java.util.Scanner;
import java.lang.Math;
public class zad2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        for(int i = 1; i <= 10; i++){
            suma += i;
        }
        System.out.print("Suma pierwszych 10 liczb calkowitych dodatnich: " + suma);
    }
}