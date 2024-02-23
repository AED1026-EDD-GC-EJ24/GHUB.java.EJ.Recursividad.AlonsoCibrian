package miPrincipal;
public class AppLadrillo{

    public static void menu(){
        //Solucion Iterativa
        for (int i = 0; i < 10; i++) {
            dibujarHilera();
        }
        //Solucion Recursiva
        dibujarPared();
    }
        public static void dibujarPared(){
            dibujarHilera();
        }
        public static void dibujarHilera(){
            System.out.println("XXXXXXXXXXXXXXXXXXXX");
        }
    
}