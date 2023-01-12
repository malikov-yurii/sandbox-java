package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class T_8_4_PowerSet_Recursive2 {

    public static List<Set<Integer>> getAllSubsets(Set<Integer> nums) {
        return generateSubsets(new ArrayList<>(nums), 0);
    }

    private static List<Set<Integer>>  generateSubsets(List<Integer> nums, int index) {
        List<Set<Integer>> sets;
        if (index == nums.size()) {
            sets = new ArrayList<>();
            sets.add(new HashSet<>());
        } else {
            sets = generateSubsets(nums, index + 1);
            List<Set<Integer>> newSets = new ArrayList<>();
            for (Set<Integer> set : sets) {
                Set<Integer> newSet = new HashSet<>(set);
                newSet.add(nums.get(index));
                newSets.add(newSet);
            }
            sets.addAll(newSets);
        }
        return sets;
    }

}
