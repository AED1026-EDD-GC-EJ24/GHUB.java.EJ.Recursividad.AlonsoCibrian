package miPrincipal;
public class AppLadrillo{

    public static void menu(){
        //Solucion Iterativa
       /*  for (int i = 0; i < 10; i++) {
            dibujarHilera();
        }*/

        //Solucion Recursiva

        int n = 10;
        dibujarPared(n);
    }
        public static void dibujarPared(int n){
        if(n>0)
        dibujarPared(n-1);
        System.out.println("XXXXXXXXXXXXXXXXXXXX");
        }
        public static void dibujarHilera(){
            System.out.println("XXXXXXXXXXXXXXXXXXXX");
        }
    
}