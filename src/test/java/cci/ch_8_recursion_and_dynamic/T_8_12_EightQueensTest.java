package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.shouldHaveThrown;

class T_8_12_EightQueensTest {

    @Test
    void getPossiblePlaces() {
        List<int[]> columns = T_8_12_EightQueens.getPossiblePlaces();
        assertThat(columns).isNotEmpty();
        columns.forEach(columnByRow -> {
            for (int row1 = 0; row1 < T_8_12_EightQueens.GRID_SIZE; row1++) {
                for (int row2 = row1 + 1; row2 < T_8_12_EightQueens.GRID_SIZE; row2++) {
                    int col1 = columnByRow[row1];
                    int col2 = columnByRow[row2];
                    assertThat(col1).isNotEqualTo(col2);
                    int distance = row2 - row1;
                    assertThat(col1 + distance).isNotEqualTo(col2);
                    assertThat(col1 - distance).isNotEqualTo(col2);
                }
            }
        });
        columns.stream().map(Arrays::toString).forEach(System.out::println);
    }
}