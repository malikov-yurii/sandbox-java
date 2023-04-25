package cci.ch_10_sorting_and_searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_10_1_SortedMergeTest {

    @Test
    void merge() {
        int[] dest = new int[]{1, 2, 3, 22, 45, 0, 0, 0};
        int[] src = new int[]{2, 33, 66};

        T_10_1_SortedMerge.merge(dest, src);

        assertThat(dest).containsExactly(1, 2, 2, 3, 22, 33, 45, 66);
    }

}