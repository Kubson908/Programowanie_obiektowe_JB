package pl.imiajd.bartosiewicz;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Osoba
{
    public Osoba(String nazwisko, String[] imiona, String dataUrodzenia, String plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
        if (Objects.equals(plec, "m")) this.plec = true;
        if (Objects.equals(plec, "k")) this.plec = false;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getPlec()
    {
        if (this.plec) return "mezczyzna";
        return "kobieta";
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}
