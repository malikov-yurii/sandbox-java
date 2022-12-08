package cci.ch_1_strings_and_arrays;

/*1.3 Replace Spaces in str With %20 */
public class T_1_3_URLfy_ReplaceSpacesWith_20 {

    //    Runtime: O(n)       n + n
    //    Memory: O(1)
    public static void replace(char[] chars, int strLen) {
        int spaceCount = 0;
        for (int i = 0; i < strLen; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }
        int pointer = strLen + 2 * spaceCount - 1;
        for (int i = strLen - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                chars[pointer--] = chars[i];
            } else {
                chars[pointer--] = '0';
                chars[pointer--] = '2';
                chars[pointer--] = '%';
            }
        }
    }

}
