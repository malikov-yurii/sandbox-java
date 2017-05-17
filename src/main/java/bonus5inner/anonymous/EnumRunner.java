/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.anonymous;

/**
 *
 * @author Family
 */
public class EnumRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 4;
        for(EnumShape f : EnumShape.values()){
            f.setShape(3, i--);
            System.out.println(f.name() + "-> " + f.getParameters() + " площадь= " + f.getSquare());
        }
    }

}
