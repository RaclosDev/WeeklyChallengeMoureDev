package Retos0to9;

import java.util.HashMap;
import java.util.Map;

/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Reto9_CodigoMorseTraductor {

    // Mapa que asocia cada caracter del alfabeto con su código Morse
    private static final Map<Character, String> morseCode = new HashMap<>();

    // Inicializamos el mapa con los códigos Morse correspondientes a cada caracter
    static {
        morseCode.put('a', ".-");
        morseCode.put('b', "-...");
        morseCode.put('c', "-.-.");
        morseCode.put('d', "-..");
        morseCode.put('e', ".");
        morseCode.put('f', "..-.");
        morseCode.put('g', "--.");
        morseCode.put('h', "....");
        morseCode.put('i', "..");
        morseCode.put('j', ".---");
        morseCode.put('k', "-.-");
        morseCode.put('l', ".-..");
        morseCode.put('m', "--");
        morseCode.put('n', "-.");
        morseCode.put('o', "---");
        morseCode.put('p', ".--.");
        morseCode.put('q', "--.-");
        morseCode.put('r', ".-.");
        morseCode.put('s', "...");
        morseCode.put('t', "-");
        morseCode.put('u', "..-");
        morseCode.put('v', "...-");
        morseCode.put('w', ".--");
        morseCode.put('x', "-..-");
        morseCode.put('y', "-.--");
        morseCode.put('z', "--..");
        morseCode.put('0', "-----");
        morseCode.put('1', ".----");
        morseCode.put('2', "..---");
        morseCode.put('3', "...--");
        morseCode.put('4', "....-");
        morseCode.put('5', ".....");
        morseCode.put('6', "-....");
        morseCode.put('7', "--...");
        morseCode.put('8', "---..");
        morseCode.put('9', "----.");
    }

    /**
     * Método que convierte un mensaje en texto natural a código Morse.
     * @param message Mensaje en texto natural.
     * @return Mensaje en código Morse.
     */
    public static String toMorse(String message) {
        // Creamos una cadena para almacenar el mensaje en código Morse
        StringBuilder morseMessage = new StringBuilder();

        // Recorremos cada caracter del mensaje
        for (char c : message.toLowerCase().toCharArray()) {
            // Si el caracter es un espacio, añadimos dos espacios en código Morse
            if (c == ' ') {
                morseMessage.append("  ");
            } else {
                // Obtenemos el código Morse del caracter y lo añadimos a la cadena
                morseMessage.append(morseCode.get(c)).append(' ');
            }
        }
        return morseMessage.toString();
    }

    /**
     * Método que convierte un mensaje en código Morse a texto natural.
     * @param message Mensaje en código Morse.
     * @return Mensaje en texto natural.
     */
    public static String fromMorse(String message) {

        StringBuilder naturalMessage = new StringBuilder();

        String[] words = message.split("   ");

        for (String word : words) {
            // Separamos la palabra en código Morse por rayas y puntos
            String[] letters = word.split(" ");
            for (String letter : letters) {
                // Buscamos el caracter del alfabeto que tiene el código Morse de la letra
                for (Map.Entry<Character, String> entry : morseCode.entrySet()) {
                    if (entry.getValue().equals(letter)) {
                        naturalMessage.append(entry.getKey());
                        break;
                    }
                }
            }
            // Añadimos un espacio al final de cada palabra
            naturalMessage.append(' ');
        }
        return naturalMessage.toString();
    }

    public static void main(String[] args) {
        String message = "Raclos morse";

        String morse = toMorse(message);
        System.out.println("Mensaje en código Morse: " + morse);

        String natural = fromMorse(morse);
        System.out.println("Mensaje en texto natural: " + natural);

    }
}


