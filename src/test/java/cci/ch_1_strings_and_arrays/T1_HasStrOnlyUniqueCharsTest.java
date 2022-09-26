package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;
import util.TestUtil;

import static org.assertj.core.api.Assertions.assertThat;

class T1_HasStrOnlyUniqueCharsTest {

    @Test
    void testAllCharsUnique_V4() {
        assertThat(T1_HasStrOnlyUniqueChars.isAllCharsUniqueV4(TestUtil.UNIQUE_CHAR_STR))
                .as(TestUtil.UNIQUE_CHAR_STR)
                .isTrue();
        assertThat(T1_HasStrOnlyUniqueChars.isAllCharsUniqueV4(TestUtil.NON_UNIQUE_CHAR_STR))
                .as(TestUtil.NON_UNIQUE_CHAR_STR)
                .isFalse();
    }
    @Test
    void testAllCharsUnique_V3() {
        assertThat(T1_HasStrOnlyUniqueChars.isAllCharsUniqueV3(TestUtil.UNIQUE_CHAR_STR))
                .as(TestUtil.UNIQUE_CHAR_STR)
                .isTrue();
        assertThat(T1_HasStrOnlyUniqueChars.isAllCharsUniqueV3(TestUtil.NON_UNIQUE_CHAR_STR))
                .as(TestUtil.NON_UNIQUE_CHAR_STR)
                .isFalse();
    }

    @Test
    void testAllCharsUnique_V2() {
        assertThat(T1_HasStrOnlyUniqueChars.isAllCharsUniqueV2(TestUtil.UNIQUE_CHAR_STR))
                .as(TestUtil.UNIQUE_CHAR_STR)
                .isTrue();
        assertThat(T1_HasStrOnlyUniqueChars.isAllCharsUniqueV2(TestUtil.NON_UNIQUE_CHAR_STR))
                .as(TestUtil.NON_UNIQUE_CHAR_STR)
                .isFalse();
    }

    @Test
    void testAllCharsUnique_V1() {
        assertThat(T1_HasStrOnlyUniqueChars.isAllCharsUniqueV1(TestUtil.UNIQUE_CHAR_STR))
                .as(TestUtil.UNIQUE_CHAR_STR)
                .isTrue();
        assertThat(T1_HasStrOnlyUniqueChars.isAllCharsUniqueV1(TestUtil.NON_UNIQUE_CHAR_STR))
                .as(TestUtil.NON_UNIQUE_CHAR_STR)
                .isFalse();
    }

    @Test
    void testAllCharsUnique_compareRuntime() {
//        String longString = TestUtil.generateUniqueCharStringOrdered(12_500);
//        String longString = TestUtil.generateUniqueCharStringUnordered(30_500);
        String longString = TestUtil.generateUniqueCharStringUnordered(Character.MAX_VALUE);
        int runCount = 7;
        TestUtil.executeTaskMultipleTimes("V1", runCount,
                () -> T1_HasStrOnlyUniqueChars.isAllCharsUniqueV1(longString));
        TestUtil.executeTaskMultipleTimes("V2", runCount,
                () -> T1_HasStrOnlyUniqueChars.isAllCharsUniqueV2(longString));
        TestUtil.executeTaskMultipleTimes("V3", runCount,
                () -> T1_HasStrOnlyUniqueChars.isAllCharsUniqueV3(longString));
        TestUtil.executeTaskMultipleTimes("V4", runCount,
                () -> T1_HasStrOnlyUniqueChars.isAllCharsUniqueV4(longString));
    }

    @Test
    void testAllCharsUnique_runtime() {
//        String longString = TestUtil.generateUniqueCharStringOrderedChars(12_500);
        String longString = TestUtil.generateUniqueCharStringUnordered(12_500);
        T1_HasStrOnlyUniqueChars.isAllCharsUniqueV4(longString);
//        int runCount = 7;
//        TestUtil.executeTaskMultipleTimes("V4", runCount,
//                () -> T1_HasStrOnlyUniqueChars.isAllCharsUniqueV4(longString));
    }

}