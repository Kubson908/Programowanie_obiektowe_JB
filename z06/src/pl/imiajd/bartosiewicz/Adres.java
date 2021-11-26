package pl.imiajd.bartosiewicz;

public class Adres {
    private String ulica, miasto, kod_pocztowy;
    private int numer_domu, numer_mieszkania;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String kod_pocztowy, String miasto) {
        this.ulica = ulica;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
    }
    public Adres(String ulica, int numer_domu, String kod_pocztowy, String miasto) {
        this.ulica = ulica;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
        this.numer_domu = numer_domu;
    }

    public void pokaz() {
        System.out.println(kod_pocztowy + " " + miasto);
        System.out.println(ulica + " " + numer_domu + " " + numer_mieszkania);
        System.out.println();
    }
    public boolean przed(Adres a) {
        int num1 = Integer.parseInt(this.kod_pocztowy.substring(0,1))*1000 + Integer.parseInt(this.kod_pocztowy.substring(3));
        int num2 = Integer.parseInt(a.kod_pocztowy.substring(0,1))*1000 + Integer.parseInt(a.kod_pocztowy.substring(3));
        return num1 < num2;
    }

}
