package lesson02.matrixtask;

public class Summator {

    public static Matrix sumTwoMatrices(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getVerticalSize() != matrix2.getVerticalSize()
                || matrix1.getHorizontalSize() != matrix2.getHorizontalSize()) {
            throw new NotSameSizeOfMatricesException();
        }

        Matrix resultMatrix = new Matrix(matrix1.getVerticalSize(), matrix1.getHorizontalSize());
        for (int i = 0; i < resultMatrix.getVerticalSize(); i++) {
            for (int j = 0; j < resultMatrix.getHorizontalSize(); j++) {
                resultMatrix.setElement(i, j, matrix1.getElement(i, j) + matrix2.getElement(i, j));
            }
        }
        return resultMatrix;
    }

}
