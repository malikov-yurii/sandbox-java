package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_1_8_ZeroMatrixTest {

    @Test
    void zero() {
        int[][] matrix = new int[][]{
                {11, 12, 13, 14, 15},
                {21, 22, 23, 0, 25},
                {31, 32, 33, 34, 0},
                {41, 42, 43, 0, 45},
                {51, 52, 53, 54, 55},
        };

        T_1_8_ZeroMatrix.zero(matrix);

        assertThat(matrix).isDeepEqualTo(new int[][]{
                {11, 12, 13, 0, 0},
                {0, 0, 0, 0,  0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0,  0},
                {51, 52, 53, 0, 0},
        });
    }
    @Test
    void zero2() {
        int[][] matrix = new int[][]{
                {11, 12, 13, 14, 15},
                {21, 22, 23, 0, 0},
                {31, 32, 33, 34, 1},
                {41, 42, 43, 0, 45},
                {51, 52, 53, 54, 55},
        };

        T_1_8_ZeroMatrix.zero(matrix);

        assertThat(matrix).isDeepEqualTo(new int[][]{
                {11, 12, 13, 0, 0},
                {0, 0, 0, 0,  0},
                {31, 32, 33, 0, 0},
                {0, 0, 0, 0,  0},
                {51, 52, 53, 0, 0},
        });
    }
}