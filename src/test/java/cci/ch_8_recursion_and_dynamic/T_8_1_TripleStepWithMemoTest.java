package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_1_TripleStepWithMemoTest {

    @Test
    void countStepPathsToStareNumber() {
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(1)).isEqualTo(1);
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(2)).isEqualTo(2);
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(3)).isEqualTo(4);
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(4)).isEqualTo(7);
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(5)).isEqualTo(13);
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(6)).isEqualTo(24);
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(7)).isEqualTo(44);
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(8)).isEqualTo(81);
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(9)).isEqualTo(149);
        assertThat(T_8_1_TripleStep_WithMemo.countStepPathsToStareNumber(10)).isEqualTo(274);
    }

}