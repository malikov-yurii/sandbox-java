package cci.ch_2_stack_and_queue;

import java.util.EmptyStackException;

public class T_3_2_StackWithMin<T extends Comparable<T>> {

    private MinStackNode top;

    private class MinStackNode {
        final T data;
        final T min;
        final MinStackNode next;

        public MinStackNode(T data, MinStackNode next) {
            this.data = data;
            this.next = next;
            this.min = next != null && next.min.compareTo(data) < 0 ? next.min : data;
        }
    }

    public void push(T data) {
        top = new MinStackNode(data, top);
    }

    public T pop() {
        checkNotEmpty();
        T val = top.data;
        top = top.next;
        return val;
    }

    private void checkNotEmpty() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
    }

    public T min() {
        checkNotEmpty();
        return top.min;
    }

    public boolean isEmpty() {
        return top == null;
    }

}
