/**
 * Rect.java
 * @version 1.0.0
 * Written by James Sibley
 */

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Rect (rectangle) is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the rects bounding rectangle.
 * The rect has a hieght and width which determines its size
 */

public class Rect extends ClosedShape {
    //Side length of the sqauare.
    private int height;
    private int width;


    /**
     * Creates a Square
     * @param x The display component's x position.
     * @param y The display component's y position.
     * @param vx The display component's x velocity.
     * @param vy The display component's y velocity.
     * @param sideLength The side length of the square.
     * @param colour The line colour or fill colour.
     * @param isFilled True if the circle is filled with colour, false if opaque.
     */

    public Rect(int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, colour, isFilled);
        this.width = width;
        this.height = height;

    }

    /**
     * Method to convert a square to a string.
     */
    public String toString() {
        String result = "This is a sqaure\n";
        result += super.toString();
        result += "Its height is " + this.height + " and its width" +
            "is " + this.width + "\n";
        return result;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Draw the circle on the screen.
     * @param g The graphics object of the scene component.
     */
    public void draw(GraphicsContext g) {
        g.setFill(colour);
        g.setStroke(colour);
        if (isFilled) {
            g.fillRect(x, y, height, width);
        } else {
            g.strokeRect(x, y, height, width);
        }
    }
}