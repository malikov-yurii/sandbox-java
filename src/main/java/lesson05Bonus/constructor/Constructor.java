/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05Bonus.constructor;

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
