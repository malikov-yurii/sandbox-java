/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tmp.bonus3class.generic;

/**
 *
 * @author Family
 */
public class GenericClass<T> {

    private T value;

    public GenericClass() {
    }

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T val) {
        value = val;
    }

    public String toString() {
        if (value == null) {
            return null;
        }
        return value.getClass().getName() + " " + value;
    }
}
