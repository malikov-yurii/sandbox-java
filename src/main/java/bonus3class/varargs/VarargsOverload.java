/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus3class.varargs;

/**
 *
 * @author Family
 */
public class VarargsOverload {

    public static void printArgCount(int... args) {
        System.out.println("int args: " + args.length);
    }

    public static void printArgCount(Integer[]... args) {//[]
        System.out.println("Integer[] args: " + args.length);
    }

    public static void printArgCount(Object... args) { //...
        System.out.println("Object args: " /*+ args.length*/);
    }

    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5, 6, 7};

        printArgCount(1, "No", true, null);  //3
        printArgCount(i, i, i);    //2
        printArgCount(i, 7, 77);   //3
        printArgCount(i);         //2
//        printArgCount(1, 7);
    }
}
