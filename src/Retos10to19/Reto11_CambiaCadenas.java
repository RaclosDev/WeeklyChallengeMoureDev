package Retos10to19;/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Fecha publicación enunciado: 14/03/22
 * Fecha publicación resolución: 21/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Reto11_CambiaCadenas {

    public static void cambiaCadenas(String str1, String str2) {
        StringBuilder out1 = new StringBuilder();
        StringBuilder out2 = new StringBuilder();

        // Iteramos el string
        for (char c : str1.toCharArray()) {
            //Si cada caracter no está en str2, lo añadimos
            if (!str2.contains(Character.toString(c))) out1.append(c);
        }

        for (char c : str2.toCharArray()) {
            if (!str1.contains(Character.toString(c))) out2.append(c);
        }

        System.out.println("out1: " + out1);
        System.out.println("out2: " + out2);
    }

    public static void main(String[] args) {
        String str1 = "Mi nombre es Carlos";
        String str2 = "Y mi apodo es Raclos";
        cambiaCadenas(str1.toLowerCase(), str2.toLowerCase());
    }
}
