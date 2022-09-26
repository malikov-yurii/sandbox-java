package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;
import util.TestUtil;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class T2_IsPermutationOfStrTest {

    @Test
    void isPermutationV1() {
        String str1 = TestUtil.generateUniqueCharStringUnordered(Character.MAX_VALUE);
        String str2 = TestUtil.generateUniqueCharStringOrdered(Character.MAX_VALUE);
        TestUtil.executeTaskMultipleTimes("V1", 15,
                () -> assertThat(T2_IsPermutationOfStr.isPermutationV1(str1, str2)).isTrue());
    }

    @Test
    void isNotPermutationV1() {
        String str1 = TestUtil.generateUniqueCharStringUnordered(Character.MAX_VALUE) + "a";
        String str2 = TestUtil.generateUniqueCharStringOrdered(Character.MAX_VALUE) + "b";
        TestUtil.executeTaskMultipleTimes("V1", 15,
                () -> assertThat(T2_IsPermutationOfStr.isPermutationV1(str1, str2)).isFalse());
    }

}