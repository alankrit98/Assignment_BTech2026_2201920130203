// Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
// answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
// answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
// Note that the integers in the lists may be returned in any order.




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int num: nums1) {
            if(!existsInArray(num, nums2) && !l1.contains(num)) {
                l1.add(num);
            }
        }
        for(int num: nums2) {
            if(!existsInArray(num, nums1) && !l2.contains(num)) {
                l2.add(num);
            }
        }
        return Arrays.asList(l1, l2);
    }
    private boolean existsInArray(int num, int[] arr) {
        for (int val : arr) {
            if (val == num) {
                return true;
            }
        }
        return false;
    }
}