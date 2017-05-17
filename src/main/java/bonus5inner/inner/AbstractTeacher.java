/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus5inner.inner;

/**
 *
 * @author Family
 */
public abstract class AbstractTeacher {
      private int id;

      public AbstractTeacher(int id){
          this.id = id;
      }
      public abstract boolean excludeStudent(String name);
}
