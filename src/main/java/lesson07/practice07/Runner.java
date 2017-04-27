package lesson07.practice07;

/**
 * @author Yurii Malikov
 */
public class Runner {
    public static void main(String[] args){

        Array firstIntegerArray = Array.create(new Integer[]{1, 2, 3, 4});
        Array secondIntegerArray = Array.create(new Integer[]{2, 2, 2, 2});

        Array firstLongArray = Array.create(new Long[]{1L, 2L, 3L, 4L});
        Array secondLongArray = Array.create(new Long[]{3L, 3L, 3L, 3L});

        Array firstDoubleArray = Array.create(new Double[]{1d, 2d, 3d, 444d});
        Array firstDoubleArrayDublicate = Array.create(new Double[]{1d, 2d, 3d, 444d});
        Array secondDoubleArray = Array.create(new Double[]{4d, 5d, 5d, 5d});

        Array resultIntegerAddIntegerArray = firstIntegerArray.add(secondIntegerArray);
        Array resultLongAddLongArray = firstLongArray.add(secondLongArray);
        Array resultDoubleAddDoubleArray = firstDoubleArray.add(secondDoubleArray);
        Array resultIntegerAddDoubleArray = firstIntegerArray.add(secondDoubleArray);
        Array resultLongAddDoubleArray = firstLongArray.add(secondDoubleArray);
        Array resultIntegerAddLongArray = firstIntegerArray.add(secondLongArray);

        Array resultIntegerSubtractIntegerArray = firstIntegerArray.subtract(secondIntegerArray);
        Array resultLongSubtractLongArray = firstLongArray.subtract(secondLongArray);
        Array resultDoubleSubtractDoubleArray = firstDoubleArray.subtract(secondDoubleArray);
        Array resultIntegerSubtractDoubleArray = firstIntegerArray.subtract(secondDoubleArray);
        Array resultLongSubtractDoubleArray = firstLongArray.subtract(secondDoubleArray);
        Array resultIntegerSubtractLongArray = firstIntegerArray.subtract(secondLongArray);

        Array resultIntegerMultiplyIntegerArray = firstIntegerArray.multiply(secondIntegerArray);
        Array resultLongMultiplyLongArray = firstLongArray.multiply(secondLongArray);
        Array resultDoubleMultiplyDoubleArray = firstDoubleArray.multiply(secondDoubleArray);
        Array resultIntegerMultiplyDoubleArray = firstIntegerArray.multiply(secondDoubleArray);
        Array resultLongMultiplyDoubleArray = firstLongArray.multiply(secondDoubleArray);
        Array resultIntegerMultiplyLongArray = firstIntegerArray.multiply(secondLongArray);

        System.out.println("equals() test:"
                + "\nfirstDoubleArray.equals(firstDoubleArrayDublicate) = " + firstDoubleArray.equals(firstDoubleArrayDublicate)
                + "\nfirstDoubleArray.equals(secondDoubleArray) = " + firstDoubleArray.equals(secondDoubleArray)
                + "\n\nsum test:"
                + "\nresultIntegerAddIntegerArray = " + resultIntegerAddIntegerArray + " Type of element in result arr = " + resultIntegerAddIntegerArray.getElementClass()
                + "\nresultLongAddLongArray = " + resultLongAddLongArray + " Type of element in result arr = " + resultLongAddLongArray.getElementClass()
                + "\nresultDoubleAddDoubleArray = " + resultDoubleAddDoubleArray + " Type of element in result arr = " + resultDoubleAddDoubleArray.getElementClass()
                + "\nresultIntegerAddDoubleArray = " + resultIntegerAddDoubleArray + " Type of element in result arr = " + resultIntegerAddDoubleArray.getElementClass()
                + "\nresultLongAddDoubleArray = " + resultLongAddDoubleArray + " Type of element in result arr = " + resultLongAddDoubleArray.getElementClass()
                + "\nresultIntegerAddLongArray = " + resultIntegerAddLongArray + " Type of element in result arr = " + resultIntegerAddLongArray.getElementClass()
                + "\n\nsubtract test:"
                + "\nresultIntegerSubtractIntegerArray = " + resultIntegerSubtractIntegerArray + " Type of element in result arr = " + resultIntegerSubtractIntegerArray.getElementClass()
                + "\nresultLongSubtractLongArray = " + resultLongSubtractLongArray + " Type of element in result arr = " + resultLongSubtractLongArray.getElementClass()
                + "\nresultDoubleSubtractDoubleArray = " + resultDoubleSubtractDoubleArray + " Type of element in result arr = " + resultDoubleSubtractDoubleArray.getElementClass()
                + "\nresultIntegerSubtractDoubleArray = " + resultIntegerSubtractDoubleArray + " Type of element in result arr = " + resultIntegerSubtractDoubleArray.getElementClass()
                + "\nresultLongSubtractDoubleArray = " + resultLongSubtractDoubleArray + " Type of element in result arr = " + resultLongSubtractDoubleArray.getElementClass()
                + "\nresultIntegerSubtractLongArray = " + resultIntegerSubtractLongArray + " Type of element in result arr = " + resultIntegerSubtractLongArray.getElementClass()
                + "\n\nmultiply test:"
                + "\nresultIntegerMultiplyIntegerArray = " + resultIntegerMultiplyIntegerArray + " Type of element in result arr = " + resultIntegerMultiplyIntegerArray.getElementClass()
                + "\nresultLongMultiplyLongArray = " + resultLongMultiplyLongArray + " Type of element in result arr = " + resultLongMultiplyLongArray.getElementClass()
                + "\nresultDoubleMultiplyDoubleArray = " + resultDoubleMultiplyDoubleArray + " Type of element in result arr = " + resultDoubleMultiplyDoubleArray.getElementClass()
                + "\nresultIntegerMultiplyDoubleArray = " + resultIntegerMultiplyDoubleArray + " Type of element in result arr = " + resultIntegerMultiplyDoubleArray.getElementClass()
                + "\nresultLongMultiplyDoubleArray = " + resultLongMultiplyDoubleArray + " Type of element in result arr = " + resultLongMultiplyDoubleArray.getElementClass()
                + "\nresultIntegerMultiplyLongArray = " + resultIntegerMultiplyLongArray + " Type of element in result arr = " + resultIntegerMultiplyLongArray.getElementClass()
        );

        System.out.println("\nprint() test:");
        resultIntegerAddDoubleArray.print();
    }
}
