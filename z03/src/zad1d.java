import java.util.Scanner;
import java.lang.String;
public class zad1d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String s = scanner.nextLine();
        System.out.print("Podaj ile razy powtorzyc napis: ");
        int a = scanner.nextInt();
        System.out.println("Konkatenacja " + a + " kopii napisu: " + repeat(s, a)); //d
    }

    public static String repeat(String str, int n){
        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s.concat(str);
        }
        return s;
    }
}