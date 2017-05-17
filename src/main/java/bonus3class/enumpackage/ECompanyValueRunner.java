/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus3class.enumpackage;

/**
 *
 * @author Family
 */
public class ECompanyValueRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("111");
        ECompanyValue ecv = ECompanyValue.valueOf("EPAM");
        System.out.print(ecv.ordinal());
        System.out.println(" : " + ecv + " : " + ecv.getName() + " " + ecv.name());
    }
}