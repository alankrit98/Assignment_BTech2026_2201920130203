// Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.



import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        String sortedP = sortString(p);
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String currentSubstring = s.substring(i, i + p.length());
            if (sortString(currentSubstring).equals(sortedP)) {
                result.add(i);
            }
        }
        return result;
    }
    private String sortString(String str) {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }
}