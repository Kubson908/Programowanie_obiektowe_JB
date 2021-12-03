package pl.imiajd.bartosiewicz;

import java.time.LocalDate;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, String rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = LocalDate.parse(rokProdukcji);
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public abstract String dzwiek();

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return  false;
        Instrument otherInstrument = (Instrument) other;
        return producent.equals(otherInstrument.producent) && rokProdukcji.equals(otherInstrument.rokProdukcji);
    }

    public String toString() {
        return (dzwiek() + ", producent: " + producent + ", rok produkcji: " + rokProdukcji);
    }
}
