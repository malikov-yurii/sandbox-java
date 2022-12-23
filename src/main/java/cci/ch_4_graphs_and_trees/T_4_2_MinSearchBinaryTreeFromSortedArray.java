package cci.ch_4_graphs_and_trees;

public class T_4_2_MinSearchBinaryTreeFromSortedArray {

    public static TreeNode<Integer> createBinarySearchTree(int[] arr) {
        TreeNode<Integer> root = new TreeNode<>();
        createSearchTree(root, 0, arr.length, arr);
        return root;
    }

    private static void createSearchTree(TreeNode<Integer> root, int start, int end, int[] arr) {
        if (start < end) {
            int middle = (start + end) / 2;
            root.data = arr[middle];
            if (start < middle) {
                root.setLeft(new TreeNode<>());
                createSearchTree(root.left, start, middle, arr);
            }
            if (middle + 1 < end) {
                root.setRight(new TreeNode<>());
                createSearchTree(root.right, middle + 1, end, arr);
            }
        }
    }

}
