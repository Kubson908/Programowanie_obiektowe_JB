package pl.edu.uwm.obiektowe.s162636.przykladowekolo1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Osoba> osoby = new ArrayList<>();
        Osoba os1 = new Osoba("Jakub", "Bartosiewicz", "2001-01-14");
        Osoba os2 = new Osoba("Scarlett", "Johansson", "1984-11-22");
        Osoba os3 = new Osoba("Jan", "Kowalski", "1970-07-13");
        Osoba os4 = new Osoba("Maciej", "Nowak", "1995-12-04");
        Osoba os5 = new Osoba("Justyna", "Sikorska", "2000-04-29");
        Osoba os6 = new Osoba("Adam", "Zieliński", "1987-10-19");
        Pracownik pr1 = new Pracownik(os1, "Prezes", 25000);
        Pracownik pr2 = new Pracownik(os2, "Sekretarka", 8000.25);
        Pracownik pr3 = new Pracownik(os6, "Młodszy programista", 12456);
        osoby.add(pr1);
        osoby.add(pr2);
        osoby.add(os3);
        osoby.add(os4);
        osoby.add(os5);
        osoby.add(pr3);
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }
        double suma = 0;
        for (Osoba osoba : osoby) {
            if (osoba instanceof Pracownik) suma += ((Pracownik) osoba).getPensja();
        }
        System.out.println("Suma wszystkich pensji wynosi " + suma);
    }
}
