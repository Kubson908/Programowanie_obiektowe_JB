package pl.imiajd.bartosiewicz;

public class Fortepian extends Instrument {
    public Fortepian (String producent, String rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "Fortepian, szeroki zakres dzwieku";
    }
}
