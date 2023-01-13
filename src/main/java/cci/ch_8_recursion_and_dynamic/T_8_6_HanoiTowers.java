package cci.ch_8_recursion_and_dynamic;

import java.util.List;
import java.util.Stack;

public class T_8_6_HanoiTowers {

    static int steps;

    public static void moveFromFirstToLast(List<Stack<Integer>> towers) {
        steps = 0;
        int n = towers.get(0).size();
        moveN(towers, 0, 2, n);
        System.out.println("steps=" + steps);
    }

    private static void moveN(List<Stack<Integer>> towers, int from, int to, int n) {
        if (n == 1) {
            /* base case */
            moveOne(towers, from, to);
        } else {
            /* n-1 case */
            int other = 3 - from - to;
            moveN(towers, from, other, n - 1);

            /* n case */
            moveOne(towers, from, to);
            moveN(towers, other, to, n - 1);
        }
    }

    private static void moveOne(List<Stack<Integer>> towers, int from, int to) {
        steps++;
        Integer i = towers.get(from).pop();
        towers.get(to).push(i);
    }

}
