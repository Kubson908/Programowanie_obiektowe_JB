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


//        int[] tab = where(s, s2);
//        System.out.print("Indeksy na ktorych wystepuje napis 2: " + tab[0]);
//        for(int i = 1; i < tab.length; i++){
//            System.out.print(", " + tab[i]);
//        }
    }
    // 1a
    public static int countChar(String str, char c){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) counter++;
        }
        return counter;
    }
    //1c

    //1d

    //1e
//    public static int[] where(String str, String subStr){
//        int[] tab = new int[countSubStr(str, subStr)];
//        int j = 0;
//        for (int i = 0; i <= str.length()-subStr.length(); i++) {
//            if (str.substring(i, (i + subStr.length())).equals(subStr)) {
//                tab[j] = i;
//                j++;
//            }
//        }
//        return tab;
//    }
}