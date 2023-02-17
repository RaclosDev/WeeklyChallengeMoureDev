package Retos10to19;

/*
 * Reto #13
 * FACTORIAL RECURSIVO
 * Fecha publicación enunciado: 28/03/22
 * Fecha publicación resolución: 04/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
 *
 */


public class Reto13_FactorialRecursivo {

    private static long factorialRecursivo(long number) {
        if (number < 1) return 1;
        else return number * factorialRecursivo(number-1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 1: " + factorialRecursivo(1));
        System.out.println("Factorial de 2: " + factorialRecursivo(2));
        System.out.println("Factorial de 3: " + factorialRecursivo(3));
        System.out.println("Factorial de 5: " + factorialRecursivo(5));
        System.out.println("Factorial de 10: " + factorialRecursivo(10));
    }

}
