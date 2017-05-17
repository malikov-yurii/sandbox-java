/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.interfacepackage;

/**
 *
 * @author Family
 */
public class ShapeCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape sh;
        Rectangle re = new Rectangle(5, 9.95);
        sh = re;
        sh.getPerimeter();
        Circle cr = new Circle(7.01);
        sh = cr;
        sh.getPerimeter();
//        cr=re;       
    }

}
