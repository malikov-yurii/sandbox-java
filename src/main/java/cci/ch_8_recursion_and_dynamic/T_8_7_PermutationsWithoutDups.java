package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T_8_7_PermutationsWithoutDups { /*TODO: 14.01.2023 Impl other solution from book*/

    public static List<String> getPermutations(String str) {
        if (str.length() == 1) { /* base case */
            return Collections.singletonList(str);
        }
        List<String> permutations = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (String subPerm : getPermutations(removeChar(str, i))) { /* n-1 case */
                permutations.add(str.charAt(i) + subPerm); /* n case */
            }
        }
        return permutations;
    }

    private static String removeChar(String str, int i) {
        return str.substring(0, i) + str.substring(i + 1);
    }

}
