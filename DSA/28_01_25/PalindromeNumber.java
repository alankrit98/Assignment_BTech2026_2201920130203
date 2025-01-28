/*Given an integer x, return true if x is a palindrome, and false otherwise. */

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}