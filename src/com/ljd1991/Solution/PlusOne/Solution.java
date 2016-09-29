package com.ljd1991.Solution.PlusOne;

public class Solution {
	public int[] plusOne(int[] digits) {
		int carry = 1;
		int index = digits.length - 1;
		while (carry == 1 && index >= 0) {
			digits[index] = digits[index] + carry;
			if (digits[index] >= 10) {
				digits[index] = 0;
			} else {
				carry = 0;
			}
			index--;
		}

		if (carry == 1) {
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			for (int i = 1; i < result.length; i++)
				result[i] = 0;
			return result;
		} else {
			return digits;
		}
	}
}
