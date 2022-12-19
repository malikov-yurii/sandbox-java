package cci.ch_2_linked_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class T_2_8_LoopDetectionTest {

    @Test
    void detect() {
        LinkedNode n7 = new LinkedNode(1, null);
        LinkedNode n6 = new LinkedNode(2, n7);
        LinkedNode n5 = new LinkedNode(10, n6);
        LinkedNode n4 = new LinkedNode(5, n5);
        LinkedNode n3 = new LinkedNode(8, n4);
        LinkedNode n2 = new LinkedNode(5, n3);
        LinkedNode n1 = new LinkedNode(3, n2);

        LinkedNode[] nodes = new LinkedNode[] {n1, n2, n3, n4, n5, n6};
        for (int i = 0; i < nodes.length; i++) {
            LinkedNode n = nodes[i];
            n7.next = n;
            assertThat(T_2_8_LoopDetection.detect(n))
                    .as("Failed when looping in node n" + (i + 1))
                    .isEqualTo(n);
        }
    }
}