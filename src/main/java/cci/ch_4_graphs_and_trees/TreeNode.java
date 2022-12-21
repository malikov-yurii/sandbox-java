package cci.ch_4_graphs_and_trees;

public class TreeNode<T> {

    enum State { Unvisited, Visiting, Visited}

    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public State state;

    public TreeNode(T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {
        this(null, null, null);
    }

    @Override
    public String toString() {
        return "N[" + data + "]";
    }

}
