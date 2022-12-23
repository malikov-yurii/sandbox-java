package cci.ch_4_graphs_and_trees;

public class TreeNode<T> {

    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode<T> parent;

    public TreeNode(T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {
        this(null, null, null);
    }

    public void setLeft(TreeNode<T> left) {
        if (left != null) {
            this.left = left;
            this.left.parent = this;
        }
    }

    public void setRight(TreeNode<T> right) {
        if (right != null) {
            this.right = right;
            this.right.parent = this;
        }
    }

    @Override
    public String toString() {
        return "N[" + data + "]";
    }

}
