package cci.ch_5_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_5_4_NextNumberWithTheSameOneQtyInBinaryTest {

    @Test
    void getNext() {
        assertThat(Integer.toBinaryString(T_5_4_NextNumberWithTheSameOneQtyInBinary
                .getNext(0b101110)))
                .isEqualTo("110011");
    }

    @Test
    void getNext2() {
        assertThat(Integer.toBinaryString(T_5_4_NextNumberWithTheSameOneQtyInBinary
                .getNext(0b101100)))
                .isEqualTo("110001");

        assertThat(Integer.toBinaryString(T_5_4_NextNumberWithTheSameOneQtyInBinary
                .getNext(0b10110)))
                .isEqualTo("11001");

        assertThat(Integer.toBinaryString(T_5_4_NextNumberWithTheSameOneQtyInBinary
                .getNext(0b111)))
                .isEqualTo("1011");

        assertThat(Integer.toBinaryString(T_5_4_NextNumberWithTheSameOneQtyInBinary
                .getNext(0b1110)))
                .isEqualTo("10011");

        assertThat(Integer.toBinaryString(T_5_4_NextNumberWithTheSameOneQtyInBinary
                .getNext(0b1)))
                .isEqualTo("10");

        assertThat(Integer.toBinaryString(T_5_4_NextNumberWithTheSameOneQtyInBinary
                .getNext(0b11)))
                .isEqualTo("101");
    }
}