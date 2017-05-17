/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus3class.constructor;

/**
 *
 * @author Maksym
 */
public class DistanceRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DistancePoint dp1 = new DistancePoint(5,9);
        DistancePoint dp2 = new DistancePoint(1,6);
        double dl = new DistanceLogic().getDistance(dp1, dp2);
        System.out.println("Distance = " + dl);
    }
}
