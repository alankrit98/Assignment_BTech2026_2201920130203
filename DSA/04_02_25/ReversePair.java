// Given an integer array nums, return the number of reverse pairs in the array.
// A reverse pair is a pair (i, j) where:
// 0 <= i < j < nums.length and
// nums[i] > 2 * nums[j].




class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;
        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);
        count += merge(nums, left, mid, right);
        return count;
    }
    private int merge(int[] nums, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - mid - 1);
        }
        int[] temp = new int[right - left + 1];
        int k = 0, i = left, l = mid + 1;
        while (i <= mid && l <= right) {
            if (nums[i] <= nums[l]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[l++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (l <= right) {
            temp[k++] = nums[l++];
        }
        System.arraycopy(temp, 0, nums, left, temp.length);
        return count;
    }
}