package cci.ch_4_graphs_and_trees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_4_12_PathsWithSumTest {

    @Test
    /*
                              20
                    -10                  7
                 5       5          -17
              3   15   5   -5          20                */
    void count() {
        TreeNode<Integer> root = new TreeNode<>(20,
                new TreeNode<>(-10,
                        new TreeNode<>(5, new TreeNode<>(3), new TreeNode<>(15)),
                        new TreeNode<>(5, new TreeNode<>(5), new TreeNode<>(-5))),
                new TreeNode<>(7,
                        new TreeNode<>(-17, null, new TreeNode<>(20)),
                        null));

        assertThat(T_4_12_PathsWithSum.countPaths(root, 10)).isEqualTo(6);

        root.right.left.right.data = 2;
        assertThat(T_4_12_PathsWithSum.countPaths(root, 10)).isEqualTo(5);
    }

}