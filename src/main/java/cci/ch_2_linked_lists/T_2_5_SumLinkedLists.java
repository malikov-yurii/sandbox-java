package cci.ch_2_linked_lists;

public class T_2_5_SumLinkedLists {

    //    Runtime : O(n)
    //    Memory  : O(n)
    public static Node<Integer> sumIteratively(Node<Integer> n1, Node<Integer> n2) {
        int len1 = getLength(n1);
        int len2 = getLength(n2);
        int leaves = Math.max(len1, len2);
        Node<Integer> reverse = null;

        while (leaves-- > 0) {
            reverse = new Node<>(0, reverse);
            if (len1 - leaves > 0) {
                reverse.data += n1.data;
                n1 = n1.next;
            }
            if (len2 - leaves > 0) {
                reverse.data += n2.data;
                n2 = n2.next;
            }
        }

        Node<Integer> result = new Node<>(0, null);
        while (reverse != null) {
            int sum = result.data + reverse.data;
            result.data = sum % 10;
            result = new Node<>(sum / 10, result);
            reverse = reverse.next;
        }

        return result.data == 0 ? result.next : result;
    }

    //    Runtime : O(n)
    //    Memory  : O(n)
    public static Node<Integer> sumRecursively(Node<Integer> n1, Node<Integer> n2) {
        return new RecursiveListSumCalculator().sum(n1, n2);
    }

    private static class RecursiveListSumCalculator {
        int leaves;
        int len1;
        int len2;

        Node<Integer> sum(Node<Integer> list1, Node<Integer> list2) {
            len1 = getLength(list1);
            len2 = getLength(list2);
            leaves = Math.max(len1, len2);
            Node<Integer> head = new Node<>(0, null);
            sumRecursively(list1, list2, head);
            return head.data == 0 ? head.next : head;
        }

        private void sumRecursively(Node<Integer> n1, Node<Integer> n2, Node<Integer> upperDigit) {
            Node<Integer> currentDigit = new Node<>(0, null);
            upperDigit.next = currentDigit;
            if (len1 - leaves >= 0) {
                currentDigit.data += n1.data;
                n1 = n1.next;
            }
            if (len2 - leaves >= 0) {
                currentDigit.data += n2.data;
                n2 = n2.next;
            }
            leaves--;

            if (leaves > 0) {
                sumRecursively(n1, n2, currentDigit);
            }

            upperDigit.data += currentDigit.data / 10;
            currentDigit.data %= 10;
        }
    }

    //    Runtime : O(n)
    //    Memory  : O(1)
    public static Node<Integer> sumReverse(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> sumHead = new Node<>(0, null);
        Node<Integer> sumTail = sumHead;
        Node<Integer> p1 = head1;
        Node<Integer> p2 = head2;
        while (p1 != null || p2 != null) {
            int sum = getDataOrZero(p1) + getDataOrZero(p2) + sumTail.data;
            sumTail.data = sum % 10;
            if (hasNext(p1) || hasNext(p2) || sum / 10 > 0) {
                sumTail.next = new Node<>(sum / 10, null);
                sumTail = sumTail.next;
            }
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        return sumHead;
    }


    //    Runtime : O(n)
    //    Memory  : O(n)
    public static Node<Integer> sumReverseRecursively(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> sum = new Node<>(0, null);
        sumReverseRecursively(head1, head2, sum);
        return sum;
    }

    private static void sumReverseRecursively(Node<Integer> n1, Node<Integer> n2, Node<Integer> nSum) {
        int sum = nSum.data + getDataOrZero(n1) + getDataOrZero(n2);
        nSum.data = sum % 10;
        if (n1 != null || n2 != null || sum / 10 != 0) {
            nSum.next = new Node<>(sum / 10, null);
            sumReverseRecursively(n1 != null ? n1.next : null, n2 != null ? n2.next : null, nSum.next);
        }
    }

    private static int getLength(Node<Integer> node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    private static Integer getDataOrZero(Node<Integer> node) {
        return node == null ? 0 : node.data;
    }

    private static boolean hasNext(Node<?> node) {
        return node != null && node.next != null;
    }

}
