package cci.ch_2_linked_lists;

public class T_2_8_LoopDetection {

    //    Runtime : O(n)
    //    Memory  : O(1)
    public static LinkedNode detect(LinkedNode head) {
        LinkedNode p1 = head;
        LinkedNode p2 = head;
        do {
            p1 = p1.next;
            p2 = p2.next.next;
        } while (p2 != p1);
        p1 = head;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }


}
