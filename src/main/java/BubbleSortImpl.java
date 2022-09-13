public class BubbleSortImpl {

    private static int swapCount = 0;

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        System.out.println("BubbleSortImpl.swapCount=" + swapCount);
    }

    private static void swap(int[] arr, int i, int j) {
        swapCount++;
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
