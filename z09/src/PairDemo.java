public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, Integer> a = new Pair<>(1, 2);
        System.out.println(a.getOb1() + " " + a.getOb2());
        a.swap();
        System.out.println(a.getOb1() + " " + a.getOb2());
    }
}
