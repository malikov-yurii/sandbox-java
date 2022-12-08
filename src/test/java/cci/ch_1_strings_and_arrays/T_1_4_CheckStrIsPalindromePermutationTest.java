package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_1_4_CheckStrIsPalindromePermutationTest {

    @Test
    void isPalindromePermutation() {
        assertThat(T_1_4_CheckStrIsPalindromePermutation.isPalindromePermutation("Tact Coa")).isTrue();
        assertThat(T_1_4_CheckStrIsPalindromePermutation.isPalindromePermutation("Tact coa")).isTrue();
        assertThat(T_1_4_CheckStrIsPalindromePermutation.isPalindromePermutation("tAct coa")).isTrue();
        assertThat(T_1_4_CheckStrIsPalindromePermutation.isPalindromePermutation("Tact Coat")).isFalse();
        assertThat(T_1_4_CheckStrIsPalindromePermutation.isPalindromePermutation("Tact zCoa")).isFalse();
    }

}