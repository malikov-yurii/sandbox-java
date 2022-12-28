package cci.ch_4_graphs_and_trees;

import java.util.HashMap;
import java.util.Map;

public class T_4_12_PathsWithSum {

    private final TreeNode<Integer> root;
    private final int targetSum;
    private Map<Integer, Integer> sumOccurrenceCount;
    private int count;

    public T_4_12_PathsWithSum(TreeNode<Integer> root, int sum) {
        this.root = root;
        this.targetSum = sum;
    }

    public static int countPaths(TreeNode<Integer> root, int sum) {
        return new T_4_12_PathsWithSum(root, sum).count();
    }

    public int count() {
        this.sumOccurrenceCount = new HashMap<>();
        this.sumOccurrenceCount.put(0, 1);
        count(root, 0);
        return count;
    }

    private void count(TreeNode<Integer> node, int runningSum) {
        if (node == null) {
            return;
        }
        int newRunningSum = runningSum + node.data;
        int sumOccurrence = newRunningSum - targetSum;
//        System.out.printf("count=%d node.data=%d  runningSum=%d  newRunningSum=%d  sumOccurrence=%d  %s\n",
//                count, node.data, runningSum, newRunningSum, sumOccurrence, sumOccurrenceCount);
        count += sumOccurrenceCount.getOrDefault(sumOccurrence, 0);
        sumOccurrenceCount.put(newRunningSum, sumOccurrenceCount.getOrDefault(newRunningSum, 0) + 1);
        count(node.left, newRunningSum);
        count(node.right, newRunningSum);
        sumOccurrenceCount.put(newRunningSum, sumOccurrenceCount.get(newRunningSum) - 1);
    }

}
