package com.shahi.dec;

public class LinkedList {
	Node first;
	Node last;

	public LinkedList() {
		first = null;

	}

	public void insert(int n) {
		Node link = new Node(n);
		if (first == null) {
			link.next = null;
			first = link;
			last = link;

		}
		else {
			last.next = link;
			link.next = null;
			last = link;
		}
	}

}
