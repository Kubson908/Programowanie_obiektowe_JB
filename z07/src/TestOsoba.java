import pl.imiajd.bartosiewicz.Osoba;
import pl.imiajd.bartosiewicz.Pracownik;
import pl.imiajd.bartosiewicz.Student;

import java.time.LocalDate;
import java.util.*;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        String[] imiona1 = {"Jan", "Andrzej"};
        String[] imiona2 = {"Agnieszka"};
        ludzie[0] = new Pracownik("Kowalski", imiona1, "1975-10-11", "m", 5400, "2003-05-30");
        ludzie[1] = new Student("Nowak", imiona2, "1998-01-03", "k", "Informatyka", 4.65);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ", plec: " + p.getPlec() + ", data urodzenia: " + p.getDataUrodzenia() + " - " + p.getOpis());
        }
    }
}





