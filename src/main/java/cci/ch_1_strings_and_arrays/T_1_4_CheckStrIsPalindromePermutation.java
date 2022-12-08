package cci.ch_1_strings_and_arrays;

/*1.4 */
public class T_1_4_CheckStrIsPalindromePermutation {

    //    Runtime: O(n)•
    //    Memory: O(1)
    public static boolean isPalindromePermutation(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        int[] charCounts = new int[26];
        for (char aChar : chars) {
            if ('a' <= aChar && aChar <= 'z') {
                int charInd = aChar - 'a';
                charCounts[charInd]++;
            }
        }
        int oddCount = 0;
        for (int charCount : charCounts) {
            if (charCount > 0 && (charCount % 2 != 0)) {
                oddCount++;
            }
        }
        return oddCount == 0 || oddCount == 1;
    }

}
