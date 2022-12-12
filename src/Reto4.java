/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Reto4 {

    public interface Polygon {
        void calcArea();
    }

    public static class Triangle implements Polygon {
        double base;
        double lado;

        public Triangle(double base, double lado) {
            this.base = base;
            this.lado = lado;
        }

        @Override
        public void calcArea() {
            System.out.println("El area del triangulo es: " + (base * lado) / 2);
        }
    }

    public static class Square implements Polygon {
        double lado;

        public Square(double lado) {
            this.lado = lado;
        }

        @Override
        public void calcArea() {
            System.out.println("El area del cuadrado es: " + lado * 4);
        }
    }

    public static class Rectangle implements Polygon {
        double base;
        double altura;

        public Rectangle(double base, double lado) {
            this.base = base;
            this.altura = lado;
        }

        @Override
        public void calcArea() {
            System.out.println("El area del rectangulo es: " + base * altura);
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 6);
        triangle.calcArea();
        Square square = new Square(5);
        square.calcArea();
        Rectangle rectangle = new Rectangle(4, 8);
        rectangle.calcArea();
    }
}
