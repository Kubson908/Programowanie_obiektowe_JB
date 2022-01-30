package E1BartosiewiczJakub.Z2;

import java.util.ArrayList;

public class Test {
    public static void main (String[] args) {
        IntSequence s = IntSequence.of(3, 1, 4, 1, 5, 9);
        for (int i = 0; i < 15; i++) System.out.print(s.next() + " ");
        IntSequence s2 = IntSequence.squares(3);
        System.out.println();
        for (int i = 0; i < 10; i++) System.out.print(s2.next() + " ");
    }
}
