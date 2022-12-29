package cci.ch_5_bit_manipulation;

public class T_5_1_BitInsertion {

    public static int insert(int n, int m, int i, int j) {
        int mask = (1 << j + 1) - (1 << i);
        return (n & ~mask) | (m << i);
    }

}
