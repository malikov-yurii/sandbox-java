package cci.ch_2_linked_lists;

public class T_2_4_PartitionLinkedList {

    //    Runtime : O(n)
    //    Memory  : O(1)
    public static <T extends Comparable<T>> Node<T> partition2(Node<T> head, T partitionValue) {
        Node<T> newHead = head;
        Node<T> node = head;
        while (node != null) {
            if (node.data.compareTo(partitionValue) >= 0
                    && node.next != null
                    &&  node.next.data.compareTo(partitionValue) < 0) {
                Node<T> oldHead = newHead;
                newHead = node.next;
                node.next = node.next.next;
                newHead.next = oldHead;
            } else {
                node = node.next;
            }
        }
        return newHead;
    }

    //    Runtime : O(n)
    //    Memory  : O(1)
    public static <T extends Comparable<T>> Node<T> partition(Node<T> head, T partitionValue) {
        Node<T> pivot = head;
        while (pivot.data.compareTo(partitionValue) < 0 && pivot.next != null) {
            pivot = pivot.next;
        }
        if (pivot.data.compareTo(partitionValue) < 0) {
            return pivot;
        }

        Node<T> newHead = head;
        Node<T> node = pivot;
        while (node.next != null) {
            if (node.next.data.compareTo(partitionValue) < 0) {
                Node<T> oldHead = newHead;
                newHead = node.next;
                node.next = node.next.next;
                newHead.next = oldHead;
            } else {
                node = node.next;
            }
        }
        return newHead;
    }

}
