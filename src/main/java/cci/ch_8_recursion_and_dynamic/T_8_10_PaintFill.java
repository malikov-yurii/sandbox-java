package cci.ch_8_recursion_and_dynamic;

public class T_8_10_PaintFill {

    public static void fill(int[][] screen, int row, int column, int newColor) {
        fill(screen, row, column, newColor, screen[row][column]);
    }

    private static void fill(int[][] screen, int row, int col, int newColor, int origColor) {
        if (row >= 0 && row < screen.length && col >= 0 && col < screen[0].length && screen[row][col] == origColor) {
            screen[row][col] = newColor;
            fill(screen, row - 1, col, newColor, origColor);
            fill(screen, row, col - 1, newColor, origColor);
            fill(screen, row, col + 1, newColor, origColor);
            fill(screen, row + 1, col, newColor, origColor);
        }
    }

}
