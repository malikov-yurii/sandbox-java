package lesson04.practice;

/**
 * Created by Malikov on 4/20/2017.
 */
public class FourthTask {
    public static void main(String[] args) {
        System.out.println("Table A:\n" + printTableAFor(5)
                + "\nTableB:\n" + printTableB(5));

    }

    private static String printTableAFor(int rowQuantity) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rowQuantity ; i++) {
            for (int j = i; j >= 0 ; j--) {
                result.append(j).append(' ');
            }
            result.append('\n');
        }
        return result.toString();
    }

    private static String printTableB(int rowQuantity) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= rowQuantity ; i++) {
            for (int j = rowQuantity; j > i ; j--) {
                result.append("  ");
            }
            for (int k = i; k >= 1 ; k--) {
                result.append(k).append(' ');
            }
            result.append('\n');
        }
        return result.toString();
    }
}
