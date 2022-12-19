package cci.ch_2_linked_lists;

public class Node<T extends Comparable<T>> {

    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public int getLength() {
        int len = 0;
        Node<?> n = this;
        while (n != null) {
            len++;
            n = n.next;
        }
        return len;
    }

    public Node<T> skip(int numToSkip) {
        Node<T> n = this;
        for (int i = 0; i < numToSkip; i++) {
            n = n.next;
        }
        return n;
    }

    @Override
    public String toString() {
        return "Node{data=" + data + ",next=" + next + "}";
    }

}
