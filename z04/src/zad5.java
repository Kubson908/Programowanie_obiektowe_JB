import java.util.ArrayList;
import java.util.Arrays;

public class zad5 {
    public static void main(String[] args){
        ArrayList<Integer> tab1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(tab1);
        reverse(tab1);
        System.out.println(tab1);
    }

    public static void reverse(ArrayList<Integer> a){
        for (int i = 0; i < a.size()/2; i++){
            int temp = a.get(i);
            a.set(i, a.get(a.size()-1-i));
            a.set(a.size()-1-i, temp);
        }
    }
}