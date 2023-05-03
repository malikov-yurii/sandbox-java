package cci.ch_10_sorting_and_searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_10_8_FindDuplicatesTest {

    @Test
    void findDups() {
        int[] arr = new int[]{1, 2, 14, 3, 4, 5, 6, 7, 8, 9, 3, 10, 9, 11, 12, 13, 14};

        int[] dups = T_10_8_FindDuplicates.findDups(arr);

        assertThat(dups).containsExactlyInAnyOrder(14, 3, 9);
    }

}