/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05Bonus.constructor;

/**
 *
 * @author Maksym
 */
public class DistancePoint {

    private final double X;
    private final double Y;

    public DistancePoint(final double X, final double Y) {
        super();
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }
}
