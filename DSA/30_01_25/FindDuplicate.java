/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.*/



import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            if(nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }
}