package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T_8_4_PowerSet {

    public static List<Set<Integer>> getAllSubsets(Set<Integer> set) {
        List<Set<Integer>> subSets = new ArrayList<>();
        for (Integer val : set) {
            subSets.addAll(getAllSubsets(val, subSets));
        }
        return subSets;
    }

    private static Collection<? extends Set<Integer>> getAllSubsets(Integer val, List<Set<Integer>> sets) {
        List<Set<Integer>> newSets = new ArrayList<>();
        Set<Integer> newSet = new HashSet<>();
        newSet.add(val);
        newSets.add(newSet);
        for (Set<Integer> set: sets) {
            newSet = new HashSet<>(set);
            newSet.add(val);
            newSets.add(newSet);
        }
        return newSets;
    }

}
