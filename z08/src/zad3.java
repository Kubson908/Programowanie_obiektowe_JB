import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) throws FileNotFoundException {
        String name = args[0];
        File plik = new File(name);
        ArrayList<String> line = new ArrayList<>();
        Scanner scanner = new Scanner(plik);
        while (scanner.hasNextLine()) {
            line.add(scanner.nextLine());
        }
        for (String i : line) {
            System.out.println(i);
        }
        System.out.println();
        line.sort(String::compareTo);
        for (String i : line) {
            System.out.println(i);
        }

    }
}
