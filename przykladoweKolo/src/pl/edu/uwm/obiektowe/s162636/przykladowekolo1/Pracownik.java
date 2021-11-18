package pl.edu.uwm.obiektowe.s162636.przykladowekolo1;

import java.time.LocalDate;

public class Pracownik extends Osoba {
    String stanowisko;
    double pensja;
    public Pracownik(String imie, String nazwisko, String dataUrodzenia) {
        super(imie, nazwisko, dataUrodzenia);
    }
    public Pracownik(Osoba osoba, String stanowisko, double pensja) {
        super(osoba.getImie(), osoba.getNazwisko(), osoba.getDataUrodzenia().toString());
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }
    public double getPensja() {
        return pensja;
    }
    public String toString() {
        return (super.toString() + " jest pracownikiem na stanowisku " + stanowisko + " z pensją " + pensja + " zł");
    }
}
