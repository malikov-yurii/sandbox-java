package lesson04.practice;

/**
 * Created by Malikov on 4/19/2017.
 */
public class FirstTaskDigitsQuantity {

    public static void main(String[] args) {
        System.out.println(
                "0 in 0 occurs " + countDigitQuantityInNumber(0, 0) + " times\n"
                + "0 in 700 occurs " + countDigitQuantityInNumber(0, 700) + " times\n"
                + "7 in 7 occurs " + countDigitQuantityInNumber(7, 7) + " times\n"
                + "7 in 17 occurs " + countDigitQuantityInNumber(7, -17) + " times\n"
                + "7 in -770 occurs " +countDigitQuantityInNumber(7, -770) + " times\n");
    }

    /**
     * @return  quantity of
     * @param digit in
     * @param number
     */
    public static int countDigitQuantityInNumber(final int digit, int number) {
        int lastDigit, quantity = 0;

        if (digit < 0 || digit > 9){
            throw new IllegalArgumentException("Provided digit should be [0..9]");
        }

        if (digit == 0 && number == 0) {
            return 1;
        }

        if (number < 0){
            number *= -1;
        }

        do{
            lastDigit = number % 10;
            if (lastDigit == digit && number != 0) {
                quantity++;
            }
            number /= 10;
        } while (!(number == 0 && lastDigit == 0));

        return quantity;
    }

}
