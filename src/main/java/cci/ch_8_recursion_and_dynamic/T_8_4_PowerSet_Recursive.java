package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static java.util.Collections.singleton;
import static java.util.stream.Collectors.toList;

public class T_8_4_PowerSet_Recursive {

    public static List<Set<Integer>> getAllSubsets(Set<Integer> set) {
        List<Set<Integer>> sets = new ArrayList<>();
        generateSubsets(set.iterator(), sets);
        return sets;
    }

    private static void generateSubsets(Iterator<Integer> iterator, List<Set<Integer>> sets) {
        if (iterator.hasNext()) {
            Integer val = iterator.next();
            generateSubsets(iterator, sets);
            sets.addAll(sets.stream().map(HashSet::new).peek(set -> set.add(val)).collect(toList()));
            sets.add(singleton(val));
        }
    }

}
