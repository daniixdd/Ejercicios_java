package co.edu.sena;

import java.util.Scanner;

//inicio
public class App {
    public static void main( String[] args )
    {
        System.out.println("1. Calcular el área de un triángulo"); 
        System.out.println(x: "Ingrese la base del triángulo: ");

        Scanner src new Scanner(System.in);
         double base = src.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo: ");
        
        double height = src.nextDouble();

        //Proceso
        
        double result = (base*height/2);

        //Salida
        
        System.out.println("El área del triángulo es: "+result);
    }
}
