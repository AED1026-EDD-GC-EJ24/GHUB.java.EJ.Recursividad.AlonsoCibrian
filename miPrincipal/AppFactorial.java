package miPrincipal;

public class AppFactorial {
    public static void main(String[] args){
        int f = 5;
        
        System.out.println("El factorial de " + f + " es: " + FactorialIterativo(5););
        
    }
   public static long FactorialIterativo(int f){
        long fact = 1;
        for (int i = 1; i > 0; i--) {
            fact *= i;
        }
        return fact ;
    }
  public static long factorialRecursivo(){
        if(f == 0)
            return 1;
        else
            return f * factorialRecursivo(f-1);
  }
}

