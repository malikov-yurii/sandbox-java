package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.List;

public class T_8_9_PrintParens_Impr {

    public static List<String> getParentheses(int pairNum) {
        List<String> all = new ArrayList<>();
        char[] str = new char[pairNum * 2];
        getParens(pairNum, pairNum, str, all, 0);
        return all;
    }

    private static void getParens(int leftRemaining, int rightRemaining, char[] str, List<String> all, int ind) {
        if (leftRemaining == 0 && rightRemaining == 0) {
            all.add(new String(str));
        } else {
            if (leftRemaining > 0) {
                str[ind] = '(';
                getParens(leftRemaining - 1, rightRemaining, str, all, ind + 1);
            }
            if (rightRemaining > 0 && rightRemaining > leftRemaining) {
                str[ind] = ')';
                getParens(leftRemaining, rightRemaining - 1, str, all, ind + 1);
            }
        }
    }

}
