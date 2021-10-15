import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class zad2_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = scanner.nextInt();
        double iloscPar = 0;
        List<Double> ciag = new ArrayList<Double>();
        System.out.println("Podawaj kolejno liczby: ");
        for(int i = 0; i < n; i++){
            ciag.add(scanner.nextDouble());
            if(i > 0 && ciag.get(i) > 0 && ciag.get(i-1) > 0){
                iloscPar++;
            }
        }
        System.out.println(ciag);
        System.out.print("Ilosc par dodatnich: ");
        System.out.println(iloscPar);
    }
}
