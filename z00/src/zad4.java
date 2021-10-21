import java.util.Scanner;
import java.lang.Math;
public class zad4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000;
        for(int i = 1; i <= 3; i++){
            saldo *= 1.06;
            System.out.println("Saldo po " + i + " roku: " + saldo);
        }
    }
}