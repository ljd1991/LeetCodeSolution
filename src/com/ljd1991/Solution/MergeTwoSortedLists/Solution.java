package com.ljd1991.Solution.MergeTwoSortedLists;

import com.ljd1991.Object.ListNode;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// if ((l1 == null) || (l2 == null)) {
		// if (l1 != null)
		// return l1;
		// if (l2 != null)
		// return l2;
		// return null;
		// }
		ListNode head = new ListNode(14138);
		ListNode section = head;
		while ((l1 != null) && (l2 != null)) {
			if (l1.value < l2.value) {
				section.next = l1;
				l1 = l1.next;
			} else {
				section.next = l2;
				l2 = l2.next;
			}
			section = section.next;
		}
		if (l1 != null)
			section.next = l1;
		else
			section.next = l2;
		return head.next;
	}
}
