package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_11_CoinsGetAllExchangeOptionsTest {

    @Test
    void getExchangeOptions4() {
        List<int[]> options = T_8_11_Coins_GetAllChangeOptions.getExchangeOptions(4);
        options.forEach(opt -> System.out.println(Arrays.toString(opt)));
        assertThat(options).containsExactlyInAnyOrder(
                new int[]{0, 0, 0, 4}
        );
    }

    @Test
    void getExchangeOptions6() {
        List<int[]> options = T_8_11_Coins_GetAllChangeOptions.getExchangeOptions(6);
        options.forEach(opt -> System.out.println(Arrays.toString(opt)));
        assertThat(options).containsExactlyInAnyOrder(
                new int[]{0, 0, 0, 6},
                new int[]{0, 0, 1, 1}
        );
    }

    @Test
    void getExchangeOptions12() {
        List<int[]> options = T_8_11_Coins_GetAllChangeOptions.getExchangeOptions(12);
        options.forEach(opt -> System.out.println(Arrays.toString(opt)));
        assertThat(options).containsExactlyInAnyOrder(
                new int[]{0, 0, 0, 12},
                new int[]{0, 0, 2, 2},
                new int[]{0, 0, 1, 7},
                new int[]{0, 1, 0, 2}
        );
    }
}