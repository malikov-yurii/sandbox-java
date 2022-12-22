package cci.ch_4_graphs_and_trees;

public class T_4_4_CheckBalanced {

    public static boolean checkBalanced(TreeNode node) {
        return getHeight(node) != Integer.MIN_VALUE;
    }

    private static int getHeight(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = getHeight(node.left);
        if (leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        int rightHeight = getHeight(node.right);
        if (rightHeight == Integer.MIN_VALUE || Math.abs(leftHeight - rightHeight) > 1) {
            return Integer.MIN_VALUE;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
