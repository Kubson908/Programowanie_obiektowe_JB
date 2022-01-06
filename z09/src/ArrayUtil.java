public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 0; i< a.length - 1; i++) {
            if (a[i].compareTo(a[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] a, T b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) return i;
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[i]) < 0) {
                    T temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }


}
