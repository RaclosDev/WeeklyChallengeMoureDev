package Retos0to9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Reto7 {

    public static void cuentaPalabras(String texto) {
        Map<String, Integer> hashMap = new HashMap<>();
        texto = texto.replaceAll("[-+.^:,]","");
        texto = texto.toLowerCase();
        List<String> palabras = Arrays.stream(texto.split(" ")).collect(Collectors.toList());
        for (String palabra : palabras) {
            if (hashMap.containsKey(palabra)) hashMap.put(palabra, hashMap.get(palabra) + 1);
            else hashMap.put(palabra, 1);
        }
        System.out.println(hashMap);
    }

    public static void main(String[] args) {
        cuentaPalabras("Hola, mi nombre es Carlos. Mi nombre completo es Carlos Sanz.");
    }
}
