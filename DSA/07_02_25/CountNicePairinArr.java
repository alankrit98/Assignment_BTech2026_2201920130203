// You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the non-negative integer x. For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it satisfies all of the following conditions:
// 0 <= i < j < nums.length
// nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
// Return the number of nice pairs of indices. Since that number can be too large, return it modulo 109 + 7.




import java.util.*;
class Solution {
    public int countNicePairs(int[] nums) {
        int mod = 1000000007;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int revNum = reverse(num);
            int diff = num - revNum;
            count = (count + map.getOrDefault(diff, 0)) % mod;
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }
        return count;
    }
    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}