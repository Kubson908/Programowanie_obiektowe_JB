import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class zad3 {
    public static void main(String [] args) throws FileNotFoundException {
        String name = args[0];
        File f = new File(name);
        Scanner scanner = new Scanner(f);
        StringBuffer str = new StringBuffer();
        scanner.useDelimiter("\\Z");
        while(scanner.hasNextLine()) {
            str.append(scanner.nextLine());
        }
        String str2 = args[1];
        int count = 0;
        String str3 = str.toString();
        for(int i = 0; i<str3.length() - str2.length() + 1; i++){
            if(str3.substring(i, i+str2.length()).equals(str2)) count++;
        }
        System.out.println(count);
    }
}