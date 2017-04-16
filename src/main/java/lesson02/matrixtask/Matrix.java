package lesson02.matrixtask;

public class Matrix {

    private int[][] arr;

    public Matrix(int verticalSize, int horizontalSize) {
        arr = new int[verticalSize][horizontalSize];
    }

    public int getElement(int verticalPosition, int horizontalPosition) {
        ensureArgsAreInsideMatrixBounds(verticalPosition, horizontalPosition);
        return arr[verticalPosition][horizontalPosition];
    }

    public void setElement(int verticalPosition, int horizontalPosition, int newValue) {
        ensureArgsAreInsideMatrixBounds(verticalPosition, horizontalPosition);
        arr[verticalPosition][horizontalPosition] = newValue;
    }

    public int getHorizontalSize() {
        return arr[0].length;
    }

    public int getVerticalSize() {
        return arr.length;
    }

    private void ensureArgsAreInsideMatrixBounds(int verticalPosition, int horizontalPosition) {
        if (!(verticalPosition < getVerticalSize() && horizontalPosition < getHorizontalSize())) {
            throw new IndexOutOfBoundsException("At least on of method arguments is out of bounds!");
        }
    }

    public String toString() {
        String result = "";
        int cellWidth = String.valueOf(getHorizontalSize() * getVerticalSize()).length() + 2;
        for (int[] row : arr) {
            for (int element : row) {
                result += String.format("%" + cellWidth + "d", element);
            }
            result += '\n';
        }
        return result;
//        return Arrays.deepToString(arr).replaceAll("\\], \\[", "\\]\n\\[");
    }

}
