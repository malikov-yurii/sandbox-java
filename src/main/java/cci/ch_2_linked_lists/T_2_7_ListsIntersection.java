package cci.ch_2_linked_lists;

import java.util.HashSet;
import java.util.Set;

public class T_2_7_ListsIntersection {

    public static <T extends Comparable<T>> Node<T> get(Node<T> n1, Node<T> n2) {
        Set<Node<T>> seen = new HashSet<>();
        while (n1 != null) {
            seen.add(n1);
            n1 = n1.next;
        }
        while (n2 != null) {
            if (seen.contains(n2)) {
                return n2;
            }
            n2 = n2.next;
        }
        return null;
    }

}
