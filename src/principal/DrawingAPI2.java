/*
 * Implementa la clase DrawingAPI2 que representa otra implementación específica de dibujo..
 */
package principal;

/**
 *
 * @author Chava
 */
public class DrawingAPI2 implements DrawingAPI{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("API2 dibuja un círculo en (%d,%d) con radio %d%n", x, y, radius);
    }
}
