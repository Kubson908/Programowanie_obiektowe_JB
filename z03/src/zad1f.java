import java.util.Scanner;
import java.lang.String;

public class zad1f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String s = scanner.nextLine();
        System.out.println("Napis po zmianie: " + change(s)); //a
    }

    public static String change(String str) {
        StringBuffer str2 = new StringBuffer();
        for(int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) c = Character.toLowerCase(c);
            else if(Character.isLowerCase(c)) c = Character.toUpperCase(c);
            str2.append(c);
        }
        return str2.toString();
    }
}