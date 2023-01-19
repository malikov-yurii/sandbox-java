package cci.ch_8_recursion_and_dynamic;

import java.util.HashMap;
import java.util.Map;

public class T_8_14_BooleanEvaluation {

    public static int countParenWays(String s, boolean result) {
        return countWays(s, result, new HashMap<>());
    }

    private static int countWays(String str, boolean result, Map<String, Integer> memo) {
        if (str.length() == 1) {
            return isOne(str) == result ? 1 : 0;
        }
        String memoKey = str + result;
        if (memo.containsKey(memoKey)) {
            return memo.get(memoKey);
        }
        int finalCount = 0;
        for (int i = 1; i < str.length(); i += 2) {
            int trueWayCount = 0;
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            int leftTrue = countWays(left, true, memo);
            int leftFalse = countWays(left, false, memo);
            int rightTrue = countWays(right, true, memo);
            int rightFalse = countWays(right, false, memo);
            int totalWayCount = (leftTrue + leftFalse) * (rightTrue + rightFalse);
            char operator = str.charAt(i);
            if (operator == '&') {
                trueWayCount = leftTrue * rightTrue;
            } else if (operator == '|') {
                trueWayCount = leftTrue * rightTrue + leftFalse * rightTrue + leftTrue * rightFalse;
            } else if (operator == '^') {
                trueWayCount = leftFalse * rightTrue + leftTrue * rightFalse;
            }
            finalCount += result ? trueWayCount : totalWayCount - trueWayCount;
        }
        memo.put(memoKey, finalCount);
        return finalCount;
    }

    private static boolean isOne(String str) {
        return str.charAt(0) == '1';
    }

}
