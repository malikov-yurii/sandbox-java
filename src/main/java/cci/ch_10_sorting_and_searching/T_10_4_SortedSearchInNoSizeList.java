package cci.ch_10_sorting_and_searching;

public class T_10_4_SortedSearchInNoSizeList {

    // TODO: 30.04.2023 Implement without recursion 
    public static int search(Listy list, int x) {
        return list.get(0) == x ? 0 : search(list, x, 1, 2);
    }

    private static int search(Listy list, int x, int left, int right) {
        if (list.get(right) == -1 || x < list.get(right)) {
            return binarySearch(list, x, left, right);
        }
        return search(list, x, right, right + 2 * (right - left));
    }

    private static int binarySearch(Listy list, int x, int left, int right) {
        if (list.get(left) == -1) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (list.get(mid) == x) {
            return mid;
        }
        if (list.get(mid) == -1 || x < list.get(mid)) {
            return binarySearch(list, x, left, mid);
        }
        return binarySearch(list, x, mid, right);
    }

    public static class Listy {
        private final int[] arr;

        public Listy(int... arr) {
            this.arr = arr;
        }

        public int get(int ind) {
            if (ind < 0 || arr.length <= ind) {
                return -1;
            }
            return arr[ind];
        }
    }

}
