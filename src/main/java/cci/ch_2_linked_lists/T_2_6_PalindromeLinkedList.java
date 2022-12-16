package cci.ch_2_linked_lists;

public class T_2_6_PalindromeLinkedList {

    public static boolean check(Node<Character> node) {
        int len = countLetters(node);
        Node<Character> reverse = null;
        int leavesToMiddle = len / 2;
        while (leavesToMiddle > 0) {
            if (node.data != ' ') {
                reverse = new Node<>(node.data, reverse);
                leavesToMiddle--;
            }
            node = node.next;
        }
        while (node.data == ' ') {
            node = node.next;
        }
        if (len % 2 == 1) {
            node = node.next;
        }
        while (reverse != null) {
            if (node.data == ' ') {
                node = node.next;
                continue;
            }
            if (reverse.data == ' ') {
                reverse = reverse.next;
                continue;
            }
            if (reverse.data != node.data) {
                return false;
            }
            node = node.next;
            reverse = reverse.next;
        }
        return true;
    }

    private static int countLetters(Node<Character> node) {
        int count = 0;
        while (node != null) {
            if (node.data != ' ') {
                count++;
            }
            node = node.next;
        }
        return count;
    }

}
