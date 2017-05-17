/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.inner;

/**
 *
 * @author Family
 */
public class Teacher extends AbstractTeacher{

    public Teacher(int id){
        super(id);
    }
    public boolean excludeStudent(String name){
        return false;
    }
}
