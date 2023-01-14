package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_6_HanoiTowersTest {

    @Test
    void moveFromFirstToLast() {
        int n = 7;

        List<Stack<Integer>> towers = Arrays.asList(new Stack<>(), new Stack<>(), new Stack<>());

        for (int i = n; i > 0; i--) {
            towers.get(0).push(i);
        }

        T_8_6_HanoiTowers.moveFromFirstToLast(towers);

        assertThat(towers.get(0).isEmpty()).isTrue();
        assertThat(towers.get(1).isEmpty()).isTrue();
        IntStream.range(1, n + 1).forEach(expected -> {
            assertThat(towers.get(2).pop()).isEqualTo(expected);
        });
    }
}