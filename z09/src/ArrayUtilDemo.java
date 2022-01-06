import java.time.LocalDate;

public class ArrayUtilDemo {
    public static void main (String[] args) {
        Integer[] a = {1, 2, 5, 3, 7, 8, 11, 4};
        LocalDate[] b = {LocalDate.parse("2021-05-06"), LocalDate.parse("2022-01-12"), LocalDate.parse("2022-10-11")};
        System.out.println(ArrayUtil.isSorted(a));
        System.out.println(ArrayUtil.isSorted(b));
        System.out.println(ArrayUtil.binSearch(a, 8));
        System.out.println(ArrayUtil.binSearch(b, LocalDate.parse("2020-11-11")));
        for (Object i : a) {
            System.out.print(i + " ");
        }
        ArrayUtil.selectionSort(a);
        System.out.println();
        for (Object i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Object i : b) {
            System.out.print(i + " ");
        }
        ArrayUtil.selectionSort(b);
        System.out.println();
        for (Object i : b) {
            System.out.print(i + " ");
        }

    }
}
