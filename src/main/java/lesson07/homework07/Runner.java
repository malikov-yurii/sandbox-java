package lesson07.homework07;

/**
 * @author Yurii Malikov
 */
public class Runner {
    public static void main(String[] args){


        Array firstIntegerArray = Array.create(new Integer[]{1, 2, 3, 4});
        Array secondIntegerArray = Array.create(new Integer[]{1, 1, 1, 1});

        Array firstDoubleArray = Array.create(new Double[]{1d, 2d, 3d, 444d});
        Array firstDoubleArrayDublicate = Array.create(new Double[]{1d, 2d, 3d, 444d});
        Array secondDoubleArray = Array.create(new Double[]{1d, 1d, 1d, 1d});



        Array resultIntegerAddIntegerArray = firstIntegerArray.add(secondIntegerArray);
        Array resultDoubleAddDoubleArray = firstDoubleArray.add(secondDoubleArray);

        Array resultIntegerAddDoubleArray = firstIntegerArray.add(secondDoubleArray);

        resultIntegerAddIntegerArray.print();
        resultDoubleAddDoubleArray.print();



        System.out.println("equals() test:"
                + "\nfirstDoubleArray.equals(firstDoubleArrayDublicate) = " + firstDoubleArray.equals(firstDoubleArrayDublicate)
                + "\nfirstDoubleArray.equals(secondDoubleArray) = " + firstDoubleArray.equals(secondDoubleArray)
                + "\n\nsum test:"
                + "\nresultIntegerAddDoubleArray = " + resultIntegerAddDoubleArray + " Type of element in result arr = " + resultIntegerAddDoubleArray.getElementClass()

        );

        System.out.println("print() test:");
        resultIntegerAddDoubleArray.print();
    }
}
