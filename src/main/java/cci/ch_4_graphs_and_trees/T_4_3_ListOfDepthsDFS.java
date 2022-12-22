package cci.ch_4_graphs_and_trees;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class T_4_3_ListOfDepthsDFS {

    public static List<List<Integer>> getListOfDepthUsingDFS(TreeNode<Integer> root) {
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        addNodeToLists(root, 0, map);
        return new LinkedList<>(map.values());
    }

    private static void addNodeToLists(TreeNode<Integer> node, int depth, Map<Integer, List<Integer>> map) {
        if (node != null) {
            List<Integer> level = map.computeIfAbsent(depth, i -> new LinkedList<>());
            level.add(node.data);
            depth++;
            addNodeToLists(node.left, depth, map);
            addNodeToLists(node.right, depth, map);
        }
    }

}
