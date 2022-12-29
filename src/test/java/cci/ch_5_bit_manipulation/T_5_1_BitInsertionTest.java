package cci.ch_5_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_5_1_BitInsertionTest {

    @Test
    void insert1() {
        assertThat(Integer.toBinaryString(
                T_5_1_BitInsertion.insert(0b10000000000, 0b10011, 2, 6)))
                .isEqualTo("10001001100");
    }

    @Test
    void insert2() {
        assertThat(Integer.toBinaryString(T_5_1_BitInsertion.insert(0b11111111111, 0b10011, 2, 6)))
                .isEqualTo("11111001111");
    }

    @Test
    void insert3() {
        assertThat(Integer.toBinaryString(T_5_1_BitInsertion.insert(0b10111111110, 0b10011, 2, 6)))
                .isEqualTo("10111001110");
    }

}