package cci.ch_3_stack_and_queue;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

class T_3_5_SortStackUsingAdditionalStackTest {

    @Test
    void sort() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(22);
        stack.push(55);
        stack.push(44);

        T_3_5_SortStackUsingAdditionalStack.sort(stack);

        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.pop()).isEqualTo(3);
        assertThat(stack.pop()).isEqualTo(4);
        assertThat(stack.pop()).isEqualTo(22);
        assertThat(stack.pop()).isEqualTo(44);
        assertThat(stack.pop()).isEqualTo(55);
    }
}