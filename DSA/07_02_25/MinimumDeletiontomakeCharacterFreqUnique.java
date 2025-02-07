// A string s is called good if there are no two different characters in s that have the same frequency.
// Given a string s, return the minimum number of characters you need to delete to make s good.
// The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.





import java.util.*;
class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Set<Integer> seen = new HashSet<>();
        int deletions = 0;
        for(int freq: map.values()) {
            while(freq > 0 && seen.contains(freq)) {
                freq--;
                deletions++;
            }
            if(freq > 0) {
                seen.add(freq);
            }
        }
        return deletions;
    }
}