package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_10_PaintFillTest {



    /*

    1  0  0  0
    0  1  0  0
    0  0  1  0
    0  0  0  1

    * */

    @Test
    void fill() {
        int[][] screen = new int[4][4];
        for (int i = 0; i < 4; i++) {
            screen[i][i] = 1;
        }

        T_8_10_PaintFill.fill(screen, 1, 3, 2);
        T_8_10_PaintFill.fill(screen, 3, 0, 3);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(screen[i][j] + "  ");
            }
            System.out.print('\n');
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                assertThat(screen[i][j]).isEqualTo(2);
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                assertThat(screen[i][j]).isEqualTo(3);
            }
        }
    }

}

