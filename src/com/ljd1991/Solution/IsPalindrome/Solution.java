package com.ljd1991.Solution.IsPalindrome;

public class Solution {
	public boolean isPalindrome(int x) {
		long y = x;
		long result = 0;
		y = y * (x < 0 ? (-1) : 1);
		while ((y / 10) != 0) {
			result = result * 10 + (y % 10);
			y = y / 10;
		}
		result = result * 10 + y;
		result = result * (x < 0 ? (-1) : 1);
		return x == result;
	}
}
