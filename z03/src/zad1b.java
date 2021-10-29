import java.util.Scanner;
import java.lang.String;
public class zad1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String s = scanner.nextLine();
        System.out.print("Podaj drugi napis: ");
        scanner = new Scanner(System.in);
        String s2 = scanner.nextLine();
        System.out.println("Ilosc wystapien napisu 2 w napisie 1: " + countSubStr(s, s2)); //b
    }
    public static int countSubStr(String str, String subStr){
        int counter = 0;
        for (int i = 0; i <= str.length()-subStr.length(); i++) {
            if (str.substring(i, (i + subStr.length())).equals(subStr)) counter++;
        }
        return counter;
    }
}