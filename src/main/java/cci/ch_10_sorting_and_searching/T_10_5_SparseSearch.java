package cci.ch_10_sorting_and_searching;

public class T_10_5_SparseSearch {

    public static int search(String[] strings, String x) {
        return binarySearch(strings, x, 0, strings.length - 1);
    }

    private static int binarySearch(String[] strings, String x, int left, int right) {
        if (right < left) {
            return -1;
        }

        int initialMid = (left + right) / 2;
        int mid = initialMid;
        while (strings[mid].isEmpty() && left <= mid--) {}
        if (mid < left) {
            mid = initialMid + 1;
            while (strings[mid].isEmpty() && mid++ <= right) {}
        }
        if (right < mid) {
            return -1;
        }

        int midCompare = strings[mid].compareTo(x);
        if (midCompare == 0) {
            return mid;
        } else if (midCompare > 0) {
            return binarySearch(strings, x, left, mid - 1);
        }
        return binarySearch(strings, x, mid + 1, right);
    }

}
