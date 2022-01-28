package E1BartosiewiczJakub.Z1;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class ArrayUtilTest {
    public static void main (String[] args) {
        BigInteger[] b1 = new BigInteger[]{BigInteger.valueOf(1), BigInteger.ZERO, BigInteger.valueOf(12)};
        BigInteger[] b2 = new BigInteger[]{BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.TEN};
        System.out.println(ArrayUtil.isSorted(b1));
        System.out.println(ArrayUtil.isSorted(b2));
        String[] s1 = new String[]{"ABC", "ABB", "AAAA"};
        String[] s2 = new String[]{"AAAAA", "AAB", "ABC"};
        System.out.println(ArrayUtil.isSorted(s1));
        System.out.println(ArrayUtil.isSorted(s2));
        LocalDate[] l1 = new LocalDate[]{LocalDate.parse("1999-10-10"), LocalDate.parse("1999-06-02"), LocalDate.parse("1998-12-11")};
        LocalDate[] l2 = new LocalDate[]{LocalDate.parse("1984-11-12"), LocalDate.parse("1984-11-15"), LocalDate.parse("2001-01-02")};
        System.out.println(ArrayUtil.isSorted(l1));
        System.out.println(ArrayUtil.isSorted(l2));
    }
}
