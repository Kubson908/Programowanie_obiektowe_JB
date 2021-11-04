import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class zad2 {
    public static void main(String [] args) throws FileNotFoundException {
        String name = args[0];
        File f = new File(name);
        Scanner scanner = new Scanner(f);
        StringBuffer str = new StringBuffer();
        scanner.useDelimiter("\\Z");
        while(scanner.hasNextLine()) {
            str.append(scanner.nextLine());
        }
        char c = args[1].charAt(0);
        int count = 0;
        String str2 = str.toString();
        for(int i = 0; i<str2.length();i++) {
            if(str2.charAt(i) == c) count++;
        }
        System.out.println(count);
    }
}