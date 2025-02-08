// Given a binary string s and an integer k, return true if every binary code of length k is a substring of s. Otherwise, return false.




import java.util.*;
class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int count = 1 << k;
        for(int i=0; i<=s.length()-k; i++) {
            set.add(s.substring(i, i+k));
            if(set.size() == count) {
                return true;
            }
        }
        return false;
    }
}