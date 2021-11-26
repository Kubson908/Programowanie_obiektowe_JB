import pl.imiajd.bartosiewicz.Nauczyciel;
import pl.imiajd.bartosiewicz.Osoba;
import pl.imiajd.bartosiewicz.Student;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Kowalski", 1995);
        Student s1 = new Student("Morawski", 1998, "Informatyka");
        Nauczyciel n1 = new Nauczyciel("Nowocinski", 1975, 3500);
        System.out.println(o1);
        System.out.println(s1);
        System.out.println(n1);
    }
}
