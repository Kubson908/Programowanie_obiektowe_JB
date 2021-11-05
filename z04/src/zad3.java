import java.util.ArrayList;
import java.util.Arrays;

public class zad3 {
    public static void main(String[] args){
        ArrayList<Integer> tab1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> tab2 = new ArrayList<>(Arrays.asList(1, 4, 9, 16));
        System.out.println(tab1);
        System.out.println(tab2);
        System.out.println(mergeSorted(tab1, tab2));
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
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
        int i = 0, j = 0;
        while(i < a.size() && j < b.size()) {
            if (a.get(i) < b.get(j)) {
                c.add(a.get(i));
                i++;
            } else {
                c.add(b.get(j));
                j++;
            }
        }
        if(i == a.size()) c.addAll(b.subList(j, b.size()));
        if(j == b.size()) c.addAll(a.subList(i, a.size()));
        return c;
    }
}