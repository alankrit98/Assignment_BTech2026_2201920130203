/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k. */

import java.util.ArrayList;
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        for (int num : nums) {
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
            }
        }
        for (int i = 0; i < uniqueElements.size(); i++) {
            nums[i] = uniqueElements.get(i);
        }
        return uniqueElements.size();
    }
}