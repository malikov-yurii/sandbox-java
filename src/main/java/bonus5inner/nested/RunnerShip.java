/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.nested;

/**
 *
 * @author Family
 */
public class RunnerShip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Ship.LifeBoat.down();
           Ship.LifeBoat lf = new Ship.LifeBoat();
           lf.swim();
    }

}
