package cci.ch_2_linked_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_2_1_RemoveDupsTest {

    @Test
    void removeDups2() {
        Node<?> n5 = new Node<>(5, null);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(2, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        T_2_1_RemoveDups.removeDups2(n1);

        assertThat(n1.next).isEqualTo(n2);
        assertThat(n2.next).isEqualTo(n4);
        assertThat(n4.next).isEqualTo(n5);
    }

    @Test
    void removeDups2SecondCase() {
        Node n5 = new Node(5, null);
        Node n4 = new Node(2, n5);
        Node n3 = new Node(2, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        T_2_1_RemoveDups.removeDups2(n1);

        assertThat(n1.next).isEqualTo(n2);
        assertThat(n2.next).isEqualTo(n5);
    }

    @Test
    void removeDups() {
        Node n5 = new Node(5, null);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(2, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        T_2_1_RemoveDups.removeDups(n1);

        assertThat(n1.next).isEqualTo(n2);
        assertThat(n2.next).isEqualTo(n4);
        assertThat(n4.next).isEqualTo(n5);
    }

    @Test
    void removeDupsSecondCase() {
        Node n5 = new Node(5, null);
        Node n4 = new Node(2, n5);
        Node n3 = new Node(2, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        T_2_1_RemoveDups.removeDups(n1);

        assertThat(n1.next).isEqualTo(n2);
        assertThat(n2.next).isEqualTo(n5);
    }

}