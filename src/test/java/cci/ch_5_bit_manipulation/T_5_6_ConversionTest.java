package cci.ch_5_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_5_6_ConversionTest {

    @Test
    void countBitDiff() {
        for (TestCase testCase : new TestCase[]{
                pair(0b000000,
                        0b111111,
                        6),
                pair(0b001000,
                        0b111111,
                        5),
                pair(0b110000,
                        0b001111,
                        6),
                pair(0b000111,
                        0b111111,
                        3),
                pair(0b010100,
                        0b101011,
                        6),
                pair(0b000010,
                        0b000110,
                        1),
                pair(0b010010,
                        0b000010,
                        1),
                pair(0b110010,
                        0b011110,
                        3)
        }) {
            assertThat(T_5_6_Conversion.countBitDiff(testCase.a, testCase.b))
                    .as("\na=%s\nb=%s\nr=%s",
                            Integer.toBinaryString(testCase.a), Integer.toBinaryString(testCase.b), Integer.toBinaryString(testCase.result))
                    .isEqualTo(testCase.result);

        }

    }

    public static TestCase pair(int a, int b, int result) {
        return new TestCase(a, b, result);
    }

    static class TestCase {
        int a;
        int b;
        int result;

        TestCase(int a, int b, int result) {
            this.a = a;
            this.b = b;
            this.result = result;
        }
    }
}