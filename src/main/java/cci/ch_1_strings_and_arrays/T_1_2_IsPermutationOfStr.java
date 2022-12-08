package cci.ch_1_strings_and_arrays;

import java.util.HashMap;
import java.util.Map;

/*1.2 Is one str a permutation of another */
public class T_1_2_IsPermutationOfStr {

    //    Runtime: O(n)        |  n + n where n is str.length | n n n ... n
    //    Memory: O(n)
    public static boolean isPermutationV1(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCounts = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            Integer count = charCounts.getOrDefault(ch, 0);
            charCounts.put(ch, count + 1);
        }

        for (char ch : str2.toCharArray()) {
            Integer count = charCounts.getOrDefault(ch, 0);
            count--;
            if (count < 0) {
                return false;
            }
            charCounts.put(ch, count);
        }
        return true;
    }

}
