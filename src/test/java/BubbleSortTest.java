import org.junit.jupiter.api.Test;
import sort.BubbleSort;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    @Test
    public void sort() {
        int[] arr = new int[]{-33, 1, 9, 4, 66, 3, 51, 15, 0, -22};
        BubbleSort.sort(arr);
        assertThat(arr).isEqualTo(new int[]{-33, -22, 0, 1, 3, 4, 9, 15, 51, 66});
    }

}