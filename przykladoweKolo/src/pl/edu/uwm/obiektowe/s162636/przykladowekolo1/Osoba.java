package pl.edu.uwm.obiektowe.s162636.przykladowekolo1;

import java.time.LocalDate;
import static java.time.LocalDate.parse;
import static java.time.temporal.ChronoUnit.YEARS;

public class Osoba {
    private String imie, nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

    public Osoba(String imie, String nazwisko, String dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = parse(dataUrodzenia);
        this.wiek = wiek();
        if(this.dataUrodzenia.isAfter(LocalDate.now())) throw new IllegalArgumentException("Osoba nie moze byc z przyszlosci");
    }
    private int wiek() {
        return (int) YEARS.between(dataUrodzenia, LocalDate.now());
    }
    public String toString() {
        return ("Osoba " + imie + " " + nazwisko + " urodzona " + dataUrodzenia + " wiek " + wiek);
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    public int getWiek() {
        return wiek();
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public  void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = parse(dataUrodzenia);
        this.wiek = wiek();
    }
}
