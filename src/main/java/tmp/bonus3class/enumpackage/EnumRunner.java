/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tmp.bonus3class.enumpackage;

/**
 *
 * @author Family
 */

public class EnumRunner {
     public static void main(String args[]){
         ECompany current;
         current = ECompany.EPAM;
         switch (current){
             case EPAM:
                 System.out.println(current);
                 break;
             case LUXOFT:
                 System.out.println(current);
                 break;
             default:
                 System.out.println("out class: " + current);
         }
     }
}
