package cci.ch_4_graphs_and_trees;

import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class T_4_10_CheckSubtreeBFS {

    public static <T extends Comparable<T>> boolean checkSubtree(TreeNode<T> bigTree, TreeNode<T> smallTree) {
        if (smallTree == null) {
            return true;
        }
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.offer(bigTree);
        while (!queue.isEmpty()) {
            TreeNode<T> bigTreeNode = queue.poll();
            if (treeEquals(bigTreeNode, smallTree)) {
                return true;
            }
            if (bigTreeNode.left != null) {
                queue.offer(bigTreeNode.left);
            }
            if (bigTreeNode.right != null) {
                queue.offer(bigTreeNode.right);
            }
        }
        return false;
    }

    private static <T extends Comparable<T>> boolean treeEquals(TreeNode<T> n1, TreeNode<T> n2) {
        Queue<Pair<TreeNode<T>, TreeNode<T>>> queue = new LinkedList<>();
        queue.offer(Pair.of(n1, n2));
        while (!queue.isEmpty()) {
            Pair<TreeNode<T>, TreeNode<T>> pair = queue.poll();
            if (pair.getLeft() == null && pair.getRight() == null) {
                continue;
            }
            if (pair.getLeft() == null || pair.getRight() == null
                    || !Objects.equals(pair.getLeft().data, pair.getRight().data)) {
                return false;
            }
            queue.offer(Pair.of(pair.getLeft().left, pair.getRight().left));
            queue.offer(Pair.of(pair.getLeft().right, pair.getRight().right));
        }
        return true;
    }

}
