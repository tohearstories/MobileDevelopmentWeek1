package georgeosterweekone;

import java.util.Scanner;

/**
 *
 * @author tug25013
 */
public class GeorgeOsterWeekOne {

   
    public static void main(String[] args) {
       
        Scanner qwerty = new Scanner(System.in);
        
        Square gSquare = new Square("Square");
        Circle gCircle = new Circle("Circle");
        Triangle gTriangle = new Triangle("Triangle");
        EquilateralTriangle gEquilateralTriangle = new EquilateralTriangle("EquilateralTriangle");
        
        System.out.print("\nEnter the height of the square: ");
        double height = qwerty.nextDouble();
        System.out.print("\nEnter the length of the square: ");
        double length = qwerty.nextDouble();
        gSquare.setDimensions(length, height);
        
        System.out.print("\nEnter the radius of the circle: ");
        double radius = qwerty.nextDouble();
        gCircle.setDimensions(radius);
        
        System.out.print("\nEnter sideA of the triangle: ");
        double sideA = qwerty.nextDouble();
        System.out.print("\nEnter sideB of the triangle: ");
        double sideB = qwerty.nextDouble();
        System.out.print("\nEnter sideC of the triangle: ");
        double sideC = qwerty.nextDouble();
        gTriangle.setDimensions(sideA, sideB, sideC);
        
        System.out.print("\nEnter the length of the sides of the Equilateral Triangle.");
        double side  = qwerty.nextDouble();
        gEquilateralTriangle.setDimensions(side);
        
        System.out.print("\n" + gSquare.getName() + "\n");
        gSquare.printDimensions();
        System.out.print("area: " + gSquare.getArea() + "\n");
        
        System.out.print("\n" + gCircle.getName() + "\n");
        gCircle.printDimensions();
        System.out.print("area: " + gCircle.getArea() + "\n");
        
        System.out.print("\n" + gTriangle.getName() + "\n");
        gTriangle.printDimensions();
        System.out.print("area: " + gTriangle.getArea() + "\n");
        
        System.out.print("\n" + gEquilateralTriangle.getName() + "\n");
        gEquilateralTriangle.printDimensions();
        System.out.print("area: " + gEquilateralTriangle.getArea() + "\n");
        
        
    }
    
}
