package miPrincipal;

import java.util.Scanner;

public class AppSumaDigitos {
    public static void menu() {
    System.out.println("************************************");
    System.out.println("         Suma de Dígitos            ");
    System.out.println("************************************");
    Scanner rd = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int n = rd.nextInt();
    System.out.println("versión iterativa");
    System.out.println("Resultado = " + sumaDigitosIterativo(n));
    System.out.println("versión recursiva");
    System.out.println("Resultado = " + sumaDigitosRecursivo(n));

    }
    public static int sumaDigitosIterativo(int n) {
        int suma = 0;
        while (n > 9 ) {
            suma += n % 10;
            n = n / 10;
        }
        return suma+n;
    }
    public static int sumaDigitosRecursivo(int n) {
        if (n <= 9) {
            return n;
        }
        return n % 10 + sumaDigitosRecursivo(n / 10);
    }
}
