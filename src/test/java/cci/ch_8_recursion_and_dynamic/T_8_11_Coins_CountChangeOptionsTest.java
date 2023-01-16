package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_11_Coins_CountChangeOptionsTest {

    @Test
    void getExchangeOptions4() {
        assertThat(T_8_11_Coins_CountChangeOptions.countChangeOptions(4))
                .isEqualTo(1);
    }

    @Test
    void getExchangeOptions6() {
        assertThat(T_8_11_Coins_CountChangeOptions.countChangeOptions(6))
                .isEqualTo(2);
    }

    @Test
    void getExchangeOptions12() {
        assertThat(T_8_11_Coins_CountChangeOptions.countChangeOptions(12))
                .isEqualTo(4);
    }

    @Test
    void getExchangeOptions102() {
        assertThat(T_8_11_Coins_CountChangeOptions.countChangeOptions(102))
                .isEqualTo(242);
    }
}