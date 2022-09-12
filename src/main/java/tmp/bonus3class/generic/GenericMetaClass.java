/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tmp.bonus3class.generic;

/**
 *
 * @author Family
 */
public class GenericMetaClass<T extends Number> {

    public T mark;

    public GenericMetaClass(T value) {
        mark = value;
    }

    public T getMark3() {
        return mark;
    }

    public int roundMark3() {
        return Math.round(mark.floatValue());
    }

//    public boolean sameAny(GenericMetaClass<T> ob){
    public boolean sameAny(GenericMetaClass<?> ob) {
        return roundMark3() == ob.roundMark3();
    }

    public boolean same(GenericMetaClass<T> ob) {
        return getMark3() == ob.getMark3();
    }
}
