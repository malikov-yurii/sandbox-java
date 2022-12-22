package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_4_CheckBalancedTest {

    @Test
    void checkBalancedTrue() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 1000).toArray());

        //when
        assertThat(T_4_4_CheckBalanced.checkBalanced(root)).isTrue();
    }

    @Test
    void checkBalancedTrue2() {
        //given
        TreeNode<Integer> root = new TreeNode<>(null,
                null,
                new TreeNode(null, null, new TreeNode()));

        //when
        assertThat(T_4_4_CheckBalanced.checkBalanced(root)).isTrue();
    }

    @Test
    void checkBalancedTrue3() {
        //given
        TreeNode<Integer> root = new TreeNode<>(null,
                null,
                new TreeNode(null, new TreeNode(), new TreeNode()));

        //when
        assertThat(T_4_4_CheckBalanced.checkBalanced(root)).isTrue();
    }

    @Test
    void checkBalancedTrue4() {
        //given
        TreeNode<Integer> root = new TreeNode<>(null,
                new TreeNode(),
                new TreeNode(null, new TreeNode(), new TreeNode()));

        //when
        assertThat(T_4_4_CheckBalanced.checkBalanced(root)).isTrue();
    }

    @Test
    void checkBalancedTrue5() {
        //given
        TreeNode<Integer> root = new TreeNode<>(null,
                new TreeNode(null, new TreeNode(), null),
                new TreeNode(null, new TreeNode(), new TreeNode(null, null, new TreeNode())));

        //when
        assertThat(T_4_4_CheckBalanced.checkBalanced(root)).isTrue();
    }

    @Test
    void checkBalancedFalse1() {
        //given
        TreeNode<Integer> root = new TreeNode<>(null,
                new TreeNode(),
                new TreeNode(null, null, new TreeNode(null, null, new TreeNode())));

        //when
        assertThat(T_4_4_CheckBalanced.checkBalanced(root)).isFalse();
    }


    @Test
    void checkBalancedFalse2() {
        //given
        TreeNode<Integer> root = new TreeNode<>(null,
                new TreeNode(),
                new TreeNode(null, new TreeNode(), new TreeNode(null, null, new TreeNode())));

        //when
        assertThat(T_4_4_CheckBalanced.checkBalanced(root)).isFalse();
    }

    @Test
    void checkBalancedFalse3() {
        //given
        TreeNode<Integer> root = new TreeNode<>(null,
                new TreeNode(null, new TreeNode(null, null, new TreeNode()), null),
                new TreeNode(null, new TreeNode(null, new TreeNode(null, new TreeNode(null, null, new TreeNode()), new TreeNode()), new TreeNode()), null));

        //when
        assertThat(T_4_4_CheckBalanced.checkBalanced(root)).isFalse();
    }


}