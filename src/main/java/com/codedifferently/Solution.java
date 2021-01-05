package com.codedifferently;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution {

    /**
     * String Scramble
     * Have the function StringScramble(str1,str2) take both parameters being passed and return the boolean true if
     * a portion of str1 characters can be rearranged to match str2, otherwise return the string false.
     * For example: if str1 is "rkqodlw" and str2 is "world" the output should return true.
     * Punctuation and symbols will not be entered with the parameters.
     * @param str1
     * @param str2
     * @return
     */

    public Boolean stringScramble(String str1, String str2) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c)) return false;
            int occurences = map.get(c);
            if (occurences <= 0) return false;
            map.put(c, --occurences);
        }
        return true;
    }
//    public Boolean stringScramble(String str1, String str2) {
//
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : str1.toCharArray()) {
//            if (!map.containsKey(c)) {
//                map.put(c, 1);
//            } else {
//                int occurences = map.get(c);
//                map.put(c, ++occurences);
//            }
//
//        }
//
//        for (char c : str2.toCharArray()) {
//            if (!map.containsKey(c)) return false;
//            int occurences = map.get(c);
//            if (occurences <= 0) return false;
//            map.put(c, --occurences);
//        }
//        return true;
//    }
}










































