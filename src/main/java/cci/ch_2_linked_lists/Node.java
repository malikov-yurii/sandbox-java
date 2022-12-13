package cci.ch_2_linked_lists;

public class Node<T extends Comparable<T>> {

    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{data=" + data + ",next=" + next + "}";
    }

}
