package pl.imiajd.bartosiewicz;

public class Student extends Osoba
{
    public Student(String nazwisko, String[] imiona, String dataUrodzenia, String plec, String kierunek, double sredniaOcen)
    {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    private String kierunek;
    private double sredniaOcen;
}