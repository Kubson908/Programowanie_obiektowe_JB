// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII

// Program wykorzystujący zbiór typu HashSet
// w celu pokazania wszystkich słów odczytanych z System.in

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsInTreeSetDemo
{
    public static void main(String[] args) throws FileNotFoundException {
        // Klasa TreeSet implementuje interfejs dSet
        Set<String> words = new TreeSet<String>();
        long totalTime = 0;

        String name = args[0];
        File f = new File(name);
        Scanner scanner = new Scanner(f);
        while(scanner.hasNext()) {
            String word = scanner.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
    }
}
// 5908 unikalnych słów. 10 milisekund.