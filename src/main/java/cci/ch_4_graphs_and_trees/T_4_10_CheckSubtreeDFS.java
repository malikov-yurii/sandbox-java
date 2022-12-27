package cci.ch_4_graphs_and_trees;

import java.util.Objects;

public class T_4_10_CheckSubtreeDFS {

    public static <T extends Comparable<T>> boolean containsSubtree(TreeNode<T> big, TreeNode<T> small) {
        return small == null || checkSubtree(big, small);
    }

    public static <T extends Comparable<T>> boolean checkSubtree(TreeNode<T> big, TreeNode<T> small) {
        return big != null && (equals(big, small) || checkSubtree(big.left, small) || checkSubtree(big.right, small));
    }

    private static <T extends Comparable<T>> boolean equals(TreeNode<T> first, TreeNode<T> second) {
        return first == null && second == null
                || first != null && second != null && Objects.equals(first.data, second.data)
                && equals(first.left, second.left) && equals(first.right, second.right);
    }

}
