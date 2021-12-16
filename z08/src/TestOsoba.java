import pl.imiajd.bartosiewicz.Osoba;

import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>();
        Osoba o1 = new Osoba("Kowalski", "1998-12-12");
        Osoba o2 = new Osoba("Kowalski", "1995-10-20");
        Osoba o3 = new Osoba("Nowak", "1998-12-12");
        Osoba o4 = new Osoba("Bartosiewicz", "2001-01-14");
        Osoba o5 = new Osoba("Kowalski", "1998-12-12");
        grupa.add(o1);
        grupa.add(o2);
        grupa.add(o3);
        grupa.add(o4);
        grupa.add(o5);
        for (Osoba o : grupa) {
            System.out.println(o);
        }
        System.out.println();
        grupa.sort(Osoba::compareTo);
        for (Osoba o : grupa) {
            System.out.println(o);
        }
    }
}
