// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
// You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output




import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(s.contains(nums[i])) {
                l.add(nums[i]);
            } else {
                s.add(nums[i]);
            }
        }
        return l;
    }
}