//Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
//Return the number of nice sub-arrays.




class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0, count = 0;
        for (int l = 0, r = 0; r < nums.length; r++){
            if (nums[r] % 2 == 1){
                k--;
                count = 0;
            }
            while (k == 0){
                count++;
                k += (nums[l++] % 2);
            }
            res += count;
        }
        return res;
    }
}