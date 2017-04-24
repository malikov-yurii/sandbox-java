/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05Bonus.staticpackage;

/**
 *
 * @author Maksym
 */
public class StaticRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaticNumber snObject1 = new StaticNumber();
        StaticNumber snObject2 = new StaticNumber();
        System.out.println("object 1 = " + snObject1.value);
        System.out.println("object 2 = " + snObject2.value);
        StaticNumber.value = 5;       
        System.out.println("object 3 = " + snObject1.value);
        StaticNumber.staticSetCoeff(2);
        System.out.println("static method = " + StaticNumber.value);
        snObject1.staticSetCoeff(2);
        System.out.println("object method = " + StaticNumber.value);
    }
}
