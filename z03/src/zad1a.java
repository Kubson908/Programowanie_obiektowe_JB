import java.util.Scanner;
import java.lang.String;
public class zad1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String s = scanner.nextLine();
        System.out.print("Podaj znak: ");
        char c = scanner.next().charAt(0);
        System.out.println("Ilosc wystapien znaku w napisie: " + countChar(s, c)); //a
    }

    public static int countChar(String str, char c){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) counter++;
        }
        return counter;
    }
}