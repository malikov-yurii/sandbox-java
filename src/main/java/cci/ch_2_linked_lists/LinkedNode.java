package cci.ch_2_linked_lists;

public class LinkedNode<T> {

    public T data;
    public LinkedNode<T> next;

    public LinkedNode(T data, LinkedNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
