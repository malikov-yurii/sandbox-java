package cci.ch_4_graphs_and_trees;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class T_4_3_ListOfDepthsBFS {

    public static List<List<Integer>> getListOfDepthUsingBFS(TreeNode<Integer> root) {
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        Queue<SearchStep> queue = new LinkedList<>();
        queue.offer(new SearchStep(root, 0));
        while (!queue.isEmpty()) {
            SearchStep searchStep = queue.poll();
            List<Integer> levelNodes = map.computeIfAbsent(searchStep.depth, i -> new LinkedList<>());
            TreeNode<Integer> n = searchStep.node;
            levelNodes.add(n.data);
            int nextDepth = searchStep.depth + 1;
            enqueueSearchStep(n.left, nextDepth, queue);
            enqueueSearchStep(n.right, nextDepth, queue);
        }
        return new LinkedList<>(map.values());
    }

    private static void enqueueSearchStep(TreeNode<Integer> node, int depth, Queue<SearchStep> queue) {
        if (node != null) {
            queue.offer(new SearchStep(node, depth));
        }
    }

    static class SearchStep {
        TreeNode<Integer> node;
        int depth;

        public SearchStep(TreeNode<Integer> node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

}
