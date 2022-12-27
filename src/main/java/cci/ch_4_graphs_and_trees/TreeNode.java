package cci.ch_4_graphs_and_trees;

public class TreeNode<T extends Comparable<T>> {

    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode<T> parent;
    public int size;

    public TreeNode(T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {
        this(null, null, null);
    }

    public TreeNode(T data) {
        this.data = data;
        size++;
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

    public TreeNode<T> findByIndex(int ind) {
        return findByIndex(ind, this);
    }

    private TreeNode<T> findByIndex(int ind, TreeNode<T> node) {
        int leftSize = node.left == null ? 0 : node.left.size;
        int diff = ind - leftSize;
        if (diff == 0) {
            return node;
        } else if (diff < 0) {
            return findByIndex(ind, node.left);
        } else {
            return findByIndex(diff - 1, node.right);
        }
    }

    public void addInOrder(T data) {
        this.addInOrder(data, this);
    }


    private void addInOrder(T data, TreeNode<T> node) {
        if (data.compareTo(node.data) > 0) {
            if (node.right == null) {
                node.right = new TreeNode<>(data);
            } else {
                addInOrder(data, node.right);
            }
        } else {
            if (node.left == null) {
                node.left = new TreeNode<>(data);
            } else {
                addInOrder(data, node.left);
            }
        }
        node.size++;
    }
}
