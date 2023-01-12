package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static cci.ch_8_recursion_and_dynamic.T_8_2_RobotInGrid.Direction.DOWN;
import static cci.ch_8_recursion_and_dynamic.T_8_2_RobotInGrid.Direction.RIGHT;
import static org.assertj.core.api.Assertions.assertThat;

class T_8_2_RobotInGridTest {

    @Test
    void findPath() {
        boolean o = true;
        boolean x = false;
        boolean[][] grid = {
                {o, o, o, o, o, o, o, o, o, o},
                {o, o, o, o, o, o, o, o, o, o},
                {o, x, x, x, x, x, x, x, x, x},
                {o, o, o, x, o, x, o, o, o, o},
                {o, x, o, o, o, x, o, o, o, o},
                {o, x, o, x, o, o, o, o, o, o},
                {x, x, o, x, o, x, o, o, o, o},
                {o, x, x, x, x, x, x, o, x, x},
                {o, o, o, o, o, o, o, o, o, o},
                {o, o, o, o, o, o, o, o, o, o},
        };

        assertThat(T_8_2_RobotInGrid.findPath(grid)).containsExactly(
                DOWN, DOWN, DOWN, RIGHT, RIGHT,
                DOWN, RIGHT, RIGHT,
                DOWN, RIGHT, RIGHT,
                DOWN, RIGHT,
                DOWN, DOWN, DOWN, RIGHT, RIGHT
        );

    }
}