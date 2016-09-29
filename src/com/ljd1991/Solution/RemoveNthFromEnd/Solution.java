package com.ljd1991.Solution.RemoveNthFromEnd;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode buildList(int[] arr) {
		if (arr.length == 0) {
			return null;
		}
		ListNode head = new ListNode(arr[0]);
		ListNode section = head;
		ListNode tail;
		for (int i = 1; i < arr.length; i++) {
			tail = new ListNode(arr[i]);
			section.next = tail;
			section = section.next;
		}
		return head;
	}

	public void printList(ListNode head) {
		if (head == null) {
			System.out.print("");
			return;
		}
		while (head.next != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.print(head.val);
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode tail = head;
		ListNode section = head;
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		for (int i = 1; i <= n; i++) {
			tail = tail.next;
			if ((tail.next == null) && (i == (n - 1))) {
				head = head.next;
				return head;
			}
		}
		while (tail.next != null) {
			section = section.next;
			tail = tail.next;
		}
		section.next = section.next.next;
		return head;
	}
}
