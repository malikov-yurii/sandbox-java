package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_3_MagicIndexSupportDistinctTest {

    @Test
    void getMagicIndex() {
        assertThat(T_8_3_MagicIndexSupportDistinct.getMagicIndex(new int[]
                {-10, -5,  2,  2,  2, 3, 4, 8, 9, 12, 13}))
                /* 0   1   2   3   4  5  6  7  8   9  10*/
                .isEqualTo(2);

        assertThat(T_8_3_MagicIndexSupportDistinct.getMagicIndex(new int[]
                {-10, -8, -6, -3, -1, 0, 2, 3, 7, 18, 19, 21, 23}))
                .isEqualTo(-1);

        assertThat(T_8_3_MagicIndexSupportDistinct.getMagicIndex(new int[]
                {-10, -8, 2, 10, 11, 20, 22, 33, 77, 718, 719, 721, 723}))
                .isEqualTo(2);
    }

}