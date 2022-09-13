import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortImplTest {

    @Test
    public void sort() {
        int[] arr = new int[]{-33, 1, 9, 4, 66, 3, 51, 15, 0, -22};
        BubbleSortImpl.sort(arr);
        assertThat(arr).isEqualTo(new int[]{-33, -22, 0, 1, 3, 4, 9, 15, 51, 66});
    }

}