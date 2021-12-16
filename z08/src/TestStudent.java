import pl.imiajd.bartosiewicz.Student;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<>();
        Student o1 = new Student("Kowalski", "1998-12-12", 4.50);
        Student o2 = new Student("Kowalski", "1995-10-20", 4.50);
        Student o3 = new Student("Nowak", "1998-12-12", 4.78);
        Student o4 = new Student("Bartosiewicz", "2001-01-14", 5.0);
        Student o5 = new Student("Kowalski", "1998-12-12", 4.50);
        grupa.add(o1);
        grupa.add(o2);
        grupa.add(o3);
        grupa.add(o4);
        grupa.add(o5);
        for (Student o : grupa) {
            System.out.println(o);
        }
        System.out.println();
        grupa.sort(Student::compareTo);
        for (Student o : grupa) {
            System.out.println(o);
        }
    }
}
