package cci.ch_2_linked_lists;

public class Node {

    Object data;
    Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{data=" + data + ",next=" + next + "}";
    }


}
