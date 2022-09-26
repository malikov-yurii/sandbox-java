import org.junit.jupiter.api.Test;
import sort.BubbleSort;
import sort.QuickSort;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class SortCompareTest {

    public static final int ARR_LENGTH = 10_000;

    @Test
    public void sort() {
        Random rd = new Random();
        int[] quickSortArr = new int[ARR_LENGTH];
        for (int i = 0; i < quickSortArr.length; i++) {
            quickSortArr[i] = rd.nextInt();
        }
        System.out.println(LocalDateTime.now() + " generated array " + ARR_LENGTH);

        int[] javaSortArr = Arrays.copyOf(quickSortArr, quickSortArr.length);
        int[] bubbleSortArr = Arrays.copyOf(quickSortArr, quickSortArr.length);
        System.out.println(LocalDateTime.now() + " created copies");

        Arrays.sort(javaSortArr);
        System.out.println(LocalDateTime.now() + " javaSortArr done");

        QuickSort.sort(quickSortArr);
        System.out.println(LocalDateTime.now() + " quickSortArr done");

        BubbleSort.sort(bubbleSortArr);
        System.out.println(LocalDateTime.now() + " bubbleSortArr done");

        assertThat(quickSortArr).isEqualTo(javaSortArr);
        System.out.println("javaSortArr.0=" + javaSortArr[0]);
        System.out.println("quickSortArr.0=" + quickSortArr[0]);
        System.out.println("bubbleSortArr.0=" + bubbleSortArr[0]);
        System.out.println("javaSortArr.last=" + javaSortArr[javaSortArr.length - 1]);
        System.out.println("quickSortArr.last=" + quickSortArr[quickSortArr.length -1 ]);
        System.out.println("bubbleSortArr.last=" + bubbleSortArr[bubbleSortArr.length -1 ]);
    }

}