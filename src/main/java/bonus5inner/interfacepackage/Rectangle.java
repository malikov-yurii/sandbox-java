/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.interfacepackage;

/**
 *
 * @author Family
 */
public class Rectangle implements Shape{
    private double a, b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getSquare(){
        return a * b;
    }
    public double getPerimeter(){
        return 2 * (a + b);
    }

}
