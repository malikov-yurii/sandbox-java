package cci.ch_5_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_5_8_DrawLineTest {

    @Test
    void draw() {
        byte[] screen = new byte[]{
                0, 0, 0, 0, 0, 0, 0, 0,
/*    0    0111_1111  7  7  7  7  1100_0000   0*/
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0
        };

        T_5_8_DrawLine.draw(screen, 64, 10, 50, 1);
        assertThat(screen[8]).isEqualTo((byte) 0);
        assertThat(screen[9]).isEqualTo((byte) 0b0011_1111);
        assertThat(screen[10]).isEqualTo((byte) 0b1111_1111);
        assertThat(screen[11]).isEqualTo((byte) 0b1111_1111);
        assertThat(screen[12]).isEqualTo((byte) 0b1111_1111);
        assertThat(screen[13]).isEqualTo((byte) 0b1111_1111);
        assertThat(screen[14]).as(Integer.toBinaryString(screen[14])).isEqualTo((byte) 0b1100_0000); /*  */
        assertThat(screen[15]).isEqualTo((byte) 0);
    }
}