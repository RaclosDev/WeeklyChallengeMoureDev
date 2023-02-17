package Retos0to9;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

/*
 * Reto #5
 * ASPECT RATIO DE UNA IMAGEN
 * Fecha publicación enunciado: 01/02/22
 * Fecha publicación resolución: 07/02/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Nota: Esta prueba no se puede resolver con el playground online de Kotlin. Se necesita Android Studio.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Reto5_AspectRatioImagen {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://signage.uiowa.edu/sites/signage.uiowa.edu/files/slides/1920x1080.jpg");

        BufferedImage image = ImageIO.read(url);
        int width = image.getWidth();
        int height = image.getHeight();

        int gcd = mcd(width, height);
        String aspectRatio = (width / gcd) + ":" + (height / gcd);

        System.out.println("Aspect ratio: " + aspectRatio);
    }

    // Función para calcular el máximo común divisor de dos números
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }


}
