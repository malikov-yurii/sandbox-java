package cci.ch_5_bit_manipulation;

public class T_5_8_DrawLine {

    public static void draw(byte[] screen, int width, int x1, int x2, int y) {
        int rowOffset = y * width / 8;
        int startInd = rowOffset + x1 / 8;
        int leftZeroes = x1 % 8;
        if (leftZeroes != 0) {
            screen[startInd] = (byte) ((1 << (8 - leftZeroes)) - 1);
            startInd++;
        }
        int endInd = rowOffset + x2 / 8 - 1;
        int rightOnes = x2 % 8;
        if (rightOnes != 0) {
            screen[endInd + 1] = (byte) (~0 << (8 - rightOnes));
        }
        for (int i = startInd; i <= endInd; i++) {
            screen[i] = (byte) 0b11111111;
        }
    }

}
