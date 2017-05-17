/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus3class.overloading;

/**
 *
 * @author Maksym
 */
public class OverloadingClass {

    public static void methodPrint(int i) {
        System.out.printf("int= %d%n", i);
    }

    public static void methodPrint(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }

//    public static void methodPrint(Float f) {
//
//        System.out.printf("Float= %.4f%n", f);
//    }
    public static void methodPrint(Double f) {
        System.out.printf("Double= %.4f%n", f);
    }

    public static void methodPrint(Number n) {
        System.out.printf("Number= " + n + "%n");
    }

    public static void main(String[] args) {
        Number[] num = {new Integer(7), 71, 3.14f, 7.2};
        for (Number n : num) {
            methodPrint(n);
        }

        Number nn = new Integer(77);

        methodPrint(7);
        methodPrint(nn);
        methodPrint(new Integer(77));
        methodPrint(7.77f);
        methodPrint(7.7);
//          methodPrint(new Integer(8));
    }
}
