/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05Bonus.finalpackage;

/**
 *
 * @author Maksym
 */
public class User {

    final int ID = (int) (Math.random() * 10);
    final String NAME;
    
    public User() {
        this.NAME = "User";
    }

    public User(String NAME) {
        this.NAME = NAME;
    }
    {
//        NAME = "User";
    }

    public final void finalChange() {
//        ID = 7;
    }

    public boolean checkPermision(final int code) {
        final int CODE;
        System.out.println("of");
        CODE = 1234567;
        if (CODE == code) {
            return true;
        } else {
            return false;
        }
    }
}
