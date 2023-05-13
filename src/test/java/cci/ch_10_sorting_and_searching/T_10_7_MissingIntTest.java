package cci.ch_10_sorting_and_searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_10_7_MissingIntTest {

    public static final int INT_RANGE = 100_000_000;
    public static final int EXPECTED_MISSING_INT = 77_777_777;
    public static final int[] INTS = generateArray(INT_RANGE, EXPECTED_MISSING_INT);
    public static final int TEST_RUNS = 3;

    @Test
    void testMissingInt() {
        int found = T_10_7_MissingInt.findMissingInt(INTS);
        assertThat(found).isNotIn(INTS);
        assertThat(found).isEqualTo(EXPECTED_MISSING_INT);
    }

    @Test
    void findMissingIntNTimes() {
        for (int testRunCount = 0; testRunCount < TEST_RUNS; testRunCount++) {
            testMissingInt();
        }
    }

    @Test
    void testMissingIntLowMem() {
        int found = T_10_7_MissingInt.findMissingIntWithLowMem(INTS);
        assertThat(found).isNotIn(INTS);
        assertThat(found).isEqualTo(EXPECTED_MISSING_INT);
    }

    @Test
    void findMissingIntNTimesWithLowMem() {
        for (int testRunCount = 0; testRunCount < 4; testRunCount++) {
            testMissingIntLowMem();
        }
    }

    private static int[] generateArray(int intRange, int expectedMissingInt) {
        int[] ints = new int[intRange];
        for (int i = 0, num = 0; i < ints.length; num++) {
            if (num != expectedMissingInt) {
                ints[i] = num;
                i++;
            }
        }
        return ints;
    }

}