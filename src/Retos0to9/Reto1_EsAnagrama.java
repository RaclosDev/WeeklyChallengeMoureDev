package Retos0to9;/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import java.util.List;
import java.util.stream.Collectors;

public class Reto1_EsAnagrama {

    public static boolean isAnagrama(String s1, String s2) {

        if (s1.equals(s2)) return false;

        List<Character> list = s1.chars().mapToObj((i) -> (char) i).collect(Collectors.toList());
        List<Character> list2 = s2.chars().mapToObj((i) -> (char) i).collect(Collectors.toList());
        list = list.stream().sorted().collect(Collectors.toList());
        list2 = list2.stream().sorted().collect(Collectors.toList());

        return list.equals(list2);
    }

    public static void main(String[] args) {
        if (isAnagrama("carlos", "raclos")) System.out.println("Las palabras son anagramas");
        else System.out.println("Las palabras no son anagramas");
    }
}
