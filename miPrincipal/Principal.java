package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("************************");
            System.out.println("      RECURSIVIDAD      ");
            System.out.println("************************");
            System.out.println("1) Ladrillos ");
            System.out.println("2) Factorial ");
            System.out.println("3) Numeros naturales");
            System.out.println("4) Suma de digitos");
            System.out.println("5) Recursividad Indirecta ");
            System.out.println( "6) Máximo Común Divisor (MCD) ");
            System.out.println("7) Busqueda Binario ");
            System.out.println("8) Ordenamiento Selección ");
            System.out.println("9) Torres de Hanoi");
            System.out.println("10) Fibonacci");
            System.out.println("11) Performance serie fibonacci ");
            System.out.println("12) Fibonacci Recursivo Optimizado ");
            System.out.println("13) Ordenación Por Mezcla  ");
            System.out.println("0) Salir ");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppLadrillo.menu();
               break;  
            case 2:
                AppFactorial.menu();
                break; 
            case 3:
                AppNumerosNaturales.menu();
                break;
            case 4:
                AppSumaDigitos.menu();
                break;
            case 5:
                AppAlfabeto.menu();
                break;
            case 6:
                AppMCD.menu();
                break;
            case 7:
                AppBusquedaBinaria.menu();
                break;
            case 8:
                AppOrdenamientoSeleccion.menu();
                break;
            case 9: 
                AppTorresHanoi.menu();
                break;
            case 10:
                AppFibonacci.menu();
                break;
            case 11:    
            AppFibRecursivode40a50.menu();
                break;
                case 12:
                AppFibRecursivoOptimizado.menu();
                break;
            case 13:    
                AppOrdenacionPorMezclas.menu();
                break;
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
            default:
               System.out.println("Valor incorrecto, intente de nuevo!");
        }
    }while (opc != 0);
		
    }
}