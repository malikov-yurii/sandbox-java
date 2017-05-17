/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.interfacepackage;

/**
 *
 * @author Family
 */
public class Circle implements Shape {
    private double r;

    public Circle(double r){
        this.r = r;
    }
    public double getSquare(){
        return Math.PI * Math.pow(r, 2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }

}
