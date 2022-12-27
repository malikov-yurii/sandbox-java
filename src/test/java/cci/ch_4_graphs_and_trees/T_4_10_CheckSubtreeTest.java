package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_10_CheckSubtreeTest {

    /*                       7
                3                 11
            1       5        9         13
          0   2   4   6     8   10   12    14          */
    @Test
    void checkTrue1() {
        //given
        TreeNode<Integer> bigRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        TreeNode<Integer> smallRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(8, 11).toArray());

        //then
        assertThat(T_4_10_CheckSubtree.checkSubtree(bigRoot, smallRoot)).isTrue();
    }

    /*                       7
                3                 11
            1       5        9         13
          0   2   4   6     8   10   12    14          */
    @Test
    void checkTrue2() {
        //given
        TreeNode<Integer> bigRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        TreeNode<Integer> smallRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(8, 15).toArray());

        //then
        assertThat(T_4_10_CheckSubtree.checkSubtree(bigRoot, smallRoot)).isTrue();
    }

    /*                       7
                3                 11
            1       5        9         13
          0   2   4   6     8   10   12    14          */
    @Test
    void checkTrue3() {
        //given
        TreeNode<Integer> bigRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        TreeNode<Integer> smallRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 7).toArray());

        //then
        assertThat(T_4_10_CheckSubtree.checkSubtree(bigRoot, smallRoot)).isTrue();
    }

    /*                       7
                3                 11
            1       5        9         13
          0   2   4   6     8   10   12    14          */
    @Test
    void checkFalse1() {
        //given
        TreeNode<Integer> bigRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        TreeNode<Integer> smallRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 8).toArray());

        //then
        assertThat(T_4_10_CheckSubtree.checkSubtree(bigRoot, smallRoot)).isFalse();
    }

    /*                       7
                3                 11
            1       5        9         13
          0   2   4   6     8   10   12    14          */
    @Test
    void checkFalse2() {
        //given
        TreeNode<Integer> bigRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        TreeNode<Integer> smallRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(2, 6).toArray());

        //then
        assertThat(T_4_10_CheckSubtree.checkSubtree(bigRoot, smallRoot)).isFalse();
    }

    /*                       7
                3                 11
            1       5        9         13
          0   2   4   6     8   10   12    14          */
    @Test
    void checkFalse3() {
        //given
        TreeNode<Integer> bigRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        TreeNode<Integer> smallRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(new int[] {1, 3, 5});

        //then
        assertThat(T_4_10_CheckSubtree.checkSubtree(bigRoot, smallRoot)).isFalse();
    }

    /*                       7
                3                 11
            1       5        9         13
          0   2   4   6     8   10   12    14          */
    @Test
    void checkFalse4() {
        //given
        TreeNode<Integer> bigRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        TreeNode<Integer> smallRoot = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(new int[] {3, 7, 11});

        //then
        assertThat(T_4_10_CheckSubtree.checkSubtree(bigRoot, smallRoot)).isFalse();
    }


}