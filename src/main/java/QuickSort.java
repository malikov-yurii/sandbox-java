public class QuickSort {

    private static int swapCount = 0;

    public static void sort(int[] arr) {
        swapCount = 0;
        quicksort(arr, 0, arr.length - 1);
        System.out.println("QuickSortImpl.swapCount=" + swapCount);
    }

    private static void quicksort(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivotInd = partition(arr, begin, end);
            quicksort(arr, begin, pivotInd - 1);
            quicksort(arr, pivotInd + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int pivotInd = begin;
        for (int i = begin; i < end; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, pivotInd);
                pivotInd++;
            }
        }
        swap(arr, pivotInd, end);
        return pivotInd;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        swapCount++;
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
