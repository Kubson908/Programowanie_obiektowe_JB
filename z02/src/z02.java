import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class z02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb (od 1 do 100): ");
        int n = 0;
        while (n < 1 || n > 100) {
            n = scanner.nextInt();
            if (n < 1 || n > 100) {
                System.out.println("Zle, podaj jeszcze raz");
            }
        }
        int[] tab = new int[n];
        generuj(tab, n, -999, 999);
        for (int j = 0; j < n; j++) {
            System.out.print(tab[j] + "  ");
        }
        System.out.println();
        System.out.println("Ilosc liczb nieparzystych: " + ileNieparzystych(tab));
        System.out.println("Ilosc liczb parzystych: " + ileParzystych(tab));
        System.out.println("Ilosc liczb Dodatnich: " + ileDodatnich(tab));
        System.out.println("Ilosc liczb ujemnych: " + ileUjemnych(tab));
        System.out.println("Ilosc wystapien najwiekszej liczby: " + ileMaksymalnych(tab));
        System.out.println("Suma liczb dodatnich: " + sumaDodatnich(tab));
        System.out.println("Suma liczb ujemnych: " + sumaUjemnych(tab));
        System.out.println("Dlugosc maksymalnego ciagu liczb dodatnich: " + dlugoscMaksymalnegoCiaguDodatnich(tab));
        System.out.println("Zmodyfikowana tablica:");
        signum(tab);
        System.out.println();
        int lewy = -1, prawy = -1;
        System.out.print("Podaj lewy element: ");
        while (lewy <= 0 || lewy > n) {
            lewy = scanner.nextInt();
            if (lewy <= 0 || lewy > n) {
                System.out.println("Zle, podaj jeszcze raz");
            }
        }
        System.out.print("Podaj prawy element: ");
        while (prawy <= 0 || prawy > n) {
            prawy = scanner.nextInt();
            if (prawy <= 0 || prawy > n) {
                System.out.println("Zle, podaj jeszcze raz");
            }
        }
        odwrocFragment(tab, lewy, prawy);
        for (int j = 0; j < n; j++) {
            System.out.print(tab[j] + "  ");
        }
    }

    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = r.nextInt(maxWartosc * 2) - Math.abs(minWartosc);
        }
    }

    //zadanie 2a
    public static int ileNieparzystych(int[] tab) {
        int ile = 0;
        for (int j : tab) {
            if (j % 2 == 1 || j % 2 == -1) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileParzystych(int[] tab) {
        int ile = 0;
        for (int j : tab) {
            if (j % 2 == 0) {
                ile++;
            }
        }
        return ile;
    }

    //zadanie 2b
    public static int ileDodatnich(int[] tab) {
        int ile = 0;
        for (int j : tab) {
            if (j > 0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileUjemnych(int[] tab) {
        int ile = 0;
        for (int j : tab) {
            if (j < 0) {
                ile++;
            }
        }
        return ile;
    }

    //zadanie 2c
    public static int ileMaksymalnych(int[] tab) {
        int ile = 0;
        int Max = -999;
        for (int k : tab) {
            if (k > Max) {
                Max = k;
            }
        }
        for (int i : tab) {
            if (i == Max) {
                ile++;
            }
        }
        return ile;
    }

    //zadanie 2d
    public static int sumaDodatnich(int[] tab) {
        int suma = 0;
        for (int j : tab) {
            if (j > 0) {
                suma += j;
            }
        }
        return suma;
    }

    public static int sumaUjemnych(int[] tab) {
        int suma = 0;
        for (int j : tab) {
            if (j < 0) {
                suma += j;
            }
        }
        return suma;
    }

    //zadanie 2e
    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab) {
        int dlugosc = 0;
        int dlugoscMax = 0;
        for (int i : tab) {
            if (i <= 0) {
                dlugosc = 0;
            }
            if (i > 0) {
                dlugosc++;
            }
            if (dlugosc > dlugoscMax) {
                dlugoscMax = dlugosc;
            }
        }
        return dlugoscMax;
    }

    //zadanie 2f
    public static void signum(int[] tab) {
        for (int j : tab) {
            if (j < 0) {
                j = -1;
            }
            if (j > 0) {
                j = 1;
            }
            System.out.print(j + "  ");
        }
    }

    //zadanie 2g
    public static void odwrocFragment(int[] tab, int lewy, int prawy) {
        for(int i = 0; i < (prawy-lewy)/2; i++) {
            int temp = tab[prawy-i];
            tab[prawy-i] = tab[i+lewy];
            tab[i+lewy] = temp;
        }
    }
}