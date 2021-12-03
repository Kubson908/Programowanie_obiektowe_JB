package pl.imiajd.bartosiewicz;

public class Skrzypce extends Instrument {
    public Skrzypce (String producent, String rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "Skrzypce, dzwiek wysoki";
    }
}
