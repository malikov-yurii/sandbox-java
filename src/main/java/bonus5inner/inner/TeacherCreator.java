/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.inner;

/**
 *
 * @author Family
 */
public class TeacherCreator {
     public TeacherCreator(){
     }

     public AbstractTeacher createTeacher(int id){
         class Dean extends AbstractTeacher {
             Dean (int id){
                 super(id);
             }
             public boolean excludeStudent(String name){
                 if (name != null){
                     return true;
                 }
                 else return false;
             }
         }

         if (isDeanId(id))
             return new Dean(id);
         else return new Teacher(id);
     }
     private static boolean isDeanId(int id){
         return (id == 777);
     }
}
