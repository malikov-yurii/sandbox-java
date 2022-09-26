package cci.ch_1_strings_and_arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/*1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters.
What if you can not use additional data structures.*/
public class T1_HasStrOnlyUniqueChars {

    //    Runtime: O(n^2)        |  O(n*n) where n is str.length | n n n ... n
    //    Memory: O(1)
    public static boolean isAllCharsUniqueV1(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    //    Runtime: O(n^2)        |  O( n * (n + 1) / 2 )   |   n n-1 n-2 ... 3 2 1
    //    Memory: O(1)
    public static boolean isAllCharsUniqueV2(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    //    Runtime: O(n)        |  O( n * 1 ) | 1 1 1 ... 1 1
    //    Memory:  O(n)
    public static boolean isAllCharsUniqueV3(String str) {
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) {
                return false;
            }
        }
        return true;
    }

}
