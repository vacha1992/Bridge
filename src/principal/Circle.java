/*
 *  Implementa la clase Circle que es una subclase de Shape y 
    representa una forma específica (círculo) en el patrón Bridge.
 */
package principal;

/**
 *
 * @author Chava
 */
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}
