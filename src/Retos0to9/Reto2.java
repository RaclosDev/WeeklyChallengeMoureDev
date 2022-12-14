package Retos0to9;/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Fecha publicación resolución: 17/01/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


public class Reto2 {

    public static void fib() {
        long n = 0;     // n-2
        long n2 = 1;    // n-1
        long fib = 1;   // fibo actual

        System.out.println(n); //Para imprimir el 0 del principio

        for (int i = 0; i < 50; i++) {  //Recorremos para generar 50 it
            System.out.println(fib);    //Imprimimos fibbo
            fib = n + n2;               //Preparamos la siguiente it
            n = n2;
            n2 = fib;
        }
    }

    public static void main(String[] args) {
        fib();
    }
}
