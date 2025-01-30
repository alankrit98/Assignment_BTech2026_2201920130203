// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return n;
    }
}