// Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.



class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            boolean smaller = false, greater = false;
            for(int j=0; j<nums.length; j++) {
                if(nums[j]<nums[i]) {
                    smaller = true;
                }
                if(nums[j]>nums[i]) {
                    greater = true;
                }
            }
            if(smaller && greater) {
                count++;
            }
        }
        return count;
    }
}