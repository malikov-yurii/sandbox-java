package cci.ch_10_sorting_and_searching;

import java.util.HashSet;
import java.util.Set;

public class T_10_8_FindDuplicates {

    public static int[] findDups(int[] arr) {
        Set<Integer> dups = new HashSet<>();
        BitSet bitSet = new BitSet(32000);
        for (int j : arr) {
            if (bitSet.get(j)) {
                dups.add(j);
            } else {
                bitSet.set(j);
            }
        }
        return dups.stream().mapToInt(Integer::intValue).toArray();
    }

}