package cci.ch_2_linked_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class T_2_1_ReturnKthToLastTest {

    @Test
    void returnKthToLast() {
        Node n6 = new Node(6, null);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        assertThat(T_2_1_ReturnKthToLast.returnKthToLast(n1, 1).data).isEqualTo(6);
        assertThat(T_2_1_ReturnKthToLast.returnKthToLast(n1, 2).data).isEqualTo(5);
        assertThat(T_2_1_ReturnKthToLast.returnKthToLast(n1, 4).data).isEqualTo(3);
        assertThat(T_2_1_ReturnKthToLast.returnKthToLast(n1, 6).data).isEqualTo(1);
    }

    @Test
    void returnKthToLastRecursively() {
        Node n6 = new Node(6, null);
        Node n5 = new Node(5, n6);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        assertThat(T_2_1_ReturnKthToLast.returnKthToLastRecursively(n1, 1).data).isEqualTo(6);
        assertThat(T_2_1_ReturnKthToLast.returnKthToLastRecursively(n1, 2).data).isEqualTo(5);
        assertThat(T_2_1_ReturnKthToLast.returnKthToLastRecursively(n1, 4).data).isEqualTo(3);
        assertThat(T_2_1_ReturnKthToLast.returnKthToLastRecursively(n1, 6).data).isEqualTo(1);
    }
}