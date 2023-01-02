package cci.ch_5_bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_5_7_SwapOddEvenBitsTest {


    @Test
    void swap() {
        for (T_5_7_SwapOddEvenBitsTest.TestCase testCase : new T_5_7_SwapOddEvenBitsTest.TestCase[]{
                pair(0b10101010_10101010_10101010_10101010,
                        0b01010101_01010101_01010101_01010101),
                pair(0b111011,
                        0b110111),
                pair(0b011001,
                        0b100110),
        }) {
            int actual = T_5_7_SwapOddEvenBits.swap(testCase.a);
            assertThat(actual)
                    .as("\na  =%s\nr  =%s\nact=%s\n",
                            Integer.toBinaryString(testCase.a),
                            Integer.toBinaryString(testCase.result),
                            Integer.toBinaryString(actual))
                    .isEqualTo(testCase.result);
        }

    }

    public static T_5_7_SwapOddEvenBitsTest.TestCase pair(int a, int result) {
        return new T_5_7_SwapOddEvenBitsTest.TestCase(a, result);
    }

    static class TestCase {
        int a;
        int result;

        TestCase(int a, int result) {
            this.a = a;
            this.result = result;
        }
    }
}