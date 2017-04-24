/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05Bonus.enumpackage;

/**
 *
 * @author Family
 */
public class ShapeRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 2, y = 3;
        Shape[] arr = Shape.values();
        for (Shape sh : arr) {
            System.out.printf("%10s = %5.2f%n", sh, sh.square(x, y));
        }
    }
}
