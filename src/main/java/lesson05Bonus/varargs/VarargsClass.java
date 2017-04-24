/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05Bonus.varargs;

/**
 *
 * @author Family
 */
public class VarargsClass {

    public static int getArgLength(Integer... args) {
        if (args.length == 0) {
            System.out.print("No args=");
        }
        for (int i : args) {
            System.out.print("arg:" + i + "  ");
        }
        return args.length;
    }

    public static void main(String args[]) {
        System.out.println("N= " + getArgLength(7, 10));
        Integer[] i = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("N= " + getArgLength(i));
        System.out.println(getArgLength());
    }
}
