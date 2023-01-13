package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_5_RecursiveMultiplyTest {

    @Test
    void getProduct() {
        assertThat(T_8_5_RecursiveMultiply.getProduct(31, 35)).isEqualTo(31 * 35);
//        assertThat(T_8_5_RecursiveMultiply.getProduct(4, 4)).isEqualTo(16);
    }
}