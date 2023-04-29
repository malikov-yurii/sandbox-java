package cci.ch_10_sorting_and_searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_10_3_SearchInRotatedArrayTest {

    @Test
    void search6() {
        int[] ints = new int[]{12, 12, 14, 16, 16, 16, 17, 21, 1, 3, 6, 11, 11};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 6);

        assertThat(foundInd).isEqualTo(10);
    }

    @Test
    void search14() {
        int[] ints = new int[]{12, 12, 14, 16, 16, 16, 17, 21, 1, 3, 6, 11, 11};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 14);

        assertThat(foundInd).isEqualTo(2);
    }

    @Test
    void search99() {
        int[] ints = new int[]{12, 12, 14, 16, 16, 16, 17, 21, 1, 3, 6, 11, 11};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 99);

        assertThat(foundInd).isEqualTo(-1);
    }

    @Test
    void search4() {
        int[] ints = new int[]{2, 2, 2, 3, 4, 2};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 4);

        assertThat(foundInd).isEqualTo(4);
    }

    @Test
    void search7() {
        int[] ints = new int[]{2, 2, 2, 2, 3, 7, 1};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 7);

        assertThat(foundInd).isEqualTo(5);
    }

    @Test
    void search5() {
        int[] ints = new int[]{2, 3, 5, 2, 2, 2, 2};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 5);

        assertThat(foundInd).isEqualTo(2);
    }

    @Test
    void search2() {
        int[] ints = new int[]{2, 3, 5, 2, 2, 2, 2};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 2);

        assertThat(foundInd).isIn(0, 3, 4, 5, 6);
    }

    @Test
    void search11() {
        int[] ints = new int[]{11, 12};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 11);

        assertThat(foundInd).isIn(0);
    }

    @Test
    void search12() {
        int[] ints = new int[]{11, 12};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 12);

        assertThat(foundInd).isIn(1);
    }

    @Test
    void search15() {
        int[] ints = new int[]{14};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 14);

        assertThat(foundInd).isIn(0);
    }

    @Test
    void searchNotFound() {
        int[] ints = new int[]{14};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 16);

        assertThat(foundInd).isIn(-1);
    }

    @Test
    void search20() {
        int[] ints = new int[]{14, 17, 20};

        int foundInd = T_10_3_SearchInRotatedArray.search(ints, 20);

        assertThat(foundInd).isIn(2);
    }
}