package lesson07.practice07;

/**
 * @author Yurii Malikov
 */
public class Array<T extends Number> {

    private Number[] arr;

    private Array(int size) {
        arr = new Number[size];
    }

    private Array(T[] arr) {
        this.arr = arr;
    }

    public static <T extends Number> Array<T> create(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Size of Array object should be greater than -1");
        return new Array<T>(size);
    }

    public static <T extends Number> Array<T> create(T[] arr) {
        return new Array<T>(arr);
    }

    public int size() {
        return arr.length;
    }

    public Class getElementClass() {
        ensureHasElements();
        return arr[0].getClass();
    }

    public T get(int index) {
        rangeCheck(index);
        return (T) arr[index];
    }

    public void set(int index, T newValue) {
        rangeCheck(index);
        arr[index] = newValue;
    }

    private void ensureHasElements() {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("Array has no elements");
        }
    }

    private void rangeCheck(int index) {
        if (index >= arr.length || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Array length: " + arr.length);
    }


    public Array add(Array argumentArray) {
        return performOperationTO("sum", argumentArray);
    }

    public Array subtract(Array argumentArray) {
        return performOperationTO("subtract", argumentArray);
    }

    public Array multiply(Array argumentArray) {
        return performOperationTO("multiply", argumentArray);
    }

    private Array performOperationTO(String operationName, Array argumentArray) {
        Class resultClass = getResultClass(arr[0].getClass(), argumentArray.getElementClass());
        Array resultArray = create((Number[]) java.lang.reflect.Array.newInstance(resultClass, arr.length));
        String prefix = resultClass.equals(Integer.class) ? "Int" : resultClass.getSimpleName();
        String prefixLowerCase = prefix.toLowerCase();

        Class noParams[] = {};
        Class operationParams[] = {resultClass, resultClass};

        for (int i = 0; i < resultArray.size(); i++) {
            try {
                resultArray.set(i, (Number)
                        MathUtils.class.getMethod(operationName + prefix + 's', operationParams).invoke(null,
                                getElementClass().getDeclaredMethod(prefixLowerCase + "Value", noParams).invoke(arr[i], null),
                                argumentArray.getElementClass().getDeclaredMethod(prefixLowerCase + "Value", noParams).invoke(argumentArray.get(i), null)
                        )
                );
            } catch (Exception e) {
                throw new RuntimeException("method invocation failed", e);
            }
        }
        return resultArray;
    }

    private Class getResultClass(Class thisClass, Class argumentClass) {
        if (thisClass.equals(Double.class) || argumentClass.equals(Double.class))
            return Double.class;

        if (thisClass.equals(Long.class) || argumentClass.equals(Long.class))
            return Long.class;

        if ((thisClass.equals(Integer.class) || thisClass.equals(Short.class) || thisClass.equals(Byte.class))
                && (thisClass.equals(Integer.class) || thisClass.equals(Short.class) || thisClass.equals(Byte.class)))
            return Integer.class;

        return Double.class;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Array<?> array = (Array<?>) o;
        if (array.size() != arr.length) return false;

        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            result &= arr[i].equals(array.get(i));
        }

        return result;
//        return Arrays.equals(arr, array.arr);
    }

    private Class noParams[] = {};

    @Override
    public int hashCode() {
        Integer result = 17;
        for (Number element : arr){
            try {
                result = 31 * result + (Integer) getElementClass().getDeclaredMethod("hasCode()", noParams).invoke(element, null);
            } catch (Exception e) {
                throw new RuntimeException("method invokation failed", e);
            }
        }

        return result;
//        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (arr != null && arr.length != 0) {
            result.append(arr[0]);
        } else {
            System.out.println("Array has not been initialized or has zero length.");
        }
        for (int i = 1; i < arr.length; i++) {
            result.append(' ').append(arr[i]);
        }

        return result.toString();
    }
}
