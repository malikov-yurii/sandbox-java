package cci.ch_2_stack_and_queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_3_1_MinStackTest {

    @Test
    void min() {
        T_3_1_MinStack<Integer> minStack = new T_3_1_MinStack<>();
        minStack.push(1);
        assertThat(minStack.min()).isEqualTo(1);

        minStack.push(2);
        assertThat(minStack.min()).isEqualTo(1);

        minStack.push(2);
        assertThat(minStack.min()).isEqualTo(1);

        minStack.push(0);
        assertThat(minStack.min()).isEqualTo(0);

        minStack.push(3);
        assertThat(minStack.min()).isEqualTo(0);

        minStack.push(-1);
        assertThat(minStack.min()).isEqualTo(-1);

        assertThat(minStack.pop()).isEqualTo(-1);
        assertThat(minStack.min()).isEqualTo(0);

        assertThat(minStack.pop()).isEqualTo(3);
        assertThat(minStack.min()).isEqualTo(0);

        assertThat(minStack.pop()).isEqualTo(0);
        assertThat(minStack.min()).isEqualTo(1);

        assertThat(minStack.pop()).isEqualTo(2);
        assertThat(minStack.min()).isEqualTo(1);
    }
}