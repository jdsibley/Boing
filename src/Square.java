/**
 * Square.java
 * @version 1.0.0
 * Written by James Sibley
 */

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Square is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the Squares bounding rectangle.
 * The square has a side length which determines its size
 */

public class Square extends ClosedShape {
    //Side length of the square.
    private int sideLength;

    /**
     * Creates a Square
     * @param x The display component's x position.
     * @param y The display component's y position.
     * @param vx The display component's x velocity.
     * @param vy The display component's y velocity.
     * @param sideLength The side length of the sqwaure.
     * @param colour The line colour or fill colour.
     * @param isFilled True if the circle is filled with colour, false if opaque.
     */

    public Square(int insertionTime, int x, int y, int vx, int vy, int sideLength, Color colour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, colour, isFilled);
        this.sideLength = sideLength;

    }

    /**
     * Method to convert a square to a string, formatting
     * its properties so they can be read.
     */
    public String toString() {
        String result = "This is a sqaure\n";
        result += super.toString();
        result += "Its side length is " + this.sideLength + "\n";
        return result;
    }


    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Draw the circle on the screen.
     * @param g The graphics object of the scene component.
     */
    public void draw(GraphicsContext g) {
        g.setFill(colour);
        g.setStroke(colour);
        if (isFilled) {
            g.fillRect(x, y, sideLength, sideLength);
        } else {
            g.strokeRect(x, y, sideLength, sideLength);
        }
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return sideLength;
    }

    /**
     * @return The height of the circle
     */
    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return sideLength;
    }


}