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
         System.out.println( "8. Dijitar 3 numeros para calcular el promedio" );
         System.out.println( "Ingresa el primer numero");
 
         double div= 3;

         Scanner src = new Scanner(System.in);
         double num1 = src.nextDouble();

         System.out.println( "Ingresa el segundo numero");
         double num2 = src.nextDouble();

         System.out.println( "Ingresa el tercer numero");
         double num3 = src.nextDouble();

         double result = (num1+num2+num3);

         System.out.println("la suma es :" +result);
         
         double result1 = (result/div);

         System.out.println("El promedio entre los numeros son :" +result1);
        }
    }
}
