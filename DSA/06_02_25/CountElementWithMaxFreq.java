// You are given an array nums consisting of positive integers.
// Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
// The frequency of an element is the number of occurrences of that element in the array.




import java.util.HashMap;
import java.util.Map;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int freq = 0;
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            freq = Math.max(freq, map.get(num));
        }
        int count = 0;
        for(int frq: map.values()) {
            if(frq == freq) {
                count += frq;
            }
        }
        return count;
    }
}