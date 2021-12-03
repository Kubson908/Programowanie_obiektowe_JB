package pl.imiajd.bartosiewicz;

public class Flet extends Instrument {
    public Flet (String producent, String rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "Flet, dzwiek srednio wysoki";
    }
}
