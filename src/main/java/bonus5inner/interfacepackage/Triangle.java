/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.interfacepackage;

/**
 *
 * @author Family
 */
public abstract class Triangle implements Shape{
    private double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getPerimeter(){
        return a + b + c;
    }

}
