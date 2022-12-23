package cci.ch_4_graphs_and_trees;

public class T_4_6_Successor {

    public static <T> TreeNode<T> findSuccessor(TreeNode<T> node) {
        TreeNode<T> result = null;
        if (node.right != null) {
            result = node.right;
            while (result.left != null) {
                result = result.left;
            }
        } else {
            TreeNode<T> n = node;
            TreeNode<T> parent = n.parent;
            while (parent != null) {
                if (parent.left == n) {
                    result = parent;
                    break;
                }
                n = parent;
                parent = n.parent;
            }
        }
        return result;
    }

}
