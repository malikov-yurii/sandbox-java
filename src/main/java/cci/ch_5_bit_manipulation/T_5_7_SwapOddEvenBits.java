package cci.ch_5_bit_manipulation;

public class T_5_7_SwapOddEvenBits {

    public static int swap(int a) {
//                System.out.printf("\n0x5555_5555=%s len=%d", Integer.toBinaryString(0x5555_5555), Integer.toBinaryString(0x5555_5555).length());
//        System.out.printf("\n0xA =%s", Integer.toBinaryString(0xA));
//        System.out.printf("\n0xAA=%s dec=%d", Integer.toBinaryString(0xAA), 0xAA);
        return (a & 0xAAAA_AAAA) >>> 1 | ( (0x5555_5555 & a) << 1) ;
    }

}
// a = 10 10^2
//(2^4 )^ 2
//2 ^ 8 + 2^4 =r
//0101
