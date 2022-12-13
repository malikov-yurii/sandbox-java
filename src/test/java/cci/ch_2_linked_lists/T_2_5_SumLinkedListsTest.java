package cci.ch_2_linked_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_2_5_SumLinkedListsTest {

    @Test
    void calculatorSum() {
        Node<Integer> n1 = new Node<>(6, new Node<>(1, new Node<>(7, null)));
        Node<Integer> n2 = new Node<>(2, new Node<>(9, new Node<>(5, null)));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumRecursively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(9);
        assertThat(sum.next.data).isEqualTo(1);
        assertThat(sum.next.next.data).isEqualTo(2);
    }

    @Test
    void calculatorSum2() {
        Node<Integer> n1 = new Node<>(8, new Node<>(1, new Node<>(7, null)));
        Node<Integer> n2 = new Node<>(4, new Node<>(9, new Node<>(5, null)));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumRecursively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(1);
        assertThat(sum.next.data).isEqualTo(3);
        assertThat(sum.next.next.data).isEqualTo(1);
        assertThat(sum.next.next.next.data).isEqualTo(2);
    }

    @Test
    void calculatorSum3() {
        Node<Integer> n1 =                     new Node<>(8, new Node<>(1, new Node<>(7, null)));
        Node<Integer> n2 = new Node<>(4, new Node<>(4, new Node<>(9, new Node<>(5, null))));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumRecursively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(5);
        assertThat(sum.next.data).isEqualTo(3);
        assertThat(sum.next.next.data).isEqualTo(1);
        assertThat(sum.next.next.next.data).isEqualTo(2);
    }

    @Test
    void calculatorSum4() {
        Node<Integer> n1 =                     new Node<>(8, new Node<>(1, new Node<>(7, null)));
        Node<Integer> n2 = new Node<>(9, new Node<>(4, new Node<>(9, new Node<>(5, null))));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumRecursively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(1);
        assertThat(sum.next.data).isEqualTo(0);
        assertThat(sum.next.next.data).isEqualTo(3);
        assertThat(sum.next.next.next.data).isEqualTo(1);
        assertThat(sum.next.next.next.next.data).isEqualTo(2);
    }


    @Test
    void calculatorSumIterative() {
        Node<Integer> n1 = new Node<>(6, new Node<>(1, new Node<>(7, null)));
        Node<Integer> n2 = new Node<>(2, new Node<>(9, new Node<>(5, null)));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumIteratively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(9);
        assertThat(sum.next.data).isEqualTo(1);
        assertThat(sum.next.next.data).isEqualTo(2);
    }

    @Test
    void calculatorSumIterative2() {
        Node<Integer> n1 = new Node<>(8, new Node<>(1, new Node<>(7, null)));
        Node<Integer> n2 = new Node<>(4, new Node<>(9, new Node<>(5, null)));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumIteratively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(1);
        assertThat(sum.next.data).isEqualTo(3);
        assertThat(sum.next.next.data).isEqualTo(1);
        assertThat(sum.next.next.next.data).isEqualTo(2);
    }

    @Test
    void calculatorSumIterative3() {
        Node<Integer> n1 =                     new Node<>(8, new Node<>(1, new Node<>(7, null)));
        Node<Integer> n2 = new Node<>(4, new Node<>(4, new Node<>(9, new Node<>(5, null))));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumIteratively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(5);
        assertThat(sum.next.data).isEqualTo(3);
        assertThat(sum.next.next.data).isEqualTo(1);
        assertThat(sum.next.next.next.data).isEqualTo(2);
    }

    @Test
    void calculatorSumIterative4() {
        Node<Integer> n1 =                     new Node<>(8, new Node<>(1, new Node<>(7, null)));
        Node<Integer> n2 = new Node<>(9, new Node<>(4, new Node<>(9, new Node<>(5, null))));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumIteratively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(1);
        assertThat(sum.next.data).isEqualTo(0);
        assertThat(sum.next.next.data).isEqualTo(3);
        assertThat(sum.next.next.next.data).isEqualTo(1);
        assertThat(sum.next.next.next.next.data).isEqualTo(2);
    }


    @Test
    void sumReverse() {
        Node<Integer> n1 = new Node<>(7, new Node<>(1, new Node<>(6, null)));
        Node<Integer> n2 = new Node<>(5, new Node<>(9, new Node<>(2, null)));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumReverse(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(2);
        assertThat(sum.next.data).isEqualTo(1);
        assertThat(sum.next.next.data).isEqualTo(9);
    }

    @Test
    void sumReverse2() {
        Node<Integer> n1 = new Node<>(9, new Node<>(7, new Node<>(8, null)));
        Node<Integer> n2 = new Node<>(6, new Node<>(8, new Node<>(5, null)));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumReverse(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(5);
        assertThat(sum.next.data).isEqualTo(6);
        assertThat(sum.next.next.data).isEqualTo(4);
        assertThat(sum.next.next.next.data).isEqualTo(1);
    }

    @Test
    void sumReverse3() {
        Node<Integer> n1 = new Node<>(9, new Node<>(7, new Node<>(8, null)));
        Node<Integer> n2 = new Node<>(6, new Node<>(8, new Node<>(5, new Node<>(9, new Node<>(9, null)))));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumReverse(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(5);
        assertThat(sum.next.data).isEqualTo(6);
        assertThat(sum.next.next.data).isEqualTo(4);
        assertThat(sum.next.next.next.data).isEqualTo(0);
        assertThat(sum.next.next.next.next.data).isEqualTo(0);
        assertThat(sum.next.next.next.next.next.data).isEqualTo(1);
    }

    @Test
    void sumReverseRecursively() {
        Node<Integer> n1 = new Node<>(7, new Node<>(1, new Node<>(6, null)));
        Node<Integer> n2 = new Node<>(5, new Node<>(9, new Node<>(2, null)));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumReverseRecursively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(2);
        assertThat(sum.next.data).isEqualTo(1);
        assertThat(sum.next.next.data).isEqualTo(9);
    }

    @Test
    void sumReverseRecursively2() {
        Node<Integer> n1 = new Node<>(9, new Node<>(7, new Node<>(8, null)));
        Node<Integer> n2 = new Node<>(6, new Node<>(8, new Node<>(5, null)));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumReverseRecursively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(5);
        assertThat(sum.next.data).isEqualTo(6);
        assertThat(sum.next.next.data).isEqualTo(4);
        assertThat(sum.next.next.next.data).isEqualTo(1);
    }

    @Test
    void sumReverseRecursively3() {
        Node<Integer> n1 = new Node<>(9, new Node<>(7, new Node<>(8, null)));
        Node<Integer> n2 = new Node<>(6, new Node<>(8, new Node<>(5, new Node<>(9, new Node<>(9, null)))));

        Node<Integer> sum = T_2_5_SumLinkedLists.sumReverseRecursively(n1, n2);

        System.out.println(sum);
        assertThat(sum.data).isEqualTo(5);
        assertThat(sum.next.data).isEqualTo(6);
        assertThat(sum.next.next.data).isEqualTo(4);
        assertThat(sum.next.next.next.data).isEqualTo(0);
        assertThat(sum.next.next.next.next.data).isEqualTo(0);
        assertThat(sum.next.next.next.next.next.data).isEqualTo(1);
    }
}