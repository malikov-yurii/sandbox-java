package cci.ch_8_recursion_and_dynamic;

public class T_8_3_MagicIndex {

    public static int getMagicIndex(int[] arr) {
        return getIndex(arr, 0, arr.length);
    }

    private static int getIndex(int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (end + start) / 2;
        if (arr[middle] == middle) {
            return middle;
        }
        return arr[middle] > middle
                ? getIndex(arr, start, middle - 1)
                : getIndex(arr, middle + 1, end);
    }
}
