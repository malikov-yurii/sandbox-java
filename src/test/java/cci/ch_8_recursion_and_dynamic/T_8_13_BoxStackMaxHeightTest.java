package cci.ch_8_recursion_and_dynamic;

import cci.ch_8_recursion_and_dynamic.T_8_13_BoxStackMaxHeight.Box;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_13_BoxStackMaxHeightTest {

    @Test
    void getMaxHeight1() {
        List<Box> boxes = Arrays.asList(
                new Box(1, 1, 1),
                new Box(2, 2, 2),
                new Box(3, 3, 3),
                new Box(4, 4, 4)
        );

        assertThat(T_8_13_BoxStackMaxHeight.getMaxHeight(boxes))
                .isEqualTo(10);
    }

    @Test
    void getMaxHeight2() {
        List<Box> boxes = Arrays.asList(
                new Box(1, 1, 1),
                new Box(2, 2, 2),
                new Box(3, 30, 3),
                new Box(4, 4, 4)
        );

        assertThat(T_8_13_BoxStackMaxHeight.getMaxHeight(boxes))
                .isEqualTo(7);
    }

    @Test
    void getMaxHeight3() {
        List<Box> boxes = Arrays.asList(
                new Box(1, 1, 1),
                new Box(2, 2, 20),
                new Box(3, 3, 3),
                new Box(4, 1, 4)
        );

        assertThat(T_8_13_BoxStackMaxHeight.getMaxHeight(boxes))
                .isEqualTo(4);
    }

    @Test
    void getMaxHeight4() {
        List<Box> boxes = Arrays.asList(
                new Box(1, 1, 1),
                new Box(2, 2, 20),
                new Box(3, 3, 3),
                new Box(4, 2, 4)
        );

        assertThat(T_8_13_BoxStackMaxHeight.getMaxHeight(boxes))
                .isEqualTo(5);
    }

    @Test
    void getMaxHeight5() {
        List<Box> boxes = Arrays.asList(
                new Box(1, 1, 1),
                new Box(2, 2, 2),
                new Box(3, 3, 3),
                new Box(4, 1, 4)
        );

        assertThat(T_8_13_BoxStackMaxHeight.getMaxHeight(boxes))
                .isEqualTo(6);
    }

    @Test
    void getMaxHeight6() {
        List<Box> boxes = Arrays.asList(
                new Box(1, 1, 2),
                new Box(2, 2, 2),
                new Box(3, 3, 3),
                new Box(4, 1, 4)
        );

        assertThat(T_8_13_BoxStackMaxHeight.getMaxHeight(boxes))
                .isEqualTo(5);
    }
}