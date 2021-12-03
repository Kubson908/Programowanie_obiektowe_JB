import pl.imiajd.bartosiewicz.Flet;
import pl.imiajd.bartosiewicz.Fortepian;
import pl.imiajd.bartosiewicz.Instrument;
import pl.imiajd.bartosiewicz.Skrzypce;

public class TestInstrument {
    public static void main (String[] args) {
        Instrument[] orkiestra = new Instrument[5];
        orkiestra[0] = new Flet("Piccolo", "2012-01-13");
        orkiestra[1] = new Fortepian("Yamaha", "1996-10-11");
        orkiestra[2] = new Skrzypce("Hoffner", "2001-12-23");
        orkiestra[3] = new Skrzypce("Toshiba", "2010-08-02");
        orkiestra[4] = new Flet("Hohner", "2016-03-14");
        for (Instrument instrument : orkiestra) {
            System.out.println(instrument.dzwiek());
        }
        System.out.println();
        System.out.println("Sklad orkiestry: ");
        for (Instrument instrument : orkiestra) {
            System.out.println(instrument);
        }
    }
}
