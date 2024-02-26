package co.edu.sena;

import java.util.Scanner;

//inicio
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "3.Ingresa un numero para elevarlo al cuadrado" );
        Scanner Scanner = new Scanner (System.in);

        System.out.println("Ingrese un numero");
        Double numero = Scanner.nextDouble();

        double cuadrado = Math.pow(numero, 2);
        System.out.println("El Cuadrado de los dos numeros son:"+cuadrado);

        Scanner.close();

    }
}
