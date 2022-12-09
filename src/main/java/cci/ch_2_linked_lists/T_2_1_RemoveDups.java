package cci.ch_2_linked_lists;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* Remove dups from unordered linked list */
public class T_2_1_RemoveDups {

    //    Runtime : O(n^2)
    //    Memory  : O(1)
    public static void removeDups2(Node head) {
        Node p1 = head;
        while (p1 != null) {
            Node p2 = p1;
            while (p2.next != null) {
                if (Objects.equals(p1.data, p2.next.data)) {
                    p2.next = p2.next.next;
                } else {
                    p2 = p2.next;
                }
            }
            p1 = p1.next;
        }
    }

    //    Runtime : O(n)
    //    Memory  : O(n)
    public static void removeDups(Node head) {
        if (head == null) {
            return;
        }
        Set seen = new HashSet<>();
        seen.add(head.data);
        Node n = head;
        while (n.next != null) {
            if (!seen.add(n.next.data)) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

}
