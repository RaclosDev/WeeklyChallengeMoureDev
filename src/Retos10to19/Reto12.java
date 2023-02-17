package Retos10to19;

/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/03/22
 * Fecha publicación resolución: 28/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 */


public class Reto12 {

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
