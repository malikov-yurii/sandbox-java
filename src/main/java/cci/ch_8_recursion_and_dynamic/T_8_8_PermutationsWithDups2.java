package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class T_8_8_PermutationsWithDups2 {

    public static List<String> getPermutations(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char ch : str.toCharArray()) {
            Integer count = charCounts.getOrDefault(ch, 0);
            charCounts.put(ch, ++count);
        }
        List<String> perms = new ArrayList<>();
        getPerms(charCounts, "", str.length(), perms);
        return perms;
    }

    private static void getPerms(Map<Character, Integer> charCounts, String prefix, int remaining, List<String> perms) {
        if (remaining == 0) {
            perms.add(prefix);
        } else {
            --remaining;
            for (Character ch : charCounts.keySet()) {
                Integer count = charCounts.get(ch);
                if (count > 0) {
                    charCounts.put(ch, count - 1);
                    getPerms(charCounts, prefix + ch, remaining, perms);
                    charCounts.put(ch, count);
                }
            }
        }
    }

}
