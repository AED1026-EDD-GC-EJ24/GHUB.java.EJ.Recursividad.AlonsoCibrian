package miPrincipal;

public class AppAlfabeto {
    public static void menu() {
        //Recursividad Indirecta
        System.out.println("******************************");
        System.out.println("    Recursividad Indirecta "   );
        System.out.println("******************************");
        metodoA('Z');

    }
    public static void metodoA(char c) {
       if (c > 'A') 
        metodoB(c);
        System.out.println(c);
    }
    public static void metodoB(char c) {
        metodoA(--c);
    }
}

