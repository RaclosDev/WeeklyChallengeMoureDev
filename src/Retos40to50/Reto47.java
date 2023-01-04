package Retos40to50;

import java.text.Normalizer;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Enunciado: Crea un función que reciba un texto y retorne la vocal que
 * más veces se repita.
 * - Ten cuidado con algunos casos especiales.
 * - Si no hay vocales podrá devolver vacío.
 */
public class Reto47 {
    public static Character vocalDeModa(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFC);

        Map<Character, Long> numVocales =
                texto.chars().          //Devuelve un stream de enteros que representan los valores Unicode de los caracteres del string.
                        mapToObj(c -> (char) c).   //Cada entero del stream original se convierte a un char.
                        filter(c -> "aeiou".indexOf(c) >= 0). //Filtra las vocales
                        collect(Collectors.groupingBy(c -> c, Collectors.counting()));//Ordena y cuenta las vocales

        return numVocales.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    public static void main(String[] args) {
        String texto = "Este ejercicio fue resuelto por Raclos";
        System.out.println(vocalDeModa(texto));
    }
}
