package tmp.lesson04.practice;

/**
 * @author Yurii Malikov
 */
public class FourthTask {

    public static void main(String[] args) {
        System.out.println("Left table :\n" + printLeftTableFor(9)
                + "\nRight table:\n" + printRightTableFor(9));
    }

    private static String printLeftTableFor(int rowQuantity) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rowQuantity ; i++) {
            for (int j = i; j >= 0 ; j--) {
                result.append(j).append(' ');
            }
            result.append('\n');
        }
        return result.toString();
    }

    private static String printRightTableFor(int rowQuantity) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= rowQuantity ; i++) {
            for (int j = rowQuantity; j > 0; j--) {
                result.append(j > i ? "  " : (j + " "));
            }
            result.append('\n');
        }
        return result.toString();
    }
}
