package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_8_FirstCommonAncestorTest {

    /*                       7
                3                 11
            1       5        9         13
          0   2   4   6     8   10   12    14          */
    @Test
    void getFirstAncestor() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        //then
        assertThat(T_4_8_FirstCommonAncestor.getFirstCommonAncestor(root,
                root.left.left.right,
                root.left.right.left
        )).isEqualTo(root.left);
    }

    @Test
    void getFirstAncestor2() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        //then
        assertThat(T_4_8_FirstCommonAncestor.getFirstCommonAncestor(root,
                root.left.left,
                root.left.right.left
        )).isEqualTo(root.left);
    }

    @Test
    void getFirstAncestor3() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        //then
        assertThat(T_4_8_FirstCommonAncestor.getFirstCommonAncestor(root,
                root.left.left.right,
                root.left.right
        )).isEqualTo(root.left);
    }

    /*                       7
               3                 11
           1       5        9         13
         0   2   4   6     8   10   12    14          */
    @Test
    void getFirstAncestor4() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        //then
        assertThat(T_4_8_FirstCommonAncestor.getFirstCommonAncestor(root,
                root.left.left,
                root.left.right
        )).isEqualTo(root.left);
    }

    @Test
    void getFirstAncestor5() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        //then
        assertThat(T_4_8_FirstCommonAncestor.getFirstCommonAncestor(root,
                root.left.left.left,
                root.right.right.left
        )).isEqualTo(root);
    }

    @Test
    void getFirstAncestor6() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 15).toArray());

        //then
        assertThat(T_4_8_FirstCommonAncestor.getFirstCommonAncestor(root,
                root.left.left.right,
                root.right.left.right
        )).isEqualTo(root);
    }

    @Test
    void getFirstAncestor7() {
        //given
        TreeNode<Integer> root = new TreeNode<>(1, null, null);

        //then
        assertThat(T_4_8_FirstCommonAncestor.getFirstCommonAncestor(root,
                root,
                root
        )).isEqualTo(root);
    }

    @Test
    void getFirstAncestor8() {
        //given
        TreeNode<Integer> n1 = new TreeNode<>(1, null, null);
        TreeNode<Integer> n2 = new TreeNode<>(2, null, null);
        TreeNode<Integer> n3 = new TreeNode<>(3, null, null);
        TreeNode<Integer> n4 = new TreeNode<>(4, null, null);

        n1.left = n2;
        n2.left = n3;
        n3.left = n4;

        //then
        assertThat(T_4_8_FirstCommonAncestor.getFirstCommonAncestor(n1,
                n3,
                n4
        )).isEqualTo(n3);
    }

    @Test
    void getFirstAncestor9() {
        //given
        TreeNode<Integer> n1 = new TreeNode<>(1, null, null);
        TreeNode<Integer> n2 = new TreeNode<>(2, null, null);
        TreeNode<Integer> n3 = new TreeNode<>(3, null, null);
        TreeNode<Integer> n4 = new TreeNode<>(4, null, null);

        n1.left = n2;
        n1.right = n3;
        n3.right = n4;

        //then
        assertThat(T_4_8_FirstCommonAncestor.getFirstCommonAncestor(n1,
                n3,
                new TreeNode(5, null, null)
        )).isEqualTo(null);
    }
}