/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.inner;

/**
 *
 * @author Family
 */
public class AnySession {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Student stud = new Student(822201);
         String ex[] = {"Math","Programming"};
         int marks[] = {7, 3};
         stud.setExams(ex, marks);
           System.out.println(stud);
    }

}
