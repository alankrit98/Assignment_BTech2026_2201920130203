/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n. */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[] = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while(i < m) {
            result[k++] = nums1[i++];
        }
        while(j < n) {
            result[k++] = nums2[j++];
        }
        for(int l = 0; l< m+n; l++) {
            nums1[l] = result[l];
        }
    }
}