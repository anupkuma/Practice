package com.shahi.dec;

public class Stack {
	Node top;

	public void push(int n) {
		Node st = new Node(n);
		st.next = top;
		top = st;

	}

	public Object pop() {
		if (top != null) {
			int num = top.value;
			top = top.next;
			return num;
		}
		return null;

	}

	public int peek() {
		return top.value;
	}

}
