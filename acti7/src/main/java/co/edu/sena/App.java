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
                Scanner scanner = new Scanner(System.in);
        System.out.print("8. ingrese radio de circunferencia:");
        double radioo = scanner.nextDouble();
        double longitud = 2 * Math.PI * radioo;
        double area_vistaa = Math.PI * Math.pow(radioo, 2);
        System.out.println("la longitud:" + longitud);
        System.out.println("la area vista:" + area_vistaa);
        scanner.close();
    }

}
