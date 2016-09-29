package com.ljd1991.Solution.AddBinary;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String addBinary(String a, String b) {
		char[] chars1 = a.length() > b.length() ? a.toCharArray() : b
				.toCharArray();
		char[] chars2 = a.length() > b.length() ? b.toCharArray() : a
				.toCharArray();
		List<Character> result = new ArrayList<>();
		int carry = 0;
		int len = chars2.length;
		for (int i = 0; i < len; i++) {
			int temp = getNum(chars1[chars1.length - 1 - i])
					+ getNum(chars2[chars2.length - 1 - i]) + carry;
			result.add(temp % 2 == 1 ? '1' : '0');
			carry = temp / 2;
		}

		for (int i = 0; i < chars1.length - chars2.length; i++) {
			int temp = getNum(chars1[chars1.length - chars2.length - i - 1])
					+ carry;
			result.add(temp % 2 == 1 ? '1' : '0');
			carry = temp / 2;
		}
		if (carry == 1)
			result.add('1');
		StringBuilder builder = new StringBuilder();
		for (int i = result.size() - 1; i >= 0; i--) {
			builder.append(result.get(i));
		}
		return builder.toString();
	}

	private int getNum(char c) {
		return c == '1' ? 1 : 0;
	}
}
