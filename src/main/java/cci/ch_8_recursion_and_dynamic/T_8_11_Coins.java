package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.List;

public class T_8_11_Coins {

    public static List<int[]> getExchangeOptions(int cents) {
        ArrayList<int[]> options = new ArrayList<>();
        int[] denominations = {25, 10, 5, 1};
        findOptions(cents, denominations, 0, new int[denominations.length], options);
        return options;
    }

    private static void findOptions(int cents, int[] denoms, int ind, int[] coins, ArrayList<int[]> result) {
        int denomination = denoms[ind];
        int maxCoinNum = cents / denomination;
        if (ind + 1 == denoms.length && cents % denomination == 0) {
            coins[ind] = maxCoinNum;
            result.add(coins.clone());
        } else {
            for (int i = 0; i <= maxCoinNum; i++) {
                coins[ind] = i;
                findOptions(cents - i * denomination, denoms, ind + 1, coins, result);
            }
        }
    }

}
