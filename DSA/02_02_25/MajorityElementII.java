// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(set.contains(nums[i])) {
                continue;
            }
            int count = 0;
            for(int j=0; j<n; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }
            if(count > n/3) {
                result.add(nums[i]);
                set.add(nums[i]);
            }
        }
        return result;
    }
}