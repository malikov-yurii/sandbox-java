/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus3class.logic;

/**
 *
 * @author Maksym
 */
public class User {

    {
        System.out.println("1 id = " + this.id);
        System.out.println("Final Value = " + this.VALUE);
    }

    static {
        System.out.println("static");
    }
    private int id = 7;
    private final int VALUE = 5;

    public User(int d) {
        id = d;
        System.out.println("Constructor id = " + id);
    }

    public int getId() {
        return id;
    }

    {
        id = 77;
        System.out.println("2 id = " + id);
    }
}
