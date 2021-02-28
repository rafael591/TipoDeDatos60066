/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos60066;

/**
 *
 * @author Rafael Moreno
 */
public class TipoDeDatos60066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte minimo_byte;
        byte maximo_byte;
        minimo_byte = Byte.MIN_VALUE;
        maximo_byte = Byte.MAX_VALUE;
        short minimo_short;
        short maximo_short;
        minimo_short = Short.MIN_VALUE;
        maximo_short = Short.MAX_VALUE;
        int minimo_int = Integer.MIN_VALUE;
        int maximo_int = Integer.MAX_VALUE;
        long minimo_long = Long.MIN_VALUE;
        long maximo_long = Long.MAX_VALUE;
        double minimo_double = Double.MIN_VALUE;
        double maximo_double = Double.MAX_VALUE;
        System.out.println("El mínimo de Byte es: " + minimo_byte);
        System.out.println("El máximo de Byte es: " + maximo_byte);
        System.out.println("El mínimo de short es: " + minimo_short);
        System.out.println("El máximo de short es: " + maximo_short);
        System.out.println("El mínimo de int es: " + minimo_int);
        System.out.println("El máximo de int es: " + maximo_int);
        System.out.println("El mínimo de long es: " + minimo_long);
        System.out.println("El máximo de long es: " + maximo_long);
        System.out.println("El mínimo de double es: " + minimo_double);
        System.out.println("El máximo de double es: " + maximo_double);
    }
    
}
