package cci.ch_5_bit_manipulation;

public class T_5_2_DoubleToBinaryString {

    public static String toBinaryString(double num) {
        if (num < 0 || num > 1) {
            return "ERROR";
        }
        StringBuilder sb = new StringBuilder(".");
        while (num > 0) {
            num *= 2;
            if (num >= 1) {
                sb.append("1");
                num -= 1;
            } else {
                sb.append("0");
            }
            if (sb.length() >= 32) {
                return "ERROR "   + sb.toString();
            }
        }
        return sb.toString();
    }

}
