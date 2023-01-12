package cci.ch_8_recursion_and_dynamic;

public class T_8_3_MagicIndexSupportDistinct {

    public static int getMagicIndex(int[] arr) {
        return getIndex(arr, 0, arr.length);
    }

    private static int getIndex(int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }
        int midInd = (end + start) / 2;
        int midVal = arr[midInd];
        if (midVal == midInd) {
            return midInd;
        }
        int result = getIndex(arr, start, Math.min(midVal, midInd - 1));
        if (result == -1) {
            result = getIndex(arr, Math.max(midVal, midInd + 1), end);
        }
        return result;
    }
}
