/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tmp.bonus3class.nativepackage;

/**
 *
 * @author Maksym
 */
public class Native {

    public native int nativeMethod();

    static {
        System.load("C:/temp/libArticle2.dll");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Native tp = new Native();
        System.out.println("Before");
        int result = tp.nativeMethod();
        System.out.println("After");
        System.out.println("Result=" + result);
    }
}
