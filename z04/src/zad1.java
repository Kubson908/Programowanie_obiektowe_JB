import java.util.ArrayList;
import java.util.Arrays;

public class zad1 {
    public static void main(String[] args){
        ArrayList<Integer> tab1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> tab2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        System.out.println(tab1);
        System.out.println(tab2);
        System.out.println(append(tab1, tab2));
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        a.addAll(b);
        return a;
    }
}
