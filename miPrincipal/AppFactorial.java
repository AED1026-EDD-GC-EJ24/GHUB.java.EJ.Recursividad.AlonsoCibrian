package miPrincipal;

public class AppFactorial {

    public static void menu(){
        int n = 5;
        System.out.println("***********************");
        System.out.println("      FACTORIAL        ");
        System.out.println("***********************");
        System.out.println("Versión Iterativa");
        System.out.println("El factorial de " + n + " es: " + FactorialIterativo(5));
        System.out.println("Versión Recursiva");
        System.out.println("El factorial de " + n + " es: " + factorialRecursivo(5));
    }
   public static long FactorialIterativo(int n){
        long fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact ;
    }
  public static long factorialRecursivo(int n){
        if(n== 0)
            return 1;
        else
            return n * factorialRecursivo(n-1);
  }
}

