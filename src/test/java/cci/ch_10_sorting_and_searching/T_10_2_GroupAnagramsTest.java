package cci.ch_10_sorting_and_searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_10_2_GroupAnagramsTest {

    @Test
    void group() {
        String[] strings = new String[]{
                "ppaa",
                "mama",
                "maam",
                "adda",
                "papa",
                "aadd",
                "paap",
                "aamm",
                "dada"
        };

        T_10_2_GroupAnagrams.group(strings);

        assertThat(strings).containsExactly(
                "adda",
                "aadd",
                "dada",
                "mama",
                "maam",
                "aamm",
                "ppaa",
                "papa",
                "paap"
        );
    }
}