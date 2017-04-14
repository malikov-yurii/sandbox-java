package lesson2.matrixtask;

import java.util.Random;

public class MatrixFactory {

    public static Matrix createMatrix(int verticalSize, int horizontalSize) {
        Matrix result = new Matrix(verticalSize, horizontalSize);
        Random rand = new Random();
        for (int i = 0; i < verticalSize; i++) {
            for (int j = 0; j < horizontalSize; j++) {
                result.setElement(i, j, rand.nextInt(verticalSize * horizontalSize));
            }
        }
        return result;
    }

}
