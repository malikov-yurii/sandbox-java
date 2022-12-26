package cci.ch_4_graphs_and_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T_4_9_BSTSequences {

    public static List<LinkedList<Integer>> getSequences(TreeNode<Integer> node) {
        if (node == null) {
            return new LinkedList<>();
        }
        List<LinkedList<Integer>> weave = weave(getSequences(node.left), getSequences(node.right));
        weave.forEach(list -> list.addFirst(node.data));
        return weave;
    }

    private static List<LinkedList<Integer>> weave(List<LinkedList<Integer>> lists1,
                                                   List<LinkedList<Integer>> lists2) {
        List<LinkedList<Integer>> weave = new LinkedList<>();
        if (lists1.isEmpty() && lists2.isEmpty()) {
            weave.add(new LinkedList<>());
        } else if (lists1.isEmpty()) {
            weave.addAll(lists2);
        } else if (lists2.isEmpty()) {
            weave.addAll(lists1);
        } else {
            for (LinkedList<Integer> list1 : lists1) {
                for (LinkedList<Integer> list2 : lists2) {
                    weave.addAll(weaveTwoLists(list1, list2, new LinkedList<>()));
                }
            }
        }
        return weave;
    }

    static List<LinkedList<Integer>> weaveTwoLists(LinkedList<Integer> first,
                                                   LinkedList<Integer> second,
                                                   LinkedList<Integer> prefix) {
        ArrayList<LinkedList<Integer>> weave = new ArrayList<>();
        if (first.isEmpty() || second.isEmpty()) {
            LinkedList<Integer> result = new LinkedList<>(prefix);
            result.addAll(first);
            result.addAll(second);
            weave.add(result);
        } else {
            weave.addAll(moveToPrefixAndWeave(first, second, prefix));
            weave.addAll(moveToPrefixAndWeave(second, first, prefix));
        }
        return weave;
    }

    private static List<LinkedList<Integer>> moveToPrefixAndWeave(LinkedList<Integer> splitList,
                                                                  LinkedList<Integer> remainingList,
                                                                  LinkedList<Integer> prefixList) {
        Integer element = splitList.removeFirst();
        prefixList.addLast(element);
        List<LinkedList<Integer>> weave = weaveTwoLists(splitList, remainingList, prefixList);
        prefixList.removeLast();
        splitList.addFirst(element);
        return weave;
    }

}
