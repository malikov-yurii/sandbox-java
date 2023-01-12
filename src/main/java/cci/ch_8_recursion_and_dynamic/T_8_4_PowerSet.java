package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class T_8_4_PowerSet {

    public static List<Set<Integer>> getAllSubsets(Set<Integer> nums) {
        List<Set<Integer>> subSets = new ArrayList<>();
        subSets.add(new HashSet<>());
        for (Integer n : nums) {
            List<HashSet<Integer>> newSets = subSets.stream().map(HashSet::new).peek(s -> s.add(n)).collect(toList());
            subSets.addAll(newSets);
        }
        return subSets;
    }

}
