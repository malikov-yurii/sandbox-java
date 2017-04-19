package lesson02.matrixtask;

public class Runner {

    public static void main(String[] args) {
        Matrix firstMatrix = MatrixFactory.createMatrix(3, 8),
                secondMatrix = MatrixFactory.createMatrix(3, 8);
        System.out.println("First matrix:\n" + firstMatrix
                + "\nSecond matrix:\n" + secondMatrix
                + "\nResult matrix:\n" + Summator.sumTwoMatrices(firstMatrix, secondMatrix));
    }

}
