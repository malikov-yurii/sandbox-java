package cci.ch_4_graphs_and_trees;

import java.util.LinkedList;
import java.util.List;

public class T_4_9_BSTSequences {

    public static List<LinkedList<Integer>> getSequences(TreeNode<Integer> node) {
        LinkedList<LinkedList<Integer>> sequences = new LinkedList<>();
        addSequences(node, sequences);
        return sequences;
    }

    private static void addSequences(TreeNode<Integer> node, LinkedList<LinkedList<Integer>> result) {
        if (node == null) {
            return;
        }
        List<LinkedList<Integer>> leftSequences = getSequences(node.left);
        List<LinkedList<Integer>> rightSequences = getSequences(node.right);
        weaveLists(leftSequences, rightSequences, result);
        result.forEach(list -> list.addFirst(node.data));
    }

    private static void weaveLists(List<LinkedList<Integer>> lists1,
                                   List<LinkedList<Integer>> lists2,
                                   List<LinkedList<Integer>> result) {
        if (lists1.isEmpty() && lists2.isEmpty()) {
            result.add(new LinkedList<>());
        } else if (lists1.isEmpty()) {
            result.addAll(lists2);
        } else if (lists2.isEmpty()) {
            result.addAll(lists1);
        } else {
            for (LinkedList<Integer> list1 : lists1) {
                for (LinkedList<Integer> list2 : lists2) {
                    weaveTwoLists(list1, list2, new LinkedList<>(), result);
                }
            }
        }
    }

    static void weaveTwoLists(LinkedList<Integer> first,
                              LinkedList<Integer> second,
                              LinkedList<Integer> prefix,
                              List<LinkedList<Integer>> result) {
        if (first.isEmpty() || second.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>(prefix);
            list.addAll(first);
            list.addAll(second);
            result.add(list);
        } else {
            moveToPrefixAndWeave(first, second, prefix, result);
            moveToPrefixAndWeave(second, first, prefix, result);
        }
    }

    private static void moveToPrefixAndWeave(LinkedList<Integer> splitList,
                                             LinkedList<Integer> remainingList,
                                             LinkedList<Integer> prefixList,
                                             List<LinkedList<Integer>> result) {
        Integer element = splitList.removeFirst();
        prefixList.addLast(element);
        weaveTwoLists(splitList, remainingList, prefixList, result);
        prefixList.removeLast();
        splitList.addFirst(element);
    }

}
