/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tmp.bonus3class.constructor;

/**
 *
 * @author Maksym
 */
public class DistanceLogic {
    public double getDistance(DistancePoint pc1,DistancePoint pc2){
        return Math.hypot(pc1.getX()-pc2.getX(), pc1.getY()-pc2.getY());
    }
}
