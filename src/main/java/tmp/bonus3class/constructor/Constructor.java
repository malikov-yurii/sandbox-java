/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tmp.bonus3class.constructor;

/**
 *
 * @author Maksym
 */
public class Constructor {
    private int instanceVariable;
    private String strInstanceVariable;
    
    public Constructor(){
        super();
    }
    
    public Constructor(int instanceVariable,String strInstanceVariable){
        super();
        this.instanceVariable = instanceVariable;
        this.strInstanceVariable = strInstanceVariable;
    }
}
