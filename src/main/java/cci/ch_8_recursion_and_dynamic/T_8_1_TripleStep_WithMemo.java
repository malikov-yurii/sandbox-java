package cci.ch_8_recursion_and_dynamic;

public class T_8_1_TripleStep_WithMemo {

    static int visits = 0;

    public static int countStepPathsToStareNumber(int n) {
        visits = 0;
        if (n == 0) {
            return 0;
        }
        int result = countPaths(n, new int[n + 1]);
        System.out.printf("Enhanced: res=%d  visits=%d\n", result, visits);
        return result;
    }

    private static int countPaths(int n, int[] memo) {
        visits++;
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n == 0) {
            return 1;
        }
        if (n < 3) {
            return n;
        }
        memo[n] = countPaths(n - 1, memo) + countPaths(n - 2, memo) + countPaths(n - 3, memo);
        return memo[n];
    }

}
