package co.edu.sena;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        {
       {
         System.out.println( "5. Ingrese un lado de un cuadrado para saber su area y perimetro" );
         System.out.println( "Ingrese el valor de el lado de un cuadrado");
 
         Scanner src = new Scanner(System.in);
         double base = src.nextDouble();

         double estandar =4;

         double result = (base+base);
         System.out.println("su area es de:" +result);

         double result1 = (base*estandar);
         System.out.println(" su perimetro es de :" +result1*2);
        }
    
    }
    }}
