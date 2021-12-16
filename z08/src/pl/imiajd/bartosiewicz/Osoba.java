package pl.imiajd.bartosiewicz;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private final String nazwisko;
    private final LocalDate dataUrodzenia;

    public Osoba(String nazwisko, String dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (getClass() != other.getClass()) return  false;
        return Objects.equals(this.nazwisko, ((Osoba) other).nazwisko)
                && Objects.equals(this.dataUrodzenia, ((Osoba) other).dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba o) {
        if (this.nazwisko.compareTo(o.nazwisko) < 0) return -1;
        if (this.dataUrodzenia.compareTo(o.dataUrodzenia) < 0) return -1;
        if (this.nazwisko.compareTo(o.nazwisko) > 0) return 1;
        if (this.dataUrodzenia.compareTo(o.dataUrodzenia) > 0) return 1;
        return 0;
    }

    public String toString() {
        return "Osoba " + " [" + this.nazwisko + "] [" + this.dataUrodzenia + "]";
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public Osoba clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Osoba) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
