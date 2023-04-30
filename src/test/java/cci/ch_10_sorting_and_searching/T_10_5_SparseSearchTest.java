package cci.ch_10_sorting_and_searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_10_5_SparseSearchTest {

    @Test
    void search0() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "kak",
                "kax",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "bab");

        assertThat(ind).isEqualTo(0);
    }

    @Test
    void search3() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "kak",
                "kax",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "bad");

        assertThat(ind).isEqualTo(3);
    }

    @Test
    void search4() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "kak",
                "kax",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "bbd");

        assertThat(ind).isEqualTo(4);
    }

    @Test
    void search7() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "kak",
                "kax",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "kak");

        assertThat(ind).isEqualTo(7);
    }

    @Test
    void search8() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "kak",
                "kax",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "kax");

        assertThat(ind).isEqualTo(8);
    }

    @Test
    void search10() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "kak",
                "kax",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "kkk");

        assertThat(ind).isEqualTo(10);
    }

    @Test
    void search14() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "",
                "",
                "",
                "",
                "kak",
                "kax",
                "",
                "",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "kax");

        assertThat(ind).isEqualTo(14);
    }

    @Test
    void search13() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "",
                "",
                "",
                "",
                "kak",
                "kax",
                "",
                "",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "kak");

        assertThat(ind).isEqualTo(13);
    }

    @Test
    void search5() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "",
                "",
                "",
                "",
                "kak",
                "kax",
                "",
                "",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "bad");

        assertThat(ind).isEqualTo(5);
    }

    @Test
    void search6() {
        String[] strings = new String[]{
                "bab",
                "",
                "",
                "",
                "",
                "bad",
                "bbd",
                "",
                "",
                "",
                "",
                "",
                "",
                "kak",
                "kax",
                "",
                "",
                "",
                "kkk"
        };

        int ind = T_10_5_SparseSearch.search(strings, "bbd");

        assertThat(ind).isEqualTo(6);
    }
}