import pl.imiajd.bartosiewicz.Adres;

public class TestAdres {
    public static void main(String[] args) {
        Adres a1 = new Adres("Warszawska", 25, "04-123", "Warszawa");
        Adres a2 = new Adres("Sloneczna", 13, 2, "11-425", "Olsztyn");
        a1.pokaz();
        a2.pokaz();
        System.out.println(a2.przed(a1));
    }
}
