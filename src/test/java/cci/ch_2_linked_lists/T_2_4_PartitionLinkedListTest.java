package cci.ch_2_linked_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class T_2_4_PartitionLinkedListTest {

    public static final int PIVOT = 5;

    @Test
    void partitionCase_2_1() {
        Node<Integer> n7 = new Node<>(1, null);
        Node<Integer> n6 = new Node<>(2, n7);
        Node<Integer> n5 = new Node<>(10, n6);
        Node<Integer> n4 = new Node<>(5, n5);
        Node<Integer> n3 = new Node<>(8, n4);
        Node<Integer> n2 = new Node<>(5, n3);
        Node<Integer> n1 = new Node<>(3, n2);

        verifyPartitioned(T_2_4_PartitionLinkedList.partition2(n1, PIVOT));
    }

    @Test
    void partitionCase_2_2() {
        Node<Integer> n7 = new Node<>(1, null);
        Node<Integer> n6 = new Node<>(2, n7);
        Node<Integer> n5 = new Node<>(10, n6);
        Node<Integer> n4 = new Node<>(5, n5);
        Node<Integer> n3 = new Node<>(8, n4);
        Node<Integer> n2 = new Node<>(3, n3);
        Node<Integer> n1 = new Node<>(5, n2);

        verifyPartitioned(T_2_4_PartitionLinkedList.partition2(n1, PIVOT));
    }

    @Test
    void partitionCase_2_3() {
        Node<Integer> n7 = new Node<>(5, null);
        Node<Integer> n6 = new Node<>(2, n7);
        Node<Integer> n5 = new Node<>(10, n6);
        Node<Integer> n4 = new Node<>(1, n5);
        Node<Integer> n3 = new Node<>(8, n4);
        Node<Integer> n2 = new Node<>(3, n3);
        Node<Integer> n1 = new Node<>(5, n2);

        verifyPartitioned(T_2_4_PartitionLinkedList.partition2(n1, PIVOT));
    }

    @Test
    void partitionCase_1() {
        Node<Integer> n7 = new Node<>(1, null);
        Node<Integer> n6 = new Node<>(2, n7);
        Node<Integer> n5 = new Node<>(10, n6);
        Node<Integer> n4 = new Node<>(5, n5);
        Node<Integer> n3 = new Node<>(8, n4);
        Node<Integer> n2 = new Node<>(5, n3);
        Node<Integer> n1 = new Node<>(3, n2);

        verifyPartitioned(T_2_4_PartitionLinkedList.partition(n1, PIVOT));
    }

    @Test
    void partitionCase_2() {
        Node<Integer> n7 = new Node<>(1, null);
        Node<Integer> n6 = new Node<>(2, n7);
        Node<Integer> n5 = new Node<>(10, n6);
        Node<Integer> n4 = new Node<>(5, n5);
        Node<Integer> n3 = new Node<>(8, n4);
        Node<Integer> n2 = new Node<>(3, n3);
        Node<Integer> n1 = new Node<>(5, n2);

        verifyPartitioned(T_2_4_PartitionLinkedList.partition(n1, PIVOT));
    }

    @Test
    void partitionCase_3() {
        Node<Integer> n7 = new Node<>(5, null);
        Node<Integer> n6 = new Node<>(2, n7);
        Node<Integer> n5 = new Node<>(10, n6);
        Node<Integer> n4 = new Node<>(1, n5);
        Node<Integer> n3 = new Node<>(8, n4);
        Node<Integer> n2 = new Node<>(3, n3);
        Node<Integer> n1 = new Node<>(5, n2);

        verifyPartitioned(T_2_4_PartitionLinkedList.partition(n1, PIVOT));
    }

    private void verifyPartitioned(Node<Integer> head) {
        System.out.println(head);
        boolean isPivotReached = false;
        Node<Integer> node = head;
        while (node != null) {
            if (!isPivotReached) {
                if (node.data.compareTo(PIVOT) >= 0) {
                    isPivotReached = true;
                }
            } else  {
                assertThat(node.data).as("Testing " + node).isGreaterThanOrEqualTo(PIVOT);
            }
            node = node.next;
        }
    }

}