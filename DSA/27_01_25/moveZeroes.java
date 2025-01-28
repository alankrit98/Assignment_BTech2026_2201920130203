/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array. */

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                temp[index++] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}