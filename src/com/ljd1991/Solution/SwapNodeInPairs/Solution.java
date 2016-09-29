package com.ljd1991.Solution.SwapNodeInPairs;

import com.ljd1991.Object.ListNode;

public class Solution {
	// [h1, h2][1,2,3,4,5]
	public ListNode swapPairs(ListNode head) {
		ListNode h1 = new ListNode(14138);
		ListNode h2 = new ListNode(930331);
		ListNode temp;
		ListNode h = h2;
		h1.next = h2;
		h2.next = head;
		while (h1.next.next != null && h2.next.next != null) {
			h1 = h1.next.next;
			h2.next = h2.next.next;
			h2 = h2.next;
			h1.next = h2.next;
			h2.next = h1;
			temp = h1;
			h1 = h2;
			h2 = temp;
		}
		return h.next;
	}
}
