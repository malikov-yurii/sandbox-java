package cci.ch_1_strings_and_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class T_1_9_StringRotationTest {

    @Test
    void isRotation() {
        assertThat(T_1_9_StringRotation.isRotation("waterbottle", "erbottlewat")).isTrue();
        assertThat(T_1_9_StringRotation.isRotation("waterbottle", "erbottletwa")).isFalse();
    }
}