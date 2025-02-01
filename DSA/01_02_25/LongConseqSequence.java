// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.



import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int longStreak = 1, currStreak = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                continue;
            }
            if(nums[i] == nums[i-1] + 1) {
                currStreak++;
            } else {
                longStreak = Math.max(longStreak, currStreak);
                currStreak = 1;
            }
        }
        return Math.max(longStreak, currStreak);
    }
}