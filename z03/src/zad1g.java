import java.util.Scanner;
import java.lang.String;
public class zad1g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String s = scanner.nextLine();
        System.out.println("Napis po modyfikacji: " + nice(s)); //a
    }

    public static String nice(String str) {
        StringBuffer str2 = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            if((str.length()-i)%3 == 0 && i != 0) {
                str2.append('\'');
            }
            str2.append(str.charAt(i));
        }
        return str2.toString();
    }
}