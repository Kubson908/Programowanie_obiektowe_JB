import java.util.Scanner;
import java.lang.String;
public class zad1h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String s = scanner.nextLine();
        System.out.print("Podaj separator: ");
        char c = scanner.next().charAt(0);
        System.out.print("Podaj liczbe pozycji miedzy wystapieniami separatora: ");
        int p = scanner.nextInt();
        System.out.println("Napis po modyfikacji: " + nice(s, c, p)); //a
    }

    public static String nice(String str, char sep, int pos) {
        StringBuffer str2 = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            if((str.length()-i)%pos == 0 && i != 0) {
                str2.append(sep);
            }
            str2.append(str.charAt(i));
        }
        return str2.toString();
    }
}