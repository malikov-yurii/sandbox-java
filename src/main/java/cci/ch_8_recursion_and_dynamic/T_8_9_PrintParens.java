package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.List;

public class T_8_9_PrintParens {

    public static List<String> getParentheses(int pairNum) {
        List<String> all = new ArrayList<>();
        getParens(pairNum -1, pairNum, "(", all);
        return all;
    }

    private static void getParens(int openRemaining, int closeRemaining, String prefix, List<String> all) {
        if (openRemaining == 0 && closeRemaining == 0) {
            all.add(prefix);
        } else {
            if (openRemaining > 0) {
                getParens(openRemaining - 1, closeRemaining, prefix + "(", all);
            }
            if (closeRemaining > 0 && closeRemaining > openRemaining) {
                getParens(openRemaining, closeRemaining - 1, prefix + ")", all);
            }
        }
    }

}
