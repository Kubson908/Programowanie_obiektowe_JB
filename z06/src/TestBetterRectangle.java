import pl.imiajd.bartosiewicz.BetterRectangle;

public class TestBetterRectangle {
    public static void main(String[] args) {
        BetterRectangle r1 = new BetterRectangle(2, 4, 6, 10);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
