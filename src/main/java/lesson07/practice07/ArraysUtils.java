package lesson07.practice07;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Yurii Malikov
 */
public class ArraysUtils {

    public static Array add(Array firstArray, Array secondArray) {
        ensureNotNullAndHaveSameSizes(firstArray, secondArray);
        return perform(firstArray, "sum", secondArray);
    }

    public static Array subtract(Array firstArray, Array secondArray) {
        ensureNotNullAndHaveSameSizes(firstArray, secondArray);
        return perform(firstArray, "subtract", secondArray);
    }

    public static Array multiply(Array firstArray, Array secondArray) {
        ensureNotNullAndHaveSameSizes(firstArray, secondArray);
        return perform(firstArray, "multiply", secondArray);
    }

    public static void print(Array array) {
        System.out.println(array);
    }

    @SuppressWarnings("unchecked")
    private static Array perform(Array firstArray, String operationName, Array secondArray) {
        Class resultClass = getResultClass(firstArray.getGenericClass(), secondArray.getGenericClass());
        Array resultArray = Array.of((Number[]) java.lang.reflect.Array.newInstance(resultClass, firstArray.size()));
        String prefix = resultClass.equals(Integer.class) ? "int" : resultClass.getSimpleName().toLowerCase();

        for (int i = 0; i < resultArray.size(); i++) {
            try {
                resultArray.set(i, (Number) NumbersUtils.class.getMethod(operationName, Number.class, Number.class).invoke(null,
                        firstArray.getGenericClass().getDeclaredMethod(prefix + "Value").invoke(firstArray.get(i)),
                        secondArray.getGenericClass().getDeclaredMethod(prefix + "Value").invoke(secondArray.get(i))));
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

    private static void ensureNotNullAndHaveSameSizes(Array firstArray, Array secondArray) {
        if (firstArray == null || secondArray == null) {
            throw new NullPointerException("One of arguments (Array.class) was not initialized.");
        }

        if (firstArray.size() != secondArray.size()) {
            throw new IllegalArgumentException("Provided arrays have not same sizes");
        }
    }
}
