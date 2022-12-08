package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class T_1_7_RotateMatrixRight90DegreesTest {

    @Test
    void rotate() {
        int[][] matrix = new int[][]{
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };

        T_1_7_RotateMatrixRight90Degrees.rotate(matrix);

        assertThat(matrix).isDeepEqualTo(new int[][]{
                {51, 41, 31, 21, 11},
                {52, 42, 32, 22, 12},
                {53, 43, 33, 23, 13},
                {54, 44, 34, 24, 14},
                {55, 45, 35, 25, 15},
        });
    }

}