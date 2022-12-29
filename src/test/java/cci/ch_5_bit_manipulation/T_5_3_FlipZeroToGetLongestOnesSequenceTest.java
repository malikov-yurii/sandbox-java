package cci.ch_5_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_5_3_FlipZeroToGetLongestOnesSequenceTest {

    @Test
    void getLongestSequenceLength() {
        /* 11011101111 */
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(1775))
                .isEqualTo(8);
    }

    @Test
    void getLongestSequenceLength2() {
        /* 110100101111 */
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(3375))
                .isEqualTo(6);
    }

    @Test
    void getLongestSequenceLength3() {
        /* 10100100100111001111011001 */
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(43152345))
                .isEqualTo(7);
    }

    @Test
    void getLongestSequenceLength4() {
        /* 1000000000000100000110011011 */
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(134234523))
                .isEqualTo(5);
    }

    @Test
    void getLongestSequenceLength5() {
        /* 1101 */
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(13))
                .isEqualTo(4);
    }

    @Test
    void getLongestSequenceLength6() {
        /* 110 */
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(6))
                .isEqualTo(3);
    }

    @Test
    void getLongestSequenceLength7() {
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(1))
                .isEqualTo(1);
    }

    @Test
    void getLongestSequenceLength8() {
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(0))
                .isEqualTo(0);
    }

    @Test
    void getLongestSequenceLength9() {
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(2))
                .isEqualTo(2);
    }

    @Test
    void getLongestSequenceLength10() {
        assertThat(T_5_3_FlipZeroToGetLongestOnesSequence.getLongestSequenceLength(11))
                .isEqualTo(4);
    }

}