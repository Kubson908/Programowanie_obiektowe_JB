package Z1;

import java.time.LocalDate;
import java.time.LocalTime;

public class ArrayUtilTest {
    public static void main (String[] args) {
        Integer[] ints1 = {5, 6, 7, 2, 1, 4, 8};
        Integer[] ints2 = {7, 7, 5, 4, 3, 2, 1};
        System.out.println(ArrayUtil.isSorted(ints1));
        System.out.println(ArrayUtil.isSorted(ints2));
        LocalTime[] locals1 = {LocalTime.parse("11:12"), LocalTime.parse("10:23"), LocalTime.parse("10:20")};
        LocalTime[] locals2 = {LocalTime.parse("12:40"), LocalTime.parse("13:45"), LocalTime.parse("13:28")};
        System.out.println(ArrayUtil.isSorted(locals1));
        System.out.println(ArrayUtil.isSorted(locals2));
        String[] strings1 = {"ABC", "ADC", "ACDC"};
        String[] strings2 = {"XYZ", "DDDDD", "ABC"};
        System.out.println(ArrayUtil.isSorted(strings1));
        System.out.println(ArrayUtil.isSorted(strings2));
    }
}
