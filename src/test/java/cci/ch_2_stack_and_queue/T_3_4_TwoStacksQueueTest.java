package cci.ch_2_stack_and_queue;

import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

class T_3_4_TwoStacksQueueTest {

    @Test
    void offer() {
        Queue<Integer> queue = new T_3_4_TwoStacksQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        assertThat(queue.poll()).isEqualTo(1);
        assertThat(queue.poll()).isEqualTo(2);
        queue.offer(4);
        queue.offer(5);
        assertThat(queue.poll()).isEqualTo(3);
        assertThat(queue.poll()).isEqualTo(4);
        assertThat(queue.poll()).isEqualTo(5);

    }
}