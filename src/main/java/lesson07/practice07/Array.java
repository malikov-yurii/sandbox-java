package lesson07.practice07;

import java.util.Iterator;

/**
 * @author Yurii Malikov
 */
public class Array<T extends Number> implements Iterable<T>{

    private Number[] arr;


    private Array(int size) {
        arr = new Number[size];
    }

    private Array(T[] arr) {
        this.arr = arr;
    }


    public static <T extends Number> Array<T> of(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Size of Array object should be greater than -1");
        return new Array<T>(size);
    }

    public static <T extends Number> Array<T> of(T[] arr) {
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
        ensureHasElements();
        return arr.length;
    }


    public Class getGenericClass() {
        ensureHasElements();
        return arr[0].getClass();
    }

    private void ensureHasElements() {
        if (arr == null || arr.length == 0) {
            throw new NullPointerException("Array has not been initialized by data yet.");
        }
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

        if (arr != null && size() != 0) {
            result.append("Array<").append(getGenericClass().getSimpleName()).append(">{").append(arr[0]);
        } else {
            System.out.println("Array has not been initialized or has zero length.");
        }

        for (int i = 1; i < size(); i++) {
            result.append(", ").append(arr[i]);
        }

        return result.append('}').toString();
    }
}
