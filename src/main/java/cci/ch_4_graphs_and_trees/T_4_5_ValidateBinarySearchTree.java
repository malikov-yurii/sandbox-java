package cci.ch_4_graphs_and_trees;

public class T_4_5_ValidateBinarySearchTree {

    public static boolean isBinarySearchTree(TreeNode<Integer> root) {
        return root != null && isInRange(null, root, null);
    }

    private static boolean isInRange(Integer minExclusive, TreeNode<Integer> node, Integer maxInclusive) {
        return node == null
                || (minExclusive == null || node.data > minExclusive)
                && (maxInclusive == null || node.data <= maxInclusive)
                && isInRange(minExclusive, node.left, node.data)
                && isInRange(node.data, node.right, maxInclusive);
    }

}
