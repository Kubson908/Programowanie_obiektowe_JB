package z05;

public class RachunekBankowy {
    public static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double saldo){
        this.saldo = saldo;
    }
    public void obliczMiesieczneOdsetki(){
        double odsetki = (this.saldo * rocznaStopaProcentowa)/12;
        saldo += odsetki;
    }
    public static void setRocznaStopaProcentowa(double wartosc){
        rocznaStopaProcentowa = wartosc;
    }
    public double getSaldo(){
        return saldo;
    }
}
