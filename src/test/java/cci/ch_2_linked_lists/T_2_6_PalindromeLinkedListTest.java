package cci.ch_2_linked_lists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_2_6_PalindromeLinkedListTest {

    @Test
    void checkRecursive1() {
        Node<Character> node = new Node<>('1', new Node<>('2', new Node<>('3', new Node<>('2', new Node<>('1', null)))));
        assertThat(T_2_6_PalindromeLinkedList.checkRecursive(node))
                .isTrue();
    }

    @Test
    void checkRecursive2() {
        Node<Character> node = new Node<>('1', new Node<>('2', new Node<>('2', new Node<>('1', null))));
        assertThat(T_2_6_PalindromeLinkedList.checkRecursive(node))
                .isTrue();
    }

    @Test
    void checkRecursive3() {
        Node<Character> node = new Node<>(' ', new Node<>('d', new Node<>(' ', new Node<>('c', new Node<>(' ', new Node<>(' ',
                new Node<>('c', new Node<>('d', null))))))));
        assertThat(T_2_6_PalindromeLinkedList.checkRecursive(node))
                .isTrue();
    }

    @Test
    void checkRecursive4() {
        assertThat(T_2_6_PalindromeLinkedList.checkRecursive(new Node<>('d', new Node<>('c', new Node<>('b',
                new Node<>('c', new Node<>('d', new Node<>(' ', null))))))))
                .isTrue();
    }

    @Test
    void checkRecursive5() {
        assertThat(T_2_6_PalindromeLinkedList.checkRecursive(new Node<>('d', new Node<>('c', new Node<>('b', new Node<>('a', new Node<>(' ',
                new Node<>('b', new Node<>('c', new Node<>('d', null))))))))))
                .isTrue();
    }

    @Test
    void checkRecursive6() {
        assertThat(T_2_6_PalindromeLinkedList.checkRecursive(new Node<>('a', new Node<>('c', new Node<>(
                'c', new Node<>('d', null))))))
                .isFalse();
    }

    @Test
    void checkRecursive7() {
        assertThat(T_2_6_PalindromeLinkedList.checkRecursive(new Node<>('d', new Node<>('a', new Node<>('b',
                new Node<>('c', new Node<>('d', null)))))))
                .isFalse();
    }

    @Test
    void checkRecursive8() {
        assertThat(T_2_6_PalindromeLinkedList.checkRecursive(new Node<>('d', new Node<>('c', new Node<>('b',
                new Node<>('a', new Node<>('b', new Node<>('a', new Node<>('d', null)))))))))
                .isFalse();
    }


    @Test
    void check1() {
        Node<Character> node = new Node<>(' ', new Node<>('d', new Node<>(' ', new Node<>('c', new Node<>(' ', new Node<>(' ',
                                                    new Node<>('c', new Node<>('d', null))))))));
        assertThat(T_2_6_PalindromeLinkedList.check(node))
                .isTrue();
    }

    @Test
    void check2() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('d', new Node<>('c', new Node<>('b',
                                                    new Node<>('c', new Node<>('d', new Node<>(' ', null))))))))
                .isTrue();
    }

    @Test
    void check3() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('d', new Node<>('c', new Node<>('b', new Node<>('a', new Node<>(' ',
                                                    new Node<>('b', new Node<>('c', new Node<>('d', null))))))))))
                .isTrue();
    }

    @Test
    void check4() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('a', new Node<>('c', new Node<>(
                                                               'c', new Node<>('d', null))))))
                .isFalse();
    }

    @Test
    void check5() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('d', new Node<>('a', new Node<>('b',
                                                    new Node<>('c', new Node<>('d', null)))))))
                .isFalse();
    }

    @Test
    void check6() {
        assertThat(T_2_6_PalindromeLinkedList.check(new Node<>('d', new Node<>('c', new Node<>('b',
                               new Node<>('a', new Node<>('b', new Node<>('a', new Node<>('d', null)))))))))
                .isFalse();
    }
}