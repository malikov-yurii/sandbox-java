package cci.ch_2_linked_lists;

public class T_2_6_PalindromeLinkedList {

    public static boolean checkRecursive(Node<Character> node) {
        PalindromeVerification verification = new PalindromeVerification();
        verification.left = node;
        verification.right = node;
        verification.len = countLetters(node);
        verification.leaves = verification.len / 2;
        checkRecursive(verification);
        return verification.isPalindrome;
    }

    private static void checkRecursive(PalindromeVerification verification) {
        skipSpaces(verification);
        Node<Character> left = verification.left;
        verification.leaves--;
        if (verification.leaves == 0) {
            if (verification.len % 2 == 1) {
                verification.right = verification.right.next;
                skipSpaces(verification);
            }
            verification.right = verification.right.next;
            skipSpaces(verification);
        }
        if (verification.leaves > 0) {
            verification.left = verification.left.next;
            verification.right = verification.right.next;
            checkRecursive(verification);
        }
        verification.isPalindrome &= left.data == verification.right.data;
        verification.right = verification.right.next;
        skipSpaces(verification);
    }

    private static void skipSpaces(PalindromeVerification verification) {
        while (verification.left != null && verification.left.data == ' ') {
            verification.left = verification.left.next;
        }
        while (verification.right != null && verification.right.data == ' ') {
            verification.right = verification.right.next;
        }
    }

    static class PalindromeVerification {
        Node<Character> left;
        Node<Character> right;
        int leaves;
        int len;
        boolean isPalindrome = true;
    }


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
