// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.



import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i=n-1; i>=0; i--) {
            if(i==n-1 || nums[i] != nums[i+1]) {
                count++;
            }
            if(count == 3) {
                return nums[i];
            }
        }
        return nums[n-1];
    }
}