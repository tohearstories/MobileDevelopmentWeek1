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
public class EquilateralTriangle extends Triangle {
    
    public EquilateralTriangle(String name) {
        super(name);
    }
    
    public void setDimensions(double side){
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
    }
    
    @Override
    public void printDimensions() {
        System.out.println("All sides are of length: " + sideA);
    }
    
    
}
