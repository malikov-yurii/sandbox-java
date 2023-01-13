package cci.ch_8_recursion_and_dynamic;

public class T_8_5_RecursiveMultiply {

    public static int getProduct(int a, int b) {
        return computeProduct(Math.min(a, b), Math.max(a, b));
    }

    private static int computeProduct(int small, int big) {
        if (small == 0) {
            return 0;
        } else if (small == 1) {
            return big;
        }
        int halfProduct = computeProduct(small >> 1, big);
        int product = halfProduct + halfProduct;
        return  (small & 1) == 1 ? product + big : product;
    }

}
