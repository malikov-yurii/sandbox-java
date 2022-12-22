package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_3_ListOfDepthsBFSTest {

    /*                       7
                    3                 11
                1       5        9         13
              0   2   4   6     8   10   12    14          */

    @Test
    void shouldCreateBinarySearchTreeFromArrayOfSortedInts() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        //when
        List<List<Integer>> lists = T_4_3_ListOfDepthsBFS.getListOfDepthUsingBFS(root);

        //then
        assertThat(lists.get(0)).containsExactly(7);
        assertThat(lists.get(1)).containsExactly(3, 11);
        assertThat(lists.get(2)).containsExactly(1, 5, 9, 13);
        assertThat(lists.get(3)).containsExactly(0, 2, 4, 6, 8, 10, 12, 14);
    }
}