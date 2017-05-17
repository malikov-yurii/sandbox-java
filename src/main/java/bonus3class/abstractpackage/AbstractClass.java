/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus3class.abstractpackage;

/**
 *
 * @author Maksym
 */
public abstract class AbstractClass {

    private int id;
    private String name;

    public AbstractClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void setId(int id);

    public void setName(String name) {
        this.name = name;
    }
}
