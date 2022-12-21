package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_2_MinSearchBinaryTreeFromSortedArrayTest {

    /*                       7
                    3                 11
                1       5        9         13
              0   2   4        8   10   12    14          */

    @Test
    void shouldCreateBinarySearchTreeFromArrayOfSortedInts() {
        //given
        int[] sortedInts = IntStream.range(0, 15).toArray();

        //when
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray.createBinarySearchTree(sortedInts);

        //then
        assertThat(root.data).isEqualTo(7);
        assertThat(root.left.data).isEqualTo(3);
        assertThat(root.left.left.data).isEqualTo(1);
        assertThat(root.left.left.left.data).isEqualTo(0);
        assertThat(root.left.left.right.data).isEqualTo(2);
        assertThat(root.left.right.data).isEqualTo(5);
        assertThat(root.left.right.left.data).isEqualTo(4);

        assertThat(root.right.data).isEqualTo(11);
        assertThat(root.right.right.data).isEqualTo(13);
        assertThat(root.right.left.data).isEqualTo(9);
        assertThat(root.right.left.left.data).isEqualTo(8);
        assertThat(root.right.left.right.data).isEqualTo(10);
        assertThat(root.right.right.right.data).isEqualTo(14);
        assertThat(root.right.right.left.data).isEqualTo(12);
//        assertThat(root.right.right.right.data).isEqualTo(6);
//        assertThat(root.right.left.data).isEqualTo(7);
    }
}