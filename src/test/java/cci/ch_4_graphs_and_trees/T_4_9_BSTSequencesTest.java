package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_9_BSTSequencesTest {

    @Test
    public void testGetSequences1() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(new int[]{1, 3, 5});

        List<LinkedList<Integer>> resultLists = T_4_9_BSTSequences.getSequences(root);

        assertThat(resultLists).containsAll(Arrays.asList(
                newLinkedList(3, 1, 5),
                newLinkedList(3, 5, 1)
        ));
    }

    /*                3
            1                 5
        0       2        4         6          */
    @Test
    public void testGetSequences2() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 7).toArray());

        List<LinkedList<Integer>> resultLists = T_4_9_BSTSequences.getSequences(root);

        assertThat(resultLists).containsAll(Arrays.asList(
                newLinkedList(3, 1, 5, 0, 2, 4, 6)
        ));
        System.out.println("size = " + resultLists.size());
        resultLists.forEach(list -> {
            assertThat(list).hasSize(7);
            assertThat(list).contains(0, 1, 2, 3, 4, 5, 6);
            assertThat(list.get(0)).isEqualTo(3);
            assertThat(list.get(1)).isIn(1, 5);
            assertThat(list.indexOf(0)).isGreaterThan(list.indexOf(1));
            assertThat(list.indexOf(2)).isGreaterThan(list.indexOf(1));
            assertThat(list.indexOf(4)).isGreaterThan(list.indexOf(5));
            assertThat(list.indexOf(6)).isGreaterThan(list.indexOf(5));
        });
    }

    /*                3
            1                 5
        0       2        4                   */
    @Test
    public void testGetSequences3() {
        //given
        TreeNode<Integer> root = T_4_2_MinSearchBinaryTreeFromSortedArray
                .createBinarySearchTree(IntStream.range(0, 6).toArray());

        List<LinkedList<Integer>> resultLists = T_4_9_BSTSequences.getSequences(root);

        assertThat(resultLists).containsAll(Arrays.asList(
                newLinkedList(3, 1, 5, 0, 2, 4)
        ));
        System.out.println("size = " + resultLists.size());
        resultLists.forEach(list -> {
            assertThat(list).hasSize(6);
            assertThat(list).contains(0, 1, 2, 3, 4, 5);
            assertThat(list.get(0)).isEqualTo(3);
            assertThat(list.get(1)).isIn(1, 5);
            assertThat(list.indexOf(0)).isGreaterThan(list.indexOf(1));
            assertThat(list.indexOf(2)).isGreaterThan(list.indexOf(1));
            assertThat(list.indexOf(4)).isGreaterThan(list.indexOf(5));
        });
    }

    @Test
    void weave() {
        LinkedList<Integer> prefix = newLinkedList(-1, 0);
        LinkedList<Integer> list1 = newLinkedList(1, 2);
        LinkedList<Integer> list2 = newLinkedList(3, 4);

        List<LinkedList<Integer>> resultLists = T_4_9_BSTSequences.weaveTwoLists(list1, list2, prefix);

        assertThat(resultLists).containsAll(Arrays.asList(
                newLinkedList(-1, 0, 1, 2, 3, 4),
                newLinkedList(-1, 0, 1, 3, 2, 4),
                newLinkedList(-1, 0, 1, 3, 4, 2),
                newLinkedList(-1, 0, 3, 1, 4, 2),
                newLinkedList(-1, 0, 3, 4, 1, 2),
                newLinkedList(-1, 0, 3, 1, 2, 4)
        ));
        assertThat(resultLists).hasSize(6);
    }

    private <T> LinkedList<T> newLinkedList(T... arr) {
        return new LinkedList<>(Arrays.asList(arr));
    }
}