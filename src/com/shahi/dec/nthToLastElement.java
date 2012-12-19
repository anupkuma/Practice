package com.shahi.dec;

public class nthToLastElement {
	public void nthToLstElement(Node head, int n) {
		
		// checking if value of n is less than 0
		if (n < 0) {
			System.out.println("False");
			System.exit(0);
		}
		
		//creating two references for head of list.
		Node first = head;
		Node last = head;

		//now incrementing the second reference by value of n. so that second reference will
		//now point to (n-1)th element.
		for (int i = 0; i < n - 1; i++) {
			if (last == null) {
				System.exit(0);
			}
			last = last.next;

		}
		
		//Now incrementing first and second reference by one node.
		while (last.next != null) {
			first = first.next;
			last = last.next;
		}

		while (first.next != null) {
			System.out.println(first.value);
			first = first.next;
		}
	}
}
