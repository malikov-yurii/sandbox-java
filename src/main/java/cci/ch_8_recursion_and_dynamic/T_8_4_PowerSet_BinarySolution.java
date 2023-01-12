package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static java.util.Collections.singleton;
import static java.util.stream.Collectors.toList;

public class T_8_4_PowerSet_BinarySolution {

    public static List<Set<Integer>> getAllSubsets(List<Integer> nums) {
        List<Set<Integer>> sets = new ArrayList<>();
        for (int i = 1; i < 1 << nums.size(); i++) {
            Set<Integer> newSet = new HashSet<>();
            sets.add(newSet);
            for (int j = 0, n = i; n > 0; j++, n >>= 1) {
                if ((n & 1) == 1) {
                    newSet.add(nums.get(j));
                }
            }
        }
        return sets;
    }

}
