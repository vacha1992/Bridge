/*
 * Contiene el programa principal (main method) donde se ejemplifica el uso del patrón Bridge. 
   Se crea un objeto Circle con una implementación específica de dibujo y se llama al método draw.
 */
package principal;

/**
 *
 * @author Chava
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(1, 2, 3, new DrawingAPI1());
        circle.draw();

        circle = new Circle(5, 7, 11, new DrawingAPI2());
        circle.draw();
    }
}
