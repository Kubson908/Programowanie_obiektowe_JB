import java.util.ArrayList;
import java.util.Arrays;

public class zad4 {
    public static void main(String[] args){
        ArrayList<Integer> tab1 = new ArrayList<>(Arrays.asList(1, 3, 5, 10, 17, 4, 7));
        System.out.println(tab1);
        System.out.println(reversed(tab1));
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = a.size()-1; i >= 0; i--){
            c.add(a.get(i));
        }
        return c;
    }
}