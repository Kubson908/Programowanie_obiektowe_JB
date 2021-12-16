package pl.imiajd.bartosiewicz;

public class Student extends Osoba {
    private double sredniaOcen;

    public Student(String nazwisko, String dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public int compareTo(Student o) {
        if (super.compareTo(o) < 0) return -1;
        else if (super.compareTo(o) > 0) return 1;
        else {
            return Double.compare(this.sredniaOcen, o.sredniaOcen);
        }
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public String toString() {
        return "Student " + " [" + this.getNazwisko() + "] [" + this.getDataUrodzenia() + "] [" + this.sredniaOcen +"]";
    }
}
