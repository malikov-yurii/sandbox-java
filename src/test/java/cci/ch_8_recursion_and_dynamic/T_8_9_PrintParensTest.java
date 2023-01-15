package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_9_PrintParensTest {

    @Test
    void getParentheses1() {
        assertThat(T_8_9_PrintParens.getParentheses(1)).containsExactlyInAnyOrder(
                "()"
        );
    }

    @Test
    void getParentheses2() {
        assertThat(T_8_9_PrintParens.getParentheses(2)).containsExactlyInAnyOrder(
                "(())",
                "()()"
        );
    }

    @Test
    void getParentheses3() {
        assertThat(T_8_9_PrintParens.getParentheses(3)).containsExactlyInAnyOrder(
                "(())()",
                "((()))",
                "(()())",
                "()(())",
                "()()()"
        );
    }
}