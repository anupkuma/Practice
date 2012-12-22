package com.shahi.dec;

// Here we adding elements to stack till we reach the middle of list.
// Then we remove elements from stack one by one and compare that to 
// slow.next
import java.util.Stack;

public class Check4Palindrome {
	public boolean isPalindrome(Node n) {

		Stack<Integer> st = new Stack<Integer>();
		Node slow = n;
		Node fast = n;

		while (fast != null && fast.next != null) {
			st.add(slow.value);
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast != null) {
			slow = slow.next;
		}

		while (slow != null) {
			int top = st.pop().intValue();
			if (top != slow.value) {
				return false;
			}
			slow = slow.next;
		}
		return true;

	}
}
