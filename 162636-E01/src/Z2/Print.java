package Z2;

public class Print {
    static <T extends Iterable<T>> void print (T t) {
        for (T value : t) {
            System.out.println(value);
        }
    }
}
