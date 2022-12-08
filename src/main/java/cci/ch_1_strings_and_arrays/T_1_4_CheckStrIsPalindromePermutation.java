package cci.ch_1_strings_and_arrays;

/* */
public class T_1_4_CheckStrIsPalindromePermutation {

    //    Runtime: O(n)
    //    Memory: O(1)
    public static boolean isPalindromePermutation(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        boolean[] diffs = new boolean[26];
        for (char aChar : chars) {
            if ('a' <= aChar && aChar <= 'z') {
                int charInd = aChar - 'a';
                diffs[charInd] = !diffs[charInd];
            }
        }
        int diffCount = 0;
        for (boolean diff : diffs) {
            if (diff) {
                diffCount++;
            }
        }
        return diffCount < 2;
    }

}
