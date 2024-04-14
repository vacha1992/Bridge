/*
 * Define la interfaz Shape que actúa como la abstracción en el patrón Bridge.
 */
package principal;

/**
 *
 * @author Chava
 */
public abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
}
