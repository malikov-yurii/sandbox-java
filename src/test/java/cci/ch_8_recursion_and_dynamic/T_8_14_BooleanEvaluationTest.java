package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_14_BooleanEvaluationTest {

    @Test
    void evaluate2() {
        assertThat(T_8_14_BooleanEvaluation.countParenWays("1^0|0|1", false))
                .isEqualTo(2);
    }

    @Test
    void evaluate10() {
        assertThat(T_8_14_BooleanEvaluation.countParenWays("0&0&0&1^1|0", true))
                .isEqualTo(10);
    }
}