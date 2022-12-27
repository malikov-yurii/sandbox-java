package cci.ch_4_graphs_and_trees;

import java.util.Random;

public class T_4_11_RandomNodeTree<T extends Comparable<T>> {

    private TreeNode<T> root;

    public void addInOrder(T data) {
        if (root == null) {
            root = new TreeNode<>(data);
        } else {
            root.addInOrder(data);
        }
    }

    public TreeNode<T> findByIndex(int ind) {
        return this.root.findByIndex(ind);
    }

    public TreeNode<T> getRandomNode() {
        return this.findByIndex(new Random().nextInt(this.root.size));
    }

}
