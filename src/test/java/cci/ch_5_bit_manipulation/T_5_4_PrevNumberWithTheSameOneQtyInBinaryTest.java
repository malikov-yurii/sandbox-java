package cci.ch_5_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class T_5_4_PrevNumberWithTheSameOneQtyInBinaryTest {


    @Test
    void getPrev() {
        assertThat(Integer.toBinaryString(T_5_4_PrevNumberWithTheSameOneQtyInBinary
                .getPrev(0b1010011)))
                .isEqualTo("1001110");
    }

    @Test
    void getPrev3() {
        assertThat(Integer.toBinaryString(T_5_4_PrevNumberWithTheSameOneQtyInBinary
                .getPrev(0b101110)))
                .isEqualTo("101101");
    }

    @Test
    void getError() {
        assertThatThrownBy(() -> T_5_4_PrevNumberWithTheSameOneQtyInBinary.getPrev(0b1111))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void getPrev2() {
        assertThat(Integer.toBinaryString(T_5_4_PrevNumberWithTheSameOneQtyInBinary
                .getPrev(0b101100)))
                .isEqualTo("101010");
    }

    @Test
    void getPrev6() {
        assertThat(Integer.toBinaryString(T_5_4_PrevNumberWithTheSameOneQtyInBinary
                .getPrev(0b10111)))
                .isEqualTo("1111");
    }

    @Test
    void getPrev5() {
        assertThat(Integer.toBinaryString(T_5_4_PrevNumberWithTheSameOneQtyInBinary
                .getPrev(0b100111)))
                .isEqualTo("11110");
    }
}