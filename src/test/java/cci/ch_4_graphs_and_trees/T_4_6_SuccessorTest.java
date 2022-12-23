package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_6_SuccessorTest {

    /*                   7
                3                 11
            1       5        9         13
          0   2   4   6     8   10   12    14          */
    @Test
    void findSuccessor() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        //then
        assertThat(T_4_6_Successor.findSuccessor(root.left)).isEqualTo(root.left.right.left); // 3 -> 4
        assertThat(T_4_6_Successor.findSuccessor(root.left.right)).isEqualTo(root.left.right.right); // 5 -> 6
        assertThat(T_4_6_Successor.findSuccessor(root.left.right.right)).isEqualTo(root); // 6 -> 7
        assertThat(T_4_6_Successor.findSuccessor(root.right.left.left)).isEqualTo(root.right.left); // 8 -> 9
        assertThat(T_4_6_Successor.findSuccessor(root.right.right)).isEqualTo(root.right.right.right); // 13 -> 14
        assertThat(T_4_6_Successor.findSuccessor(root.right.right.right)).isEqualTo(null); // null
    }
}