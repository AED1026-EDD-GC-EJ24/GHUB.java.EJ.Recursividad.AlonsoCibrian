package miPrincipal;

public class AppMCD {
        public static void menu() {
              //Mayor comun denominador
                System.out.println("******************************");
                System.out.println("    Mayor comun denominador "   );
                System.out.println("******************************");
                System.out.println("El MCD de 6 y 124 es: " + mcd(6,124));
        }
        //version Recursiva
        public static int mcd(int m, int n) {
           if (n<=m && m%n==0)
               return n;
           else if (m<n)
               return mcd(n,m);
           else
               return mcd(n,m%n);
        }
        //versión iterativa
        
    } 


