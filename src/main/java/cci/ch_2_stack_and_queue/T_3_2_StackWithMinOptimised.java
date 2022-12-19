package cci.ch_2_stack_and_queue;

import java.util.Stack;

public class T_3_2_StackWithMinOptimised<T extends Comparable<T>> extends Stack<T> {

    private final Stack<T> mins = new Stack<>();

    @Override
    public T push(T data) {
        if (mins.isEmpty() || data.compareTo(mins.peek()) <= 0) {
            mins.push(data);
        }
        return super.push(data);
    }

    public T pop() {
        T top = super.pop();
        if (top.compareTo(mins.peek()) == 0) {
            mins.pop();
        }
        return top;
    }

    public T min() {
        return mins.peek();
    }

}
