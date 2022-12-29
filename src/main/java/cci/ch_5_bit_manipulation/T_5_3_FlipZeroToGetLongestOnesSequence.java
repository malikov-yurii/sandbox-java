package cci.ch_5_bit_manipulation;

public class T_5_3_FlipZeroToGetLongestOnesSequence {

    public static int getLongestSequenceLength(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        System.out.println(n + " in binary " +Integer.toBinaryString(n));
        int max = 0;
        int prevDigit = 0;
        int currSeq = 0;
        int prevSeq = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                currSeq++;
                max = Math.max(max, prevSeq + currSeq);
            } else {
                if (prevDigit == 0) {
                    prevSeq = 0;
                } else {
                    prevSeq = currSeq;
                }
                currSeq = 0;
            }
            prevDigit = n % 2;
            n /= 2;
        }
        return max + 1;
    }

}
