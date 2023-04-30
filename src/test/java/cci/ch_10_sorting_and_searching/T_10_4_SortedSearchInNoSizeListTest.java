package cci.ch_10_sorting_and_searching;

import cci.ch_10_sorting_and_searching.T_10_4_SortedSearchInNoSizeList.Listy;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_10_4_SortedSearchInNoSizeListTest {

    @Test
    void search1() {
        Listy listy = new Listy(1, 2, 3, 6, 8, 11, 15, 15, 15, 19);

        int ind = T_10_4_SortedSearchInNoSizeList.search(listy, 1);

        assertThat(ind).isEqualTo(0);
    }

    @Test
    void search2() {
        Listy listy = new Listy(1, 2, 3, 6, 8, 11, 15, 15, 15, 19);

        int ind = T_10_4_SortedSearchInNoSizeList.search(listy, 2);

        assertThat(ind).isEqualTo(1);
    }

    @Test
    void search3() {
        Listy listy = new Listy(1, 2, 3, 6, 8, 11, 15, 15, 15, 19);

        int ind = T_10_4_SortedSearchInNoSizeList.search(listy, 3);

        assertThat(ind).isEqualTo(2);
    }

    @Test
    void search6() {
        Listy listy = new Listy(1, 2, 3, 6, 8, 11, 15, 15, 15, 19);

        int ind = T_10_4_SortedSearchInNoSizeList.search(listy, 6);

        assertThat(ind).isEqualTo(3);
    }

    @Test
    void search8() {
        Listy listy = new Listy(1, 2, 3, 6, 8, 11, 15, 15, 15, 19);

        int ind = T_10_4_SortedSearchInNoSizeList.search(listy, 8);

        assertThat(ind).isEqualTo(4);
    }

    @Test
    void search15() {
        Listy listy = new Listy(1, 2, 3, 6, 8, 11, 15, 15, 15, 19);

        int ind = T_10_4_SortedSearchInNoSizeList.search(listy, 15);

        assertThat(ind).isIn(6, 7, 8);
    }

    @Test
    void search19() {
        Listy listy = new Listy(1, 2, 3, 6, 8, 11, 15, 15, 15, 19);

        int ind = T_10_4_SortedSearchInNoSizeList.search(listy, 19);

        assertThat(ind).isEqualTo(9);
    }

}