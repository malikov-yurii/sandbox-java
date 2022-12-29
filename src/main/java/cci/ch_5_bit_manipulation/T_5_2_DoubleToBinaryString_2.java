package cci.ch_5_bit_manipulation;

public class T_5_2_DoubleToBinaryString_2 {

    public static String toBinaryString(double num) {
        if (num < 0 || num > 1) {
            return "ERROR";
        }
        StringBuilder sb = new StringBuilder(".");
        double fraction = 0.5;
        while (num > 0) {
            if (num >= fraction) {
                sb.append("1");
                num -= fraction;
            } else {
                sb.append("0");
            }
            if (sb.length() >= 32) {
                return "ERROR "   + sb.toString();
            }
            fraction /= 2;
        }
        return sb.toString();
    }

}
