package cci.ch_3_stack_and_queue;

import java.util.Stack;

public class T_3_5_SortStackUsingAdditionalStack {

    public static <T extends Comparable<T>> void sort(Stack<T> stack) {
        Stack<T> tmpStack = new Stack<>();
        while (!stack.isEmpty()) {
            T element = stack.pop();
            if (tmpStack.isEmpty() || element.compareTo(tmpStack.peek()) >= 0) {
                tmpStack.push(element);
            } else {
                int count = 0;
                do {
                    count++;
                    stack.push(tmpStack.pop());
                } while (!tmpStack.isEmpty() && element.compareTo(tmpStack.peek()) < 0);
                tmpStack.push(element);
                while (count-- != 0) {
                    tmpStack.push(stack.pop());
                }
            }
        }
        while (!tmpStack.isEmpty()) {
            stack.push(tmpStack.pop());
        }
    }

}
