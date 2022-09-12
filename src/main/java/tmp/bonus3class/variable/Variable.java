/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tmp.bonus3class.variable;

import java.util.Calendar;

/**
 *
 * @author Maksym
 */
public class Variable {
    private int instanceVariable;  //default value 0
    int instanceVariable2 = 7;
    static String classVariable = "Variable example";
    protected static int classVariable2;
    protected Calendar initCalendar;  //default value null
    public final int CONST = 1986;
    
    public int variableMethod(int parameterVariable){
        int localVariable;   //no default initialization
        parameterVariable++;
//        localVariable++;
        localVariable = 7;
        localVariable++;
        initCalendar = Calendar.getInstance();
        return localVariable + instanceVariable + instanceVariable2 + parameterVariable;
    }
    
}
