package cci.ch_10_sorting_and_searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class T_10_2_GroupAnagrams {

    public static void group(String[] strings) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strings) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            List<String> group = groups.computeIfAbsent(new String(chars), k -> new LinkedList<>());
            group.add(str);
        }
        int i = 0;
        for (List<String> group : groups.values()) {
            for (String str : group) {
                strings[i++] = str;
            }
        }
    }

}
