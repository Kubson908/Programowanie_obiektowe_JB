public class PairUtil {
    public static <T, V> Pair<T, V>  swap(Pair<T, V> p) {
        return new Pair<T, V>((T) p.getOb2(), (V) p.getOb1());
    }
}
