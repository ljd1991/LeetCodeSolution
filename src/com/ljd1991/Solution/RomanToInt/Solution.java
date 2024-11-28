package com.ljd1991.Solution.RomanToInt;

public class Solution {
	public int RomanToInt(String s) {
		char[] chars = s.toCharArray();
		int result = 0;
		result += getRomanNumber(chars[0]);
		for (int i = 1; i < chars.length; i++) {
			if ((getRomanNumber(chars[i])) > (getRomanNumber(chars[i - 1]))) {
				result = result - getRomanNumber(chars[i - 1]) * 2
						+ getRomanNumber(chars[i]);
			} else {
				result += getRomanNumber(chars[i]);
			}
		}
		return result;
	}

	public int getRomanNumber(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}
