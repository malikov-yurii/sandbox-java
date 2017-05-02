package lesson07.practice07;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Yurii Malikov
 */
public class Runner {

    public static void main(String[] args) {

//      initialize test data

        Array<Integer> firstIntegerArray = Array.of(new Integer[]{1, 2, 3, 4});
        Array secondIntegerArray = Array.of(new Integer[]{2, 2, 2, 2});

        Array firstLongArray = Array.of(new Long[]{1L, 2L, 3L, 4L});
        Array secondLongArray = Array.of(new Long[]{3L, 3L, 3L, 3L});

        Array firstDoubleArray = Array.of(new Double[]{1d, 2d, 3d, 444d});
        Array firstDoubleArrayClone = Array.of(new Double[]{1d, 2d, 3d, 444d});
        Array secondDoubleArray = Array.of(new Double[]{4d, 5d, 5d, 5d});

        Array atomicIntegerArray = Array.of(new AtomicInteger[]{new AtomicInteger(1),
                new AtomicInteger(2), new AtomicInteger(2), new AtomicInteger(2)});

        Array bigIntegerArray = Array.of(new BigInteger[]{new BigInteger("1"), new BigInteger("2"),
                new BigInteger("3"), new BigInteger("4")});

//      tests

        System.out.println("test ArraysUtils.print(Array.of(new Integer[]{11, 22, 33, 44})):");
        ArraysUtils.print(Array.of(new Integer[]{11, 22, 33, 44}));

        System.out.println(
                "\ntest equals():"
                        + "\nfirstDoubleArray.equals(firstDoubleArrayClone) = " + firstDoubleArray.equals(firstDoubleArrayClone)
                        + "\nfirstDoubleArray.equals(secondDoubleArray) = " + firstDoubleArray.equals(secondDoubleArray)

                        + "\n\ntest hashCode():"
                        + "\nfirstDoubleArray.hashCode() = " + firstDoubleArray.hashCode()
                        + "\nfirstDoubleArray.hashCode() = " + firstDoubleArray.hashCode()
                        + "\nfirstDoubleArrayClone.hashCode() = " + firstDoubleArrayClone.hashCode()
                        + "\nfirstIntegerArray.hashCode() = " + firstIntegerArray.hashCode()
                        + "\nfirstLongArray.hashCode() = " + firstLongArray.hashCode()

                        + "\n\ntest ArraysUtils.add(firstArray, secondArray):"
                        + "\nArraysUtils.add(" + firstIntegerArray + ", " + secondIntegerArray + ") = " + ArraysUtils.add(firstIntegerArray, secondIntegerArray)
                        + "\nArraysUtils.add(" + firstLongArray + ", " + secondLongArray + ") = " + ArraysUtils.add(firstLongArray, secondLongArray)
                        + "\nArraysUtils.add(" + firstDoubleArray + ", " + secondDoubleArray + ") = " + ArraysUtils.add(firstDoubleArray, secondDoubleArray)
                        + "\nArraysUtils.add(" + firstIntegerArray + ", " + secondDoubleArray + ") = " + ArraysUtils.add(firstIntegerArray, secondDoubleArray)
                        + "\nArraysUtils.add(" + firstLongArray + ", " + secondDoubleArray + ") = " + ArraysUtils.add(firstLongArray, secondDoubleArray)
                        + "\nArraysUtils.add(" + firstIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.add(firstIntegerArray, secondLongArray)
                        + "\nArraysUtils.add(" + atomicIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.add(atomicIntegerArray, secondLongArray)
                        + "\nArraysUtils.add(" + bigIntegerArray + ", " + secondLongArray + ") = " + ArraysUtils.add(bigIntegerArray, secondLongArray)

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
