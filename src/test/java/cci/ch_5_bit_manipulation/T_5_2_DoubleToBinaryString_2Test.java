package cci.ch_5_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_5_2_DoubleToBinaryString_2Test {

    @Test
    void doubleToBinaryString3() {
        assertThat(T_5_2_DoubleToBinaryString_2.toBinaryString(0.625))
                .isEqualTo(".101");
    }

    @Test
    void doubleToBinaryString2() {
        assertThat(T_5_2_DoubleToBinaryString_2.toBinaryString(0.5))
                .isEqualTo(".1");
    }

    @Test
    void doubleToBinaryString() {
        assertThat(T_5_2_DoubleToBinaryString_2.toBinaryString(0.72))
                .isEqualTo("ERROR .1011100001010001111010111000010");
        /*
         * 1.44
         * 0.88
         * 1.76
         * 1.52
         * 1.04
         * 0.08
         * 0.16
         * 0.32
         * 0.64
         * 1.28
         *
         * */
    }
}