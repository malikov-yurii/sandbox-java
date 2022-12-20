package cci.ch_2_stack_and_queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class T_3_4_TwoStacksQueue<T> implements Queue<T> {

    private final Stack<T> tail = new Stack<>();
    private final Stack<T> head = new Stack<>();

    @Override
    public boolean offer(T value) {
        transfer(head, tail);
        tail.push(value);
        return true;
    }

    private void transfer(Stack<T> fromStack, Stack<T> toStack) {
        while (!fromStack.isEmpty()) {
            toStack.push(fromStack.pop());
        }
    }

    @Override
    public T poll() {
        transfer(tail, head);
        return head.pop();
    }

    @Override
    public T peek() {
        transfer(tail, head);
        return head.peek();
    }



    @Override
    public boolean add(T value) {
        return offer(value);
    }

    @Override
    public T remove() {
        return poll();
    }

    @Override
    public T element() {
        return peek();
    }

    @Override
    public int size() {
        return tail.isEmpty() ? head.size() : tail.size();
    }

    @Override
    public boolean isEmpty() {
        return tail.isEmpty() && head.isEmpty();
    }

    @Override
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <K> K[] toArray(K[] arr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

}
