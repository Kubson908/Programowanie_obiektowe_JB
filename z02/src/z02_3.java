import java.util.Scanner;
import java.util.Random;

public class z02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj m: ");
        int m = scanner.nextInt();
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();
        System.out.print("Podaj k: ");
        int k = scanner.nextInt();
        if(m<1) m = 1;
        if(m>10) m = 10;
        if(n<1) n = 1;
        if(n>10) n = 10;
        if(k<1) k = 1;
        if(k>10) k = 10;
        int[][] tab1 = new int[m][n];
        int[][] tab2 = new int[n][k];
        generuj(tab1, m, n);
        generuj(tab2, n, k);
        System.out.println("Macierz A: ");
        wypisz(tab1, m, n);
        System.out.println("Macierz B: ");
        wypisz(tab2, n, k);
        int[][] tab3 = iloczyn(tab1, tab2, m, n, k);
        System.out.println("Macierz C = A*B: ");
        wypisz(tab3, m, k);
    }
    public static void generuj(int[][] tab, int m, int n){
        Random r = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                tab[i][j] = r.nextInt(99);
            }
        }
    }
    public static void wypisz(int[][] tab, int m, int n){
        for (int i = 0; i < m; i++){
            System.out.print(tab[i][0]);
            for (int j = 1; j < n; j++){
                System.out.print(", " + tab[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] iloczyn(int[][] tab1, int[][] tab2, int m, int n, int k){
        int[][] tab3 = new int[m][k];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < k; j++){
                tab3[i][j] = 0;
                for (int h = 0; h < n; h++) tab3[i][j] += tab1[i][h]*tab2[h][j];
            }
        }
        return tab3;
    }
}