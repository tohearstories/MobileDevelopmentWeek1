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
public class Triangle extends Shape {

    double sideA;
    double sideB;
    double sideC;

    public Triangle(String name) {
        super(name);
    }

    public void setDimensions(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void printDimensions() {
        System.out.println("sideA: " + sideA + "\nsideB: " + sideB + "\nsideC: " + sideC);
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2.0; 
        return Math.sqrt((s) * (s - sideA) * (s - sideB) * (s - sideC));
    }

}
