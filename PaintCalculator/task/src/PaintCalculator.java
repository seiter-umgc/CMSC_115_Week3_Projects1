import java.util.Scanner;

/**
 * PaintCalculator class calculates the cost to paint
 * the walls and ceiling of a rectangular room.
 * @author First Last
 */
public class PaintCalculator {

    /**
     * main - Prompt for room dimensions and print resulting measures.
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter room length and width.");
        double length = in.nextDouble();
        double width = in.nextDouble();
        System.out.println("Ceiling area = " + ceilingArea(length, width));
    }

    /**
     * ceilingArea - Returns the ceiling area given the room length and width.
     * @param length - the room length as a double.
     * @param width - the room width as a double.
     * @return the ceiling area as a double.
     */
    public static double ceilingArea(double length, double width) {
        return 0.0;  //TODO Task#1
    }

    /**
     * wallArea - Returns the wall area given the room length, width, and height.
     * @param length - the room length as a double.
     * @param width - the room width as a double.
     * @param height - the room height as a double.
     * @return the wall area as a double.
     */
    //TODO Task#2


    /**
     * roomArea - Returns the total ceiling and wall area given the room length, width, and height.
     * @param length - the room length as a double.
     * @param width - the room width as a double.
     * @param height - the room height as a double.
     * @return the total ceiling and wall area as a double.
     */
    //TODO Task#3


    /**
     * gallonsPaint - Returns the gallons of paint needed to cover the ceiling and walls given the room length, width, and height.
     * @param length - the room length as a double
     * @param width - the room width as a double
     * @param height - the room height as a double
     * @return the gallons of paint as an int
     */
    //TODO Task#4


}
