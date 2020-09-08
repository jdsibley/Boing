/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author you
 *
 */

import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;


public class ReadShapeFile {


    /**
     * Reads the data file used by the program and returns the constructed queue
     * 
     * @param in
     *            the scanner of the file
     * @return the queue represented by the data file
     * @throws FileNotFoundException 
     */
    private static Queue < ClosedShape > readDataFile(Scanner in ) {
        Queue < ClosedShape > shapeQueue = new Queue < ClosedShape > ();
        //read in the shape files and place them on the Queue
        //Right now, returning an empty Queue.  You need to change this.
        while (in.hasNextLine() && in.hasNext()) {
    		String nextShape = in.next();
    		switch (nextShape) {
                case "circle":
                    shapeQueue.enqueue(readCircle( in ));
                    break;
                case "oval":
                    shapeQueue.enqueue(readOvall( in ));
                    break;
                case "rect":
                    shapeQueue.enqueue(readRect( in ));
                    break;
                case "square":
                    shapeQueue.enqueue(readSquare( in ));
                    break;
                default:
                    break;
            }
        }
        return shapeQueue;
    }


    /**
     * Method to read the file and return a queue of shapes from this file. The
     * program should handle the file not found exception here and shut down the
     * program gracefully.
     * 
     * @param filename
     *            the name of the file
     * @return the queue of shapes from the file
     * @throws FileNotFoundException 
     */
    public static Queue < ClosedShape > readDataFile(String filename) {
        // HINT: You might want to open a file here.
        File file = new File(filename);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.exit(0);
        }
        return ReadShapeFile.readDataFile(scanner);

    }

    public static Circle readCircle(Scanner in ) {

        int x = in .nextInt();
        int y = in .nextInt();
        int vx = in .nextInt();
        int vy = in .nextInt();
        boolean isFilled = in .nextBoolean();
        int diameter = in .nextInt();
        double r = in .nextDouble();
        double g = in .nextDouble();
        double b = in .nextDouble();
        int insertionTime = in .nextInt();

        double rval = r / 255;
        double gval = g / 255;
        double bval = b / 255;

        Color colour = new Color(rval, gval, bval, 1);

        Circle circle = new Circle(insertionTime, x, y, vx, vy, diameter, colour, isFilled);
        return circle;
    }

    public static Oval readOvall(Scanner in ) {

        int x = in .nextInt();
        int y = in .nextInt();
        int vx = in .nextInt();
        int vy = in .nextInt();
        boolean isFilled = in.nextBoolean();
        int width = in .nextInt();
        int height = in .nextInt();
        double r = in .nextDouble();
        double g = in .nextDouble();
        double b = in .nextDouble();
        int insertionTime = in.nextInt();

        double rval = r / 255;
        double gval = g / 255;
        double bval = b / 255;

        Color colour = new Color(rval, gval, bval, 1);

        Oval oval = new Oval(insertionTime, x, y, vx, vy, width, height, colour, isFilled);
        return oval;
    }

    public static Square readSquare(Scanner in ) {

        int x = in .nextInt();
        int y = in .nextInt();
        int vx = in .nextInt();
        int vy = in .nextInt();
        boolean isFilled = in .nextBoolean();
        int sideLength = in .nextInt();
        double r = in .nextDouble();
        double g = in .nextDouble();
        double b = in .nextDouble();
        int insertionTime = in .nextInt();

        double rval = r / 255;
        double gval = g / 255;
        double bval = b / 255;

        Color colour = new Color(rval, gval, bval, 1);

        Square square = new Square(insertionTime, x, y, vx, vy, sideLength, colour, isFilled);
        return square;
    }

    public static Rect readRect(Scanner in ) {

        int x = in .nextInt();
        int y = in .nextInt();
        int vx = in .nextInt();
        int vy = in .nextInt();
        boolean isFilled = in .nextBoolean();
        int width = in .nextInt();
        int height = in .nextInt();
        double r = in .nextDouble();
        double g = in .nextDouble();
        double b = in .nextDouble();
        int insertionTime = in .nextInt();

        double rval = r / 255;
        double gval = g / 255;
        double bval = b / 255;

        Color colour = new Color(rval, gval, bval, 1);

        Rect rect = new Rect(insertionTime, x, y, vx, vy, width, height, colour, isFilled);
        return rect;
    }
}