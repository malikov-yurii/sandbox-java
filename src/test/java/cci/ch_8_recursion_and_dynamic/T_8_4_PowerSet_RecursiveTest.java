package cci.ch_8_recursion_and_dynamic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class T_8_4_PowerSet_RecursiveTest {

    @Test
    void getAllSubsets() {
        List<Set<Integer>> subsets = T_8_4_PowerSet_Recursive.getAllSubsets(new HashSet<>(Arrays.asList(1, 2, 3, 4)));
        subsets.forEach(System.out::println);
        assertThat(subsets.size()).isEqualTo(15);
        assertThat(subsets).contains(
                new HashSet<>(Arrays.asList(1)),
                new HashSet<>(Arrays.asList(2)),
                new HashSet<>(Arrays.asList(1, 2)),
                new HashSet<>(Arrays.asList(3)),
                new HashSet<>(Arrays.asList(1, 3)),
                new HashSet<>(Arrays.asList(2, 3)),
                new HashSet<>(Arrays.asList(1, 2, 3)),
                new HashSet<>(Arrays.asList(4)),
                new HashSet<>(Arrays.asList(1, 4)),
                new HashSet<>(Arrays.asList(2, 4)),
                new HashSet<>(Arrays.asList(1, 2, 4)),
                new HashSet<>(Arrays.asList(3, 4)),
                new HashSet<>(Arrays.asList(1, 3, 4)),
                new HashSet<>(Arrays.asList(2, 3, 4)),
                new HashSet<>(Arrays.asList(1, 2, 3, 4))
        );

    }

}