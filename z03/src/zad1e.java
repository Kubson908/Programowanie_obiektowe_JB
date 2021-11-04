import java.util.Scanner;
import java.lang.String;
public class zad1e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        String s = scanner.nextLine();
        System.out.print("Podaj drugi napis: ");
        scanner = new Scanner(System.in);
        String s2 = scanner.nextLine();
        int[] tab = where(s, s2);
        System.out.print("Indeksy na ktorych wystepuje napis 2: " + tab[0]);
        for(int i = 1; i < tab.length; i++){
            System.out.print(", " + tab[i]);
        }
    }

    public static int[] where(String str, String subStr){
        int[] tab = new int[zad1b.countSubStr(str, subStr)];
        int j = 0;
        for (int i = 0; i <= str.length()-subStr.length(); i++) {
            if (str.substring(i, (i + subStr.length())).equals(subStr)) {
                tab[j] = i;
                j++;
            }
        }
        return tab;
    }
}