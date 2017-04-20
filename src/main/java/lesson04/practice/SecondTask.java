package lesson04.practice;

import java.util.Arrays;

/**
 * Created by Malikov on 4/20/2017.
 */
public class SecondTask {

    public static void main(String[] args) {
        double[] numbers = mapStringArrayToDoubleArray(args);
        System.out.println("Arguments " + Arrays.toString(args));
        System.out.println("Quantity of numbers = " + numbers.length);
        System.out.println("Min number in params = " + getMinElement(numbers));
        System.out.println("Max number in params = " + getMaxElement(numbers));
        System.out.printf("Average number in params = " + getAverage(numbers));
    }

    private static double[] mapStringArrayToDoubleArray(String[] strings) {
        if (strings == null || strings.length == 0){
            throw new RuntimeException("There are no elements in string array to proceed");
        }
        double[] nubers = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nubers[i] = Double.parseDouble(strings[i]);
        }
        return nubers;
    }

    private static strictfp double getMinElement(double[] numbers) {
        ensureDoubleArrayHasElements(numbers);
        double minElement = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minElement) {
                minElement = numbers[i];
            }
        }
        return minElement;
    }

    private static strictfp double getMaxElement(double[] numbers) {
        ensureDoubleArrayHasElements(numbers);
        double maxElement = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
            }
        }
        return maxElement;
    }

    private static strictfp double getAverage(double[] numbers) {
        ensureDoubleArrayHasElements(numbers);
        double average = 0;
        for (double number : numbers) {
            average += number;
        }
        return average / numbers.length;
    }


    private static void ensureDoubleArrayHasElements(double[] numbers) {
        if (numbers != null && numbers.length == 0) {
            throw new RuntimeException("Array length is 0 or array is not initialized.");
        }
    }


}
