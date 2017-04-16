package lesson02.matrixtask;

import java.util.Random;

public class MatrixFactory {

    public static Matrix createMatrix(int verticalSize, int horizontalSize) {
        Matrix result = new Matrix(verticalSize, horizontalSize);
        Random rand = new Random();
        int randTopLimit = verticalSize * horizontalSize;
        for (int i = 0; i < verticalSize; i++) {
            for (int j = 0; j < horizontalSize; j++) {
                result.setElement(i, j, rand.nextInt(randTopLimit));
            }
        }
        return result;
    }

}
