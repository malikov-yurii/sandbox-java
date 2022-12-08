package cci.ch_1_strings_and_arrays;

public class T_1_7_RotateMatrixRight90Degrees {

    //    Runtime: O(n)
    //    Memory: O(1)
    public static void rotate(int[][] matrix) {
        for (int offset = 0; offset < matrix.length / 2; offset++) {
            rotateInnerSquare(matrix, offset, matrix.length - offset * 2);
        }

    }

    private static void rotateInnerSquare(int[][] matrix, int offset, int squareLen) {
        for (int i = 0; i < squareLen - 1; i++) {
            int tmp = matrix[offset][offset + i];
            matrix[offset][offset + i] = matrix[offset + squareLen - 1 - i][offset];
            matrix[offset + squareLen - 1 - i][offset] = matrix[offset + squareLen - 1][offset + squareLen - 1 - i];
            matrix[offset + squareLen - 1][offset + squareLen - 1 - i] = matrix[offset + i][offset + squareLen - 1];
            matrix[offset + i][offset + squareLen - 1] = tmp;
        }
    }

}