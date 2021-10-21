import java.util.Scanner;
import java.lang.Math;
public class zad3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int iloczyn = 1;
        for(int i = 1; i <= 10; i++){
            iloczyn *= i;
        }
        System.out.print("Iloczyn pierwszych 10 liczb calkowitych dodatnich: " + iloczyn);
    }
}