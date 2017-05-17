/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.interfacepackage;

/**
 *
 * @author Family
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void printFeatures(Shape f){
        System.out.printf("Square:%.2f Perimeter: %.2f%n", f.getSquare(), f.getPerimeter());
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 9.95);
        Circle c = new Circle(7.01);
          printFeatures(r);
          printFeatures(c);
    }

}
