package cci.ch_2_linked_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_2_6_PalindromeLinkedListTest {

    @Test
    void check1() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>(' ', new Node<>('4', new Node<>(' ', new Node<>('3',
                                                    new Node<>(' ', new Node<>(' ', new Node<>('3', new Node<>('4', null))))))))))
                .isTrue();
    }

    @Test
    void check2() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('4', new Node<>('3', new Node<>('2',
                                                    new Node<>('3', new Node<>('4', new Node<>(' ', null))))))))
                .isTrue();
    }

    @Test
    void check3() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('4', new Node<>('3', new Node<>('2', new Node<>('1', new Node<>(' ',
                                                    new Node<>('2', new Node<>('3', new Node<>('4', null))))))))))
                .isTrue();
    }

    @Test
    void check4() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('1', new Node<>('3', new Node<>(
                                                               '3', new Node<>('4', null))))))
                .isFalse();
    }

    @Test
    void check5() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('4', new Node<>('1', new Node<>('2',
                                                    new Node<>('3', new Node<>('4', null)))))))
                .isFalse();
    }

    @Test
    void check6() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('4', new Node<>('3', new Node<>('2',
                               new Node<>('1', new Node<>('2', new Node<>('1', new Node<>('4', null)))))))))
                .isFalse();
    }
}