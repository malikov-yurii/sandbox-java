package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_11_RandomNodeTreeTest {

    /*                       7
                    3                 11
                1       5        9         13
              0   2   4   6     8   10   12    14          */

    @Test
    void shouldGetRandomNode() {
        //when
        T_4_11_RandomNodeTree<Integer> tree = new T_4_11_RandomNodeTree<>();
        Stream.of(7, 3, 11, 1, 5, 9, 13, 0, 2, 4, 6, 8, 10, 12, 14).forEach(tree::addInOrder);
        TreeNode<Integer> root = tree.findByIndex(7);

        IntStream.range(0, 1).forEach(i -> assertThat(tree.findByIndex(i).data).isEqualTo(i));
        assertThat(tree.findByIndex(7).size).isEqualTo(15);
        assertThat(tree.findByIndex(13).size).isEqualTo(3);
        assertThat(tree.findByIndex(11).size).isEqualTo(7);
        assertThat(tree.findByIndex(5).size).isEqualTo(3);
        assertThat(tree.findByIndex(4).size).isEqualTo(1);

        //then
        assertThat(root.data).isEqualTo(7);
        assertThat(root.left.data).isEqualTo(3);
        assertThat(root.left.left.data).isEqualTo(1);
        assertThat(root.left.left.left.data).isEqualTo(0);
        assertThat(root.left.left.right.data).isEqualTo(2);
        assertThat(root.left.right.data).isEqualTo(5);
        assertThat(root.left.right.left.data).isEqualTo(4);
        assertThat(root.left.right.right.data).isEqualTo(6);

        assertThat(root.right.data).isEqualTo(11);
        assertThat(root.right.right.data).isEqualTo(13);
        assertThat(root.right.left.data).isEqualTo(9);
        assertThat(root.right.left.left.data).isEqualTo(8);
        assertThat(root.right.left.right.data).isEqualTo(10);
        assertThat(root.right.right.right.data).isEqualTo(14);
        assertThat(root.right.right.left.data).isEqualTo(12);

        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            seen.add(tree.getRandomNode().data);
        }
        System.out.println("seen " + seen);
        assertThat(seen).contains(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
    }
}