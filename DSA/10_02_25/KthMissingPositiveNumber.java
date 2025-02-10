// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
// Return the kth positive integer that is missing from this array.



class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0, num = 1, index = 0;
        while (count < k) {
            if (index < arr.length && arr[index] == num) {
                index++;
            } else {
                count++;
                if (count == k) return num;
            }
            num++;
        }
        return -1;
    }
}