package cci.ch_1_strings_and_arrays;

/* */
public class T_1_5_OneCharEditDiffInTwoStrings {

    //    Runtime: O(n)
    //    Memory: O(1)
    public static boolean check(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int pointer1 = 0;
        int pointer2 = 0;
        int diffCount = 0;

        while (pointer1 < chars1.length && pointer2 < chars2.length && diffCount < 2) {
            if ((chars1[pointer1] != chars2[pointer2])) {
                if (pointer1 + 1 < chars1.length && chars1[pointer1 + 1] == chars2[pointer2]) {
                    pointer1++;
                } else if (pointer2 + 1 < chars2.length && chars1[pointer1] == chars2[pointer2 + 1]) {
                    pointer2++;
                }
                diffCount++;
            }
            pointer1++;
            pointer2++;
        }

        diffCount += chars1.length - pointer1 - 1;
        diffCount += chars2.length - pointer2 - 1;
        return diffCount < 2;
    }
}