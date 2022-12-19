package cci.ch_2_stack_and_queue;

import java.util.EmptyStackException;

public class MyStack<T> {

    private StackNode<T> top;

    private static class StackNode<T> {
        T data;
        StackNode<T> next;
        public StackNode(T data, StackNode<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public void push(T value) {
        top = new StackNode<>(value, top);
    }

    public T pop() {
        checkNotEmpty();
        T val = top.data;
        top = top.next;
        return val;
    }

    public T peek() {
        checkNotEmpty();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    private void checkNotEmpty() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
    }

}
