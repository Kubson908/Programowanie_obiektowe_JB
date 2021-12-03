package pl.imiajd.bartosiewicz;

import java.time.LocalDate;

public class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, String[] imiona, String dataUrodzenia, String plec, double pobory, String dataZatrudnienia)
    {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = LocalDate.parse(dataZatrudnienia);
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł, zatrudniony " + dataZatrudnienia, pobory);
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}