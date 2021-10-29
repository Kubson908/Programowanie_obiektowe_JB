import java.util.Scanner;
import java.lang.String;
public class zad1c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String s = scanner.nextLine();
        System.out.println("Srodek napisu: " + middle(s));
    }

    public static String middle(String str) {
        String mid = "";
        if (str.length() % 2 == 0) {
            return str.substring((str.length() / 2 - 1), str.length() / 2 + 1);
        } else {
            mid += (str.charAt(str.length() / 2));
            return mid;
        }
    }
}