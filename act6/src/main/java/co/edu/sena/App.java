package co.edu.sena;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        System.out.println( "6. Escribir un algoritmo que determine el area y volumen de un cilindro" );
        @SuppressWarnings("resource")
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese el radio de la base del cilindro: ");
        double radio = src.nextDouble();

        System.out.println("Ingrese la altura del cilindro: ");
        double altura = src.nextDouble();
        double Lateral = 2 * Math.PI * radio * altura;

        double areaTotal = 2 * Math.PI * radio * (radio + altura);

        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El área de la superficie lateral es: " + Lateral);
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El volumen es: " + volumen);
    }

        }
    
    

