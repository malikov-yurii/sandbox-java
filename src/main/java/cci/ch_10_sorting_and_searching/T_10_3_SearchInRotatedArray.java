package cci.ch_10_sorting_and_searching;

public class T_10_3_SearchInRotatedArray {

    public static int search(int[] ints, int x) {
        return search(ints, x, 0, ints.length - 1);
    }

    private static int search(int[] ints, int x, int left, int right) {
        int mid = (right + left) / 2;
        if (ints[mid] == x) {
            return mid;
        }
        if (left > right) {
            return -1;
        }

        if (ints[left] < ints[mid]) {
            if (ints[left] <= x && x < ints[mid]) {
                return search(ints, x, left, mid - 1);
            } else {
                return search(ints, x, mid + 1, right);
            }
        } else if (ints[mid] < ints[right]) {
            if (ints[mid] < x && x <= ints[right]) {
                return search(ints, x, mid + 1, right);
            } else {
                return search(ints, x, left, mid - 1);
            }
        } else if (ints[left] == ints[mid]) {
            if (ints[mid] != ints[right]) {
                return search(ints, x, mid + 1, right);
            }
            int found = search(ints, x, left, mid - 1);
            if (found != -1) {
                return found;
            }
            return search(ints, x, mid + 1, right);
        }
        return -1;
    }

}
