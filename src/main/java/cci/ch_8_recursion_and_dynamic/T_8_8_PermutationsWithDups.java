package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class T_8_8_PermutationsWithDups { /* TODO Impl this 8_7 with Set to avoid many String creation? */

    public static List<String> getPermutations(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char ch : str.toCharArray()) {
            incrementCount(charCounts, ch);
        }
        return getPermutations(charCounts);
    }

    private static List<String> getPermutations(Map<Character, Integer> charCounts) {
        List<String> perms = new ArrayList<>();
        if (charCounts.isEmpty()) {
            perms.add("");
        } else {
            for (Character ch : new HashSet<>(charCounts.keySet())) {
                decrementCount(charCounts, ch);
                for (String perm : getPermutations(charCounts)) {
                    perms.add(ch + perm);
                }
                incrementCount(charCounts, ch);
            }
        }
        return perms;
    }

    private static void incrementCount(Map<Character, Integer> charCounts, char ch) {
        Integer count = charCounts.getOrDefault(ch, 0);
        count++;
        charCounts.put(ch, count);
    }

    private static void decrementCount(Map<Character, Integer> charCounts, char ch) {
        Integer count = charCounts.getOrDefault(ch, 0);
        count--;
        if (count == 0) {
            charCounts.remove(ch);
        } else {
            charCounts.put(ch, count);
        }
    }

}
