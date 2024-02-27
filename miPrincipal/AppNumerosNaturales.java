package miPrincipal;
import java.util.*;
public class AppNumerosNaturales {
    public static void menu() {
        System.out.println("************************************");
        System.out.println("         Números Naturales          ");
        System.out.println("************************************");
        Scanner rd = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = rd.nextInt();
        System.out.println("versión iterativa");
        muestraNaturalesIterativo(n);
        System.out.println("versión recursiva");
        muestraNaturalesRecursivo(n);
    }
    public static void muestraNaturalesIterativo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    public static void muestraNaturalesRecursivo(int n) {
        //cuando esta antes de la invocacción recursiva se imprime de forma descendente
        if (n > 1)     
            muestraNaturalesRecursivo(n - 1);
        System.out.println(n);
        //cuando esta después de la invocacción recursiva se imprime de forma ascendente
    }
}
