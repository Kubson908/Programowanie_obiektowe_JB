import java.util.ArrayList;
import java.util.Arrays;

public class zad2 {
    public static void main(String[] args){
        ArrayList<Integer> tab1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> tab2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        System.out.println(tab1);
        System.out.println(tab2);
        System.out.println(merge(tab1, tab2));
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d;
        int n;
        if (a.size() < b.size()){
            n = a.size();
            d = b;
        }
        else{
            n = b.size();
            d = a;
        }
        int i;
        for (i = 0; i < n; i++){
            c.add(a.get(i));
            c.add(b.get(i));
        }
        c.addAll(d.subList(i, d.size()));
        return c;
    }
}
