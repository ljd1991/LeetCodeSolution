package com.ljd1991.Solution.IntToRoman;

public class Solution {
	public String intToRoman(int num) {
		StringBuffer sb = new StringBuffer();
		int one = num % 10;
		int ten = (num % 100) / 10;
		int hundred = (num % 1000) / 100;
		int thousand = num / 1000;
		sb.append(getRomanNumber(thousand, 'M', 'A', 'A'))
				.append(getRomanNumber(hundred, 'C', 'D', 'M'))
				.append(getRomanNumber(ten, 'X', 'L', 'C'))
				.append(getRomanNumber(one, 'I', 'V', 'X'));
		return sb.toString();
	}

	private String getRomanNumber(int number, char one, char five, char ten) {
		StringBuffer sb = new StringBuffer();
		switch (number) {
		case 0:
			sb.append("");
			break;
		case 1:
			sb.append(one);
			break;
		case 2:
			sb.append(one).append(one);
			break;
		case 3:
			sb.append(one).append(one).append(one);
			break;
		case 4:
			sb.append(one).append(five);
			break;
		case 5:
			sb.append(five);
			break;
		case 6:
			sb.append(five).append(one);
			break;
		case 7:
			sb.append(five).append(one).append(one);
			break;
		case 8:
			sb.append(five).append(one).append(one).append(one);
			break;
		case 9:
			sb.append(one).append(ten);
			break;
		default:
			break;
		}
		return sb.toString();
	}
}
