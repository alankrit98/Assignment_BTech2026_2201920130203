// Given a binary array nums, you should delete one element from it.
// Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.




class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0, count = 0, length = 0;
        while(right < nums.length)  {
            if(nums[right] == 0) {
                count++;
            }
            while(count > 1) {
                if(nums[left] == 0) {
                    count--;
                }
                left++;
            }
            length = Math.max(length, right-left);
            right++;
        }
        return length;
    }
}