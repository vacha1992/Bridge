/*
 * Implementa la clase DrawingAPI1 que representa una implementación específica de dibujo.
 */
package principal;

/**
 *
 * @author Chava
 */
public class DrawingAPI1 implements DrawingAPI{

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("API1 dibuja un círculo en (%d,%d) con radio %d%n", x, y, radius);
    }
    
}
