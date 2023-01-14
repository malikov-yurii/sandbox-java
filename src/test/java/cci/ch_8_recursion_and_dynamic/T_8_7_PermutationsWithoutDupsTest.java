package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_7_PermutationsWithoutDupsTest {

    @Test
    void getPermutations() {
        assertThat(T_8_7_PermutationsWithoutDups.getPermutations("ab"))
                .containsExactlyInAnyOrder(
                        "ba",
                        "ab"
                );

        assertThat(T_8_7_PermutationsWithoutDups.getPermutations("abc"))
                .containsExactlyInAnyOrder(
                        "abc",
                        "acb",
                        "bca",
                        "bac",
                        "cab",
                        "cba"
                );
        assertThat(T_8_7_PermutationsWithoutDups.getPermutations("abcd"))
                .containsExactlyInAnyOrder(
                        "abcd",
                        "acbd",
                        "bcad",
                        "bacd",
                        "cabd",
                        "cbad",

                        "abdc",
                        "acdb",
                        "bcda",
                        "badc",
                        "cadb",
                        "cbda",

                        "adbc",
                        "adcb",
                        "bdca",
                        "bdac",
                        "cdab",
                        "cdba",

                        "dabc",
                        "dacb",
                        "dbca",
                        "dbac",
                        "dcab",
                        "dcba"
                );
    }
}