package cci.ch_2_linked_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_2_7_ListsIntersectionTest {

    @Test
    void get2_positive() {
        Node<Integer> n31 = new Node<>(null, null);
        Node<Integer> n3 = new Node<>(null, n31);

        Node<Integer> n5 = new Node<>(null, n3);
        Node<Integer> n4 = new Node<>(null, n5);

        Node<Integer> n2 = new Node<>(null, n3);
        Node<Integer> n1 = new Node<>(null, n2);

        Node<Integer> n6 = new Node<>(null, n3);
        Node<Integer> n7 = new Node<>(null, n6);
        Node<Integer> n8 = new Node<>(null, n7);

        assertThat(T_2_7_ListsIntersection.get2(n1, n4)).isEqualTo(n3);
        assertThat(T_2_7_ListsIntersection.get2(n2, n5)).isEqualTo(n3);
        assertThat(T_2_7_ListsIntersection.get2(n8, n1)).isEqualTo(n3);
        assertThat(T_2_7_ListsIntersection.get2(n7, n1)).isEqualTo(n3);
    }

    @Test
    void get2_negative() {
        Node<Integer> n5 = new Node<>(null, null);
        Node<Integer> n4 = new Node<>(null, n5);

        Node<Integer> n2 = new Node<>(null, null);
        Node<Integer> n1 = new Node<>(null, n2);

        Node<Integer> n6 = new Node<>(null, null);
        Node<Integer> n7 = new Node<>(null, n6);
        Node<Integer> n8 = new Node<>(null, n7);

        assertThat(T_2_7_ListsIntersection.get2(n1, n4)).isNull();
        assertThat(T_2_7_ListsIntersection.get2(n2, n5)).isNull();
        assertThat(T_2_7_ListsIntersection.get2(n8, n1)).isNull();
        assertThat(T_2_7_ListsIntersection.get2(n7, n1)).isNull();
    }

    @Test
    void get1_positive() {
        Node<Integer> n31 = new Node<>(null, null);
        Node<Integer> n3 = new Node<>(null, n31);

        Node<Integer> n5 = new Node<>(null, n3);
        Node<Integer> n4 = new Node<>(null, n5);

        Node<Integer> n2 = new Node<>(null, n3);
        Node<Integer> n1 = new Node<>(null, n2);

        Node<Integer> n6 = new Node<>(null, n3);
        Node<Integer> n7 = new Node<>(null, n6);
        Node<Integer> n8 = new Node<>(null, n7);

        assertThat(T_2_7_ListsIntersection.get(n1, n4)).isEqualTo(n3);
        assertThat(T_2_7_ListsIntersection.get(n2, n5)).isEqualTo(n3);
        assertThat(T_2_7_ListsIntersection.get(n8, n1)).isEqualTo(n3);
        assertThat(T_2_7_ListsIntersection.get(n7, n1)).isEqualTo(n3);
    }

    @Test
    void get1_negative() {
        Node<Integer> n5 = new Node<>(null, null);
        Node<Integer> n4 = new Node<>(null, n5);

        Node<Integer> n2 = new Node<>(null, null);
        Node<Integer> n1 = new Node<>(null, n2);

        Node<Integer> n6 = new Node<>(null, null);
        Node<Integer> n7 = new Node<>(null, n6);
        Node<Integer> n8 = new Node<>(null, n7);

        assertThat(T_2_7_ListsIntersection.get(n1, n4)).isNull();
        assertThat(T_2_7_ListsIntersection.get(n2, n5)).isNull();
        assertThat(T_2_7_ListsIntersection.get(n8, n1)).isNull();
        assertThat(T_2_7_ListsIntersection.get(n7, n1)).isNull();
    }


}