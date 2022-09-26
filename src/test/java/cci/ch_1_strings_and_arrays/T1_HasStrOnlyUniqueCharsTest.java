package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;
import util.TestUtil;

import static org.assertj.core.api.Assertions.assertThat;

class T1_HasStrOnlyUniqueCharsTest {

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
        String longString = TestUtil.generateUniqueCharString(30_000);
        int runCount = 7;
        TestUtil.executeTaskMultipleTimes("V1", runCount,
                () -> T1_HasStrOnlyUniqueChars.isAllCharsUniqueV1(longString));
        TestUtil.executeTaskMultipleTimes("V2", runCount,
                () -> T1_HasStrOnlyUniqueChars.isAllCharsUniqueV2(longString));
        TestUtil.executeTaskMultipleTimes("V3", runCount,
                () -> T1_HasStrOnlyUniqueChars.isAllCharsUniqueV3(longString));
    }

}