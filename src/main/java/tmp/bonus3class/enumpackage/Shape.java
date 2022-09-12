/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tmp.bonus3class.enumpackage;

/**
 *
 * @author Family
 */
public enum Shape {

    RECTANGLE, TRIANGLE, CIRCLE;

    public double square(double x, double y) {
        switch (this) {
            case RECTANGLE:
                return x * y;
            case TRIANGLE:
                return x * y / 2;
            case CIRCLE:
                return Math.pow(x, 2) * Math.PI;     
        }
        throw new EnumConstantNotPresentException(
                this.getDeclaringClass(), this.name());
    }
}
