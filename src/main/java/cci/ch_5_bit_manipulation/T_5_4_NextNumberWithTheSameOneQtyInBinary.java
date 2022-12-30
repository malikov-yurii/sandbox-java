package cci.ch_5_bit_manipulation;

public class T_5_4_NextNumberWithTheSameOneQtyInBinary {

    public static int getNext(int n) {
        int position = 0;
        int oneCount = 0;
        int remaining = n;
        while (remaining > 0) {
            if (remaining % 2 == 1) {
                oneCount++;
            } else if (oneCount > 0) {
                break;
            }
            remaining /= 2;
            position++;
        }
        int result = n | (1 << position);
        result &= ~((1 << position) - 1);
        result |= (1 << (oneCount - 1)) - 1;
        return result;
    }
}
