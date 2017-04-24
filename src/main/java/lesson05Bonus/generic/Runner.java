/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lesson05Bonus.generic;

/**
 *
 * @author Family
 */
public class Runner {
     public static void main(String[] args){
         GenericClass<Integer> object1 = new GenericClass<>();
         object1.setValue(1);        
           System.out.println(object1.getValue());

         GenericClass<String> object2 = new GenericClass<>("Java");
           System.out.println(object2.getValue());

         GenericClass object3 = new GenericClass();         
           System.out.println(object3.getValue());

         object3.setValue("Generic Class");
           System.out.println(object3.toString());

         object3.setValue(7);
           System.out.println(object3);

         object3.setValue(null);
     }
}
