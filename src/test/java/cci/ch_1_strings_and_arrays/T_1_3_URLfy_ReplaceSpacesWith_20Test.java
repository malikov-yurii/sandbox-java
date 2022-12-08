package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T_1_3_URLfy_ReplaceSpacesWith_20Test {

    @Test
    void replace() {
        char[] chars = new char[9];
        String str = "a bc ";
        System.arraycopy(str.toCharArray(), 0, chars, 0, str.length());
        T_1_3_URLfy_ReplaceSpacesWith_20.replace(chars, str.length());
        assertThat(chars).containsExactly('a', '%', '2', '0', 'b', 'c', '%', '2', '0');
    }
}