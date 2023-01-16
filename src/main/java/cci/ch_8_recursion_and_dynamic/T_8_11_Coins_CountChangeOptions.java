package cci.ch_8_recursion_and_dynamic;

import java.util.HashMap;
import java.util.Map;

public class T_8_11_Coins_CountChangeOptions {

    private static int iterations;

    public static int countChangeOptions(int cents) {
        iterations = 0;
        int[] denominations = {25, 10, 5, 1};
        int result = countChangeOptions(cents, denominations, 0, new HashMap<>());
        System.out.println("iterations = " + iterations);
        return result;
    }

    private static int countChangeOptions(int remainingCents, int[] denoms, int ind, Map<Integer, int[]> memo) {
        iterations++;
        if (ind == denoms.length - 1) {
            return 1;
        }
        int[] cache = memo.computeIfAbsent(remainingCents, k -> new int[denoms.length]);
        if (cache[ind] > 0) {
            return cache[ind];
        }
        int denomination = denoms[ind];
        int count = 0;
        for (int val = 0; val < remainingCents; val += denomination) {
            count += countChangeOptions(remainingCents - val, denoms, ind + 1, memo);
        }
        cache[ind] = count;
        return count;
    }

}
