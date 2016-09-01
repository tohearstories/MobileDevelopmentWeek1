/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeosterweekone;

/**
 *
 * @author tug25013
 */
public class Square extends Shape {

    double length;
    double height;

    public Square(String name) {
        super(name);
    }

    public void setDimensions(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void printDimensions() {
        System.out.println("length: " + length + " \nheight: " + height);
    }

    @Override
    public double getArea() {
        return length * height;
    }

}
