public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].compareTo(a[i+1]) > 0) return false;
        }
        return true;
    }
}
