package miPrincipal;

import java.util.Scanner;

public class AppFibonacci {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
    System.out.println("************************************"); 
    System.out.println("*          Fibonacci                *");
    System.out.println("************************************");

    Scanner rd = new Scanner(System.in);
    System.out.println("Ingrese un valor ");
    int n = rd.nextInt();

    //funcion itearativa
    System.out.println("Fibonacci Iterativo");
    double f = fibonnaciIterativo(n);
    System.out.println(f);
}
static double fibonnaciIterativo(int n) {
    double f = 1, r1 = 1, r2 = 1;
    for (int i = 3; i <= n; i++) {
        f = r1 + r2;
        r1 = r2;
        r2 = f;
    }
    return f;
}

static double fibonnaciRecursivo(int n) {
   int cont = 0; // Declare and initialize the variable cont
   cont++;
   double f;
   if(n<=2)
   f=1;
    else
    f = fibonnaciRecursivo(n-1) + fibonnaciRecursivo(n-2);
    return f;
}

static long getContador(){
    int cont = 0; // Declare and initialize the variable cont
    return cont;
}

}
