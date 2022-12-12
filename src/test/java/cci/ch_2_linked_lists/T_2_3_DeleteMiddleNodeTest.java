package cci.ch_2_linked_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class T_2_3_DeleteMiddleNodeTest {

    @Test
    void delete() {
        Node n6 = new Node(6, null);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        T_2_3_DeleteMiddleNode.delete(n2);

        assertThat(n2.next).isEqualTo(n4);
        assertThat(n4.next).isEqualTo(n5);
        assertThat(n5.next).isEqualTo(n6);
        assertThat(n6.next).isEqualTo(null);

        assertThat(n2.data).isEqualTo(3);
        assertThat(n4.data).isEqualTo(4);
        assertThat(n5.data).isEqualTo(5);
        assertThat(n6.data).isEqualTo(6);
    }
}