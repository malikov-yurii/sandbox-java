package cci.ch_2_linked_lists;

public class T_2_3_DeleteMiddleNode {

    //    Runtime : O(1)
    //    Memory  : O(1)
    public static void delete(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }


}
