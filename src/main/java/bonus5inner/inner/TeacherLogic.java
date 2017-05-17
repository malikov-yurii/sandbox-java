/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.inner;

/**
 *
 * @author Family
 */
public class TeacherLogic {

    /**
     * @param args the command line arguments
     */
    public static void excludeProcess(int deanId, String name){
        AbstractTeacher teacher = new TeacherCreator().createTeacher(deanId);
        System.out.println("Student: " + name + " exclude:" + teacher.excludeStudent(name));
    }
    public static void main(String[] args) {
        excludeProcess(700, "Balaganov");
        excludeProcess(777, "Kalganov");
    }

}
