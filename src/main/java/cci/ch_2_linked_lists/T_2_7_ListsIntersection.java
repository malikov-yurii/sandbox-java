package cci.ch_2_linked_lists;

import java.util.HashSet;
import java.util.Set;

public class T_2_7_ListsIntersection {

    //    Runtime : O(m + n)
    //    Memory  : O(1)
    public static <T extends Comparable<T>> Node<T> get2(Node<T> n1, Node<T> n2) {
        int len1 = n1.getLength();
        int len2 = n2.getLength();
        int nodesToSkip = Math.abs(len1 - len2);
        Node<T> p1 = len1 > len2 ? n1.skip(nodesToSkip) : n1;
        Node<T> p2 = len1 < len2 ? n2.skip(nodesToSkip) : n2;
        int leaves = Math.min(len1, len2);
        while (leaves > 0) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
            leaves--;
        }
        return null;
    }

    //    Runtime : O(m + n)
    //    Memory  : O(m + n)
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
