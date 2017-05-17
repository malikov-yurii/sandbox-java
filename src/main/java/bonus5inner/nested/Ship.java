/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.nested;

/**
 *
 * @author Family
 */
public class Ship {
     private int id;

     public static class LifeBoat {
         public static void down(){
             System.out.println("boat to water!");
         }
         public void swim(){
             System.out.println("boat to go!");
         }
     }
}
