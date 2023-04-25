package cci.ch_10_sorting_and_searching;

public class T_10_1_SortedMerge {

    public static void merge(int[] a, int[] b) {
        int pointer = a.length - 1;
        int aPointer = a.length - b.length - 1;
        int bPointer = b.length - 1;
        while (bPointer >= 0) {
            a[pointer--] = aPointer >= 0 && a[aPointer] > b[bPointer] ? a[aPointer--] : b[bPointer--];
        }
    }

}
