/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tmp.bonus3class.enumpackage;

/**
 * @author Family
 */
public enum ECompanyValue {

    EPAM("Pupkin"), LUXOFT("Terminator"), CIKLUM("Pokemon");

    String name;

    ECompanyValue(String arg) {
        name = arg;
    }

    String getName() {
        return name;
    }

}