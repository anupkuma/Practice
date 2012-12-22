package com.shahi.dec;

public class ChkLoopInList {

	public boolean isLoopInList(Node n) {
		Node slow = n;
		Node fast = n;

		while (fast != null && fast.next != null) {
			if (slow == fast) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;

	}
}
