package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public boolean validPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            }
            return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
        }

        return true;
    }

    private boolean isPalindrome(String s, int st, int ed) {
        while (st <= ed) {
            if (s.charAt(st) != s.charAt(ed))
                return false;
            st++;
            ed--;
        }
        return true;
    }
}