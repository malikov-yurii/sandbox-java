package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_8_PermutationsWithDupsTest {

    @Test
    void getPermutations() {
        assertThat(T_8_8_PermutationsWithDups.getPermutations("aabb"))
                .containsExactlyInAnyOrder(
                        "aabb",
                        "bbaa",

                        "abba",
                        "baab",

                        "abab",
                        "baba"
                );

        assertThat(T_8_8_PermutationsWithDups.getPermutations("ab"))
                .containsExactlyInAnyOrder(
                        "ba",
                        "ab"
                );

        assertThat(T_8_8_PermutationsWithDups.getPermutations("abc"))
                .containsExactlyInAnyOrder(
                        "abc",
                        "acb",
                        "bca",
                        "bac",
                        "cab",
                        "cba"
                );
        assertThat(T_8_8_PermutationsWithDups.getPermutations("abcd"))
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