package com.ljd1991.Solution.LongestCommonPrefix;

public class Solution {
	public String longesCommonPrefix(String[] strs) {
		int longestPrefixLength = Integer.MAX_VALUE;
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}

		for (int i = 1; i < strs.length; i++) {
			longestPrefixLength = getLongestPrefixLength(strs[i - 1], strs[i],
					longestPrefixLength);
			if (longestPrefixLength == 0)
				return "";
		}
		return strs[0].substring(0, longestPrefixLength);
	}

	private int getLongestPrefixLength(String str1, String str2,
			int presentLongestLength) {
		int len = Math.min(presentLongestLength,
				Math.min(str1.length(), str2.length()));
		for (int i = 0; i < len; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return i;
			}
		}
		return len;
	}
}
