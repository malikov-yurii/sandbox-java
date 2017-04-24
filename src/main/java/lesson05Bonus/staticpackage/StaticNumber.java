/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05Bonus.staticpackage;

/**
 *
 * @author Maksym
 */
public class StaticNumber {
    private int number = 7;
    public static int value = 7;
    public int coefficient = 7;

    public int getNumber() {
        return number*value/100;
    }

    public void setNumber(int number) {
        this.number = number;
    }
            
//    public static double getNumber(){
//        setNumber(10);
//        return number*coefficient/100;
//    }
    
    public static void staticSetCoeff(int coef){
        value = value*coef;
    }
}
