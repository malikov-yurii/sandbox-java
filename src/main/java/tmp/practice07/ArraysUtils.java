package tmp.practice07;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Yurii Malikov
 */
public class ArraysUtils {

    public static void print(Array array) {
        System.out.println(array);
    }

    public static Array sum(Array<? extends Number> firstArray, Array<? extends Number> secondArray) {
        ensureSameSizeNumberArraysInitialized(firstArray, secondArray);
        return perform(firstArray, "sum", secondArray);
    }

    public static Array subtract(Array<? extends Number> firstArray, Array<? extends Number> secondArray) {
        ensureSameSizeNumberArraysInitialized(firstArray, secondArray);
        return perform(firstArray, "subtract", secondArray);
    }

    public static Array multiply(Array<? extends Number> firstArray, Array<? extends Number> secondArray) {
        ensureSameSizeNumberArraysInitialized(firstArray, secondArray);
        return perform(firstArray, "multiply", secondArray);
    }

    @SuppressWarnings("unchecked")
    private static Array perform(Array<? extends Number> firstArray, String operationName, Array<? extends Number> secondArray) {
        Class resultClass = getResultClass(firstArray.getComponentType(), secondArray.getComponentType());
        Array resultArray = Array.of((Number[]) java.lang.reflect.Array.newInstance(resultClass, firstArray.size()));
        String prefix = resultClass.equals(Integer.class) ? "int" : resultClass.getSimpleName().toLowerCase();

        for (int i = 0; i < resultArray.size(); i++) {
            try {
                resultArray.set(i, NumbersUtils.class.getMethod(operationName, Number.class, Number.class).invoke(null,
                        firstArray.getComponentType().getDeclaredMethod(prefix + "Value").invoke(firstArray.get(i)),
                        secondArray.getComponentType().getDeclaredMethod(prefix + "Value").invoke(secondArray.get(i))));
            } catch (Exception e) {
                throw new RuntimeException("method invocation failed", e);
            }
        }

        return resultArray;
    }

    private static Class getResultClass(Class firstClass, Class secondClass) {
        List<Class> supportedClasses = Arrays.asList(new Class[]{Double.class, Float.class, Long.class, Integer.class,
                Short.class, Byte.class, AtomicInteger.class, AtomicLong.class});

        if ((firstClass.equals(Double.class) || secondClass.equals(Double.class)) || !(supportedClasses.contains(firstClass) && supportedClasses.contains(secondClass)))
            return Double.class;

        if (firstClass.equals(Float.class) || secondClass.equals(Float.class))
            return Float.class;

        if (firstClass.equals(Long.class) || secondClass.equals(Long.class)
                || firstClass.equals(AtomicLong.class) || secondClass.equals(AtomicLong.class))
            return Long.class;

        return Integer.class;
    }

    private static void ensureSameSizeNumberArraysInitialized(Array firstArray, Array secondArray) {
        ensureArrayIsInitialized(firstArray);
        ensureArrayIsInitialized(secondArray);

        ensureIsNumberArray(firstArray);
        ensureIsNumberArray(secondArray);

        ensureArraySizesAreEqual(firstArray, secondArray);
    }

    private static void ensureIsNumberArray(Array array) {
        if (!(array.get(0) instanceof Number)) {
            throw new IllegalArgumentException(array + " method argument is not array of numbers");
        }
    }

    private static void ensureArraySizesAreEqual(Array firstArray, Array secondArray) {
        if (firstArray.size() != secondArray.size()) {
            throw new IllegalArgumentException("Provided arrays have not same sizes");
        }
    }

    private static void ensureArrayIsInitialized(Array array) {
        if (array == null || array.size() == 0) {
            throw new NullPointerException("Array method has not been initialized.");
        }
    }

}
