package tmp.practice07;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Yurii Malikov
 */
public class Runner {

    public static void main(String[] args) {

//      initialize test data

        Array<Integer> firstIntegerArray = Array.of(1, 2, 3, 4);
        Array<Integer> secondIntegerArray = Array.of(2, 2, 2, 2);

        Array<Long> firstLongArray = Array.of(1L, 2L, 3L, 4L);
        Array<Long> secondLongArray = Array.of(3L, 3L, 3L, 3L);

        Array<Double> firstDoubleArray = Array.of(1d, 2d, 3d, 444d);
        Array<Double> firstDoubleArrayClone = Array.of(1d, 2d, 3d, 444d);
        Array<Double> secondDoubleArray = Array.of(4d, 5d, 5d, 5d);

        Array<AtomicInteger> atomicIntegerArray = Array.of(new AtomicInteger(1),
                new AtomicInteger(2), new AtomicInteger(2), new AtomicInteger(2));

        Array<BigInteger> bigIntegerArray = Array.of(new BigInteger("1"), new BigInteger("2"),
                new BigInteger("3"), new BigInteger("4"));

/*
        Array stringArray = Array.of("1", "2", "oops", "3i");
        System.out.println(ArraysUtils.sum(firstIntegerArray, stringArray));

        Array<String> stringArray = Array.of("1", "2", "oops", "3i");
        System.out.println(ArraysUtils.sum(firstIntegerArray, stringArray));

        Array<String> firstMixedArray = Array.of("1", "2", "oops", 3);
        Array<String> typeMismatchArray = Array.of(1L, 3L);
*/

//      tests

        System.out.println("test ArraysUtils.print(Array.of(11, 22, 33, 44)):");
        ArraysUtils.print(Array.of(11, 22, 33, 44));

        System.out.println(
                "\nArray.createEmptyArraySize(3, String.class) : \n"
                        + Array.createEmptyArraySize(3, String.class)
                        + "\n\ntest equals():"
                        + "\nfirstDoubleArray.equals(firstDoubleArrayClone) = " + firstDoubleArray.equals(firstDoubleArrayClone)
                        + "\nfirstDoubleArray.equals(secondDoubleArray) = " + firstDoubleArray.equals(secondDoubleArray)

                        + "\n\ntest hashCode():"
                        + "\nfirstDoubleArray.hashCode() = " + firstDoubleArray.hashCode()
                        + "\nfirstDoubleArray.hashCode() = " + firstDoubleArray.hashCode()
                        + "\nfirstDoubleArrayClone.hashCode() = " + firstDoubleArrayClone.hashCode()
                        + "\nfirstIntegerArray.hashCode() = " + firstIntegerArray.hashCode()
                        + "\nfirstLongArray.hashCode() = " + firstLongArray.hashCode()

                        + "\n\ntest ArraysUtils.sum(firstArray, secondArray):"
                        + "\nArraysUtils.sum(" + firstIntegerArray + ", " + secondIntegerArray + ") = " + ArraysUtils.sum(firstIntegerArray, secondIntegerArray)
                        + "\nArraysUtils.sum(" + firstLongArray + ", " + secondLongArray + ") = " + ArraysUtils.sum(firstLongArray, secondLongArray)
                        + "\nArraysUtils.sum(" + firstDoubleArray + ", " + secondDoubleArray + ") = " + ArraysUtils.sum(firstDoubleArray, secondDoubleArray)
                        + "\nArraysUtils.sum(" + firstIntegerArray + ", " + secondDoubleArray + ") = " + ArraysUtils.sum(firstIntegerArray, secondDoubleArray)
                        + "\nArraysUtils.sum(" + firstLongArray + ", " + secondDoubleArray + ") = " + ArraysUtils.sum(firstLongArray, secondDoubleArray)
                        + "\nArraysUtils.sum(" + firstIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.sum(firstIntegerArray, secondLongArray)
                        + "\nArraysUtils.sum(" + atomicIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.sum(atomicIntegerArray, secondLongArray)
                        + "\nArraysUtils.sum(" + bigIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.sum(bigIntegerArray, secondLongArray)

                        + "\n\ntest ArraysUtils.subtract(firstArray, secondArray):"
                        + "\nArraysUtils.subtract(" + firstIntegerArray + ", " + secondIntegerArray + ") = " + ArraysUtils.subtract(firstIntegerArray, secondIntegerArray)
                        + "\nArraysUtils.subtract(" + firstLongArray + ", " + secondLongArray + ") = " + ArraysUtils.subtract(firstLongArray, secondLongArray)
                        + "\nArraysUtils.subtract(" + firstDoubleArray + ", " + secondDoubleArray + ") = " + ArraysUtils.subtract(firstDoubleArray, secondDoubleArray)
                        + "\nArraysUtils.subtract(" + firstIntegerArray + ", " + secondDoubleArray + ") = " + ArraysUtils.subtract(firstIntegerArray, secondDoubleArray)
                        + "\nArraysUtils.subtract(" + firstLongArray + ", " + secondDoubleArray + ") = " + ArraysUtils.subtract(firstLongArray, secondDoubleArray)
                        + "\nArraysUtils.subtract(" + firstIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.subtract(firstIntegerArray, secondLongArray)
                        + "\nArraysUtils.subtract(" + atomicIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.subtract(atomicIntegerArray, secondLongArray)
                        + "\nArraysUtils.subtract(" + bigIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.subtract(bigIntegerArray, secondLongArray)

                        + "\n\ntest ArraysUtils.multiply(firstArray, secondArray):"
                        + "\nArraysUtils.multiply(" + firstIntegerArray + ", " + secondIntegerArray + ") = " + ArraysUtils.multiply(firstIntegerArray, secondIntegerArray)
                        + "\nArraysUtils.multiply(" + firstLongArray + ", " + secondLongArray + ") = " + ArraysUtils.multiply(firstLongArray, secondLongArray)
                        + "\nArraysUtils.multiply(" + firstDoubleArray + ", " + secondDoubleArray + ") = " + ArraysUtils.multiply(firstDoubleArray, secondDoubleArray)
                        + "\nArraysUtils.multiply(" + firstIntegerArray + ", " + secondDoubleArray + ") = " + ArraysUtils.multiply(firstIntegerArray, secondDoubleArray)
                        + "\nArraysUtils.multiply(" + firstLongArray + ", " + secondDoubleArray + ") = " + ArraysUtils.multiply(firstLongArray, secondDoubleArray)
                        + "\nArraysUtils.multiply(" + firstIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.multiply(firstIntegerArray, secondLongArray)
                        + "\nArraysUtils.multiply(" + atomicIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.multiply(atomicIntegerArray, secondLongArray)
                        + "\nArraysUtils.multiply(" + bigIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.multiply(bigIntegerArray, secondLongArray)
        );

        System.out.println("\ntest iterator for Array.of(new Integer[]{1, 2, 3, 4}):");
        for (Integer integer : firstIntegerArray) {
            System.out.print(integer + " ");
        }
    }

}
