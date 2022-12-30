package cci.ch_5_bit_manipulation;

public class T_5_4_PrevNumberWithTheSameOneQtyInBinary {

    public static int getPrev(int n) {
        int c = n;
        int c0 = 0;
        int c1 = 0;

        while (c % 2 == 1) {
            c1++;
            c >>= 1;
        }

        while (c != 0 && c % 2 == 0) {
            c0++;
            c >>= 1;
        }
        if (c0 == 0) {
            throw new RuntimeException("No prev for " + n + " exists");
        }

        int position = c0 + c1;
        int zeroMask = ~((1 << (position + 1)) - 1);
        int result = n & zeroMask; // zero out all bits starting from position inclusively
        int oneMask = ((1 << (c1 + 1)) - 1) << (c0 - 1);
        System.out.println("c0=" + c0 + " c1=" + c1 +
                " zeroMask=" + Integer.toBinaryString(zeroMask) +
                " oneMask=" + Integer.toBinaryString(oneMask));

        return result | oneMask;
    }
}
