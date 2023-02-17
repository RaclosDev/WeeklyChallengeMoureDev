package Retos10to19;

/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 04/04/22
 * Fecha publicación resolución: 11/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 */

/*En matemática recreativa un número narcisista es aquel que es igual a la suma de sus dígitos elevados a la potencia de su número de cifras.
 Su nombre alude a lo mucho que parecen "quererse a sí mismos".
Esta definición depende de la base b del sistema numérico empleado, por ejemplo b = 10 para el sistema decimal o b = 2 para el sistema binario.
*/

public class Reto14_EsNumeroArmstrong {

    private static boolean esNumeroDeArmstrong(int number) {
        final int length = (int) Math.log10(number) + 1;
        int suma = Integer.toString(number).chars().map(n -> (int) Math.pow(n - '0', length)).sum();

        return number == suma;
    }

    public static void main(String[] args) {
        System.out.println("Es NumeroDeArmstrong 1: " + esNumeroDeArmstrong(1));
        System.out.println("Es NumeroDeArmstrong 2: " + esNumeroDeArmstrong(2));
        System.out.println("Es NumeroDeArmstrong 3: " + esNumeroDeArmstrong(3));
        System.out.println("Es NumeroDeArmstrong 12: " + esNumeroDeArmstrong(12));
        System.out.println("Es NumeroDeArmstrong 153: " + esNumeroDeArmstrong(153));
        System.out.println("Es NumeroDeArmstrong 424: " + esNumeroDeArmstrong(424));
        System.out.println("Es NumeroDeArmstrong 407: " + esNumeroDeArmstrong(407));
    }

}
