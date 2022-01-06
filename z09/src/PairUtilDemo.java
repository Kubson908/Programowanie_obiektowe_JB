public class PairUtilDemo {
    public static void main(String[] args) {
        Pair<Integer, Integer> a = new Pair<>(4, 5);
        System.out.println(a.getOb1() + " " + a.getOb2());
        Pair<Integer, Integer> b = PairUtil.swap(a);
        System.out.println(b.getOb1() + " " + b.getOb2());
    }
}
