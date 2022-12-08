package cci.ch_1_strings_and_arrays;

public class T_1_9_StringRotation {

    //    Runtime : O(n)
    //    Memory  : O(n)
    public static boolean isRotation(String s1, String s2) {
        return (s1 + s1).contains(s2);
    }

}