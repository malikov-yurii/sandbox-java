package cci.ch_8_recursion_and_dynamic;

public class T_8_1_TripleStep {

    static int visits = 0;

    public static int countStepPathsToStareNumber(int n) {
        visits = 0;
        if (n == 0) {
            return 0;
        }
        int result = countPaths(n);
        System.out.printf("res=%d  visits=%d\n", result, visits);
        return result;
    }

    private static int countPaths(int n) {
        visits++;
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return countPaths(n - 1) + countPaths(n - 2) + countPaths(n - 3);
    }

}
