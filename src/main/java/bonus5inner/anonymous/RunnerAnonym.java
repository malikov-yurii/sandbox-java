/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.anonymous;

/**
 *
 * @author Family
 */
public class RunnerAnonym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TypeQuest unique = new TypeQuest(){
                 public void addNewType(){
                     System.out.println("anonymous 1");
                 }
       };
       unique.addNewType();

       new TypeQuest(71){
           private String name = "Drag&Drop";

           public void addNewType(){
               System.out.println("anonymous 2 +" + getName());
           }
           String getName(){
               return name;
           }
       }.addNewType();

       TypeQuest standard = new TypeQuest(35);
       standard.addNewType();
    }


}
