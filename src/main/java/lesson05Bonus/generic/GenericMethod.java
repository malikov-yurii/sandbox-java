/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05Bonus.generic;

/**
 *
 * @author Family
 */
public class GenericMethod {

    public static <T extends Number> byte asByte(T num) {
        long n = num.longValue();
        if (n >= -128 && n <= 127) {
            return (byte) n;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(asByte(5));
        System.out.println(asByte(new Float("5.f")));
    }
}
