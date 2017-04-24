/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05Bonus.finalpackage;

/**
 *
 * @author Maksym
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User obj1 = new User("User");
        User obj2 = new User();
        System.out.println(obj1.ID);
        System.out.println(obj2.checkPermision(1234567));
    }
}
