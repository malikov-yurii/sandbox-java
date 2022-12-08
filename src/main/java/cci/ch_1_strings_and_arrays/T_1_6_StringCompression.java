package cci.ch_1_strings_and_arrays;

/* */
public class T_1_6_StringCompression {

    //    Runtime: O(n)
    //    Memory: O(n)
    public static String compress(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0, count = 1; i < str.length(); i++) {
            if (i == str.length() - 1 || chars[i] != chars[i + 1]) {
                sb.append(chars[i]).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        String compressed = sb.toString();
        return compressed.length() < str.length() ? compressed : str;
    }

}