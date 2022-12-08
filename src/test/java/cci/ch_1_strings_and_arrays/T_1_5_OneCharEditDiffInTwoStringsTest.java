package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_1_5_OneCharEditDiffInTwoStringsTest {

    @Test
    void check() {
        assertThat(T_1_5_OneCharEditDiffInTwoStrings.check("pale", "ple")).isTrue();
        assertThat(T_1_5_OneCharEditDiffInTwoStrings.check("pales", "pale")).isTrue();
        assertThat(T_1_5_OneCharEditDiffInTwoStrings.check("pale", "bale")).isTrue();
        assertThat(T_1_5_OneCharEditDiffInTwoStrings.check("pale", "bake")).isFalse();
    }

}