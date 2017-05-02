package lesson07.practice07;

import java.util.Iterator;
import java.util.Objects;

/**
 * @author Yurii Malikov
 */
public class Array<T> implements Iterable<T>{

    private Object[] arr;

    private Class<T> componentType;


    private Array(int size, Class<T> componentType) {
        arr = new Object[size];
        this.componentType = componentType;
    }

    @SuppressWarnings("unchecked")
    private Array(T[] arr) {
        this.arr = arr;
        componentType = (Class<T>) arr.getClass().getComponentType();
    }


    public static <T> Array<T> createEmptyArraySize(int size, Class<T> componentType) {
        if (size < 0)
            throw new IllegalArgumentException("Size of Array object should be not less than 0");
        return new Array<>(size, componentType);
    }

    @SafeVarargs
    public static <T> Array<T> of(T... arr) {
        return new Array<T>(arr);
    }


    @SuppressWarnings("unchecked")
    public T get(int index) {
        rangeCheck(index);
        return (T) arr[index];
    }

    public void set(int index, T newValue) {
        rangeCheck(index);
        arr[index] = newValue;
    }

    public int size() {
        Objects.requireNonNull(arr, "Array has not been initialized");
        return arr.length;
    }

    public Class getComponentType() {
        return componentType;
    }

    private void rangeCheck(int index) {
        if (index >= size() || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Array length: " + size());
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < size();
            }

            @Override
            public T next() {
                return get(cursor++);
            }

        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Array<?> array = (Array<?>) o;

        if (array.size() != size()) return false;

        boolean result = true;
        for (int i = 0; i < size(); i++) {
            result &= arr[i].equals(array.get(i));
        }

        return result;
    }

    @Override
    public int hashCode() {
        if (arr == null)
            return 0;

        int hashCode = super.hashCode();

        for (T element : this)
            hashCode = 31 * hashCode + (element == null ? 0 : element.hashCode());

        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (arr != null && arr.length != 0) {
            result.append("Array<")
                    .append(getComponentType().getSimpleName())
                    .append(">{")
                    .append(arr[0] == null ? "NULL" : arr[0]);
        } else {
            return "Empty array";
        }

        for (int i = 1; i < size(); i++) {
            result.append(", ").append(arr[i] == null ? "NULL" : arr[i]);
        }

        return result.append('}').toString();
    }
}
