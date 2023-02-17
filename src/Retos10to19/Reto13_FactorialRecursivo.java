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
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


public class Reto13_FactorialRecursivo {

    private static boolean esPalindromo(String texto) {

        texto = texto.replaceAll(" ", "");
        texto = texto.toLowerCase();
        int lenght = texto.length();
        int i = 0;
        while (i < lenght / 2) {
            if (texto.charAt(i) != texto.charAt(lenght - 1 - i)) return false;
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Es palindromo?: " + esPalindromo("Ana lleva al oso la avellana"));
        System.out.println("Es palindromo?: " + esPalindromo("An lleva al oso la avellana"));
    }

}
