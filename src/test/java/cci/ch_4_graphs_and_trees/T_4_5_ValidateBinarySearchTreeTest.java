package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_5_ValidateBinarySearchTreeTest {

    /*                       7
                    3                 11
                1       5        9         13
              0   2   4   6     8   10   12    14          */
    @Test
    void shouldValidateBinarySearchTreeTrue() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        //then
        assertThat(T_4_5_ValidateBinarySearchTree.isBST(root)).isTrue();
    }

    @Test
    void shouldValidateBinarySearchTreeTrue2() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());
        root.left.left.left.data = -1;

        //then
        assertThat(T_4_5_ValidateBinarySearchTree.isBST(root)).isTrue();
    }

    @Test
    void shouldValidateBinarySearchTreeTrue3() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());
        root.right.right.right.data = 100;

        //then
        assertThat(T_4_5_ValidateBinarySearchTree.isBST(root)).isTrue();
    }

    @Test
    void shouldValidateBinarySearchTreeTrue4() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());
        root.right.right.right.right = new TreeNode<>(100, null, null);

        //then
        assertThat(T_4_5_ValidateBinarySearchTree.isBST(root)).isTrue();
    }

    @Test
    void shouldValidateBinarySearchTreeFalse() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());
        root.right.left.data = 77;

        //then
        assertThat(T_4_5_ValidateBinarySearchTree.isBST(root)).isFalse();
    }

    @Test
    void shouldValidateBinarySearchTreeFalse2() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());
        root.right.data = 2;

        //then
        assertThat(T_4_5_ValidateBinarySearchTree.isBST(root)).isFalse();
    }

    @Test
    void shouldValidateBinarySearchTreeFalse3() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());
        root.right.right.right.right = new TreeNode<>(14, null, null);

        //then
        assertThat(T_4_5_ValidateBinarySearchTree.isBST(root)).isFalse();
    }


    @Test
    void shouldValidateBinarySearchTreeFalse4() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());
        root.right.right.right.data = 13;

        //then
        assertThat(T_4_5_ValidateBinarySearchTree.isBST(root)).isFalse();
    }

}