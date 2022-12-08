package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class T_1_6_StringCompressionTest {

    @Test
    void compress() {
        assertThat(T_1_6_StringCompression.compress("aabcccccaaa")).isEqualTo("a2b1c5a3");
        assertThat(T_1_6_StringCompression.compress("a")).isEqualTo("a");
    }
}