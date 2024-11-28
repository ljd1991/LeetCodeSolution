package com.ljd1991.Solution.ValidParentheses;

public class Solution {
	public boolean isValid(String s) {
		char[] stack = new char[10000];
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
			case '[':
			case '{':
				stack[index] = s.charAt(i);
				index++;
				break;
			case ')':
				if (index == 0) {
					return false;
				}
				if (stack[index - 1] != '(') {
					return false;
				}
				index--;
				break;
			case ']':
				if (index == 0) {
					return false;
				}
				if (stack[index - 1] != '[') {
					return false;
				}
				index--;
				break;
			case '}':
				if (index == 0) {
					return false;
				}
				if (stack[index - 1] != '{') {
					return false;
				}
				index--;
				break;

			default:
				return false;
			}
		}
		if (index != 0) {
			return false;
		}
		return true;
	}
}
