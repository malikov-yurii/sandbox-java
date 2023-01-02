package cci.ch_5_bit_manipulation;

public class T_5_6_Conversion {

    public static int countBitDiff(int a, int b) {
        int count = 0;
        for (int i = a ^ b; i != 0; i = i & (i - 1)) {
            count++;
        }
        return count;
    }

    public static int countBitDiff2(int a, int b) {
        int bitDiff = a ^ b;
        int countDiffs = 0;
        while (bitDiff != 0) {
            if (bitDiff % 2 == 1) {
                countDiffs++;
            }
            bitDiff >>= 1;
        }
        return countDiffs;
    }

}
