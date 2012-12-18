package com.shahi.dec;

// remove duplicates from linked list without using additional buffer
public class DeleteDuplicates {
	public void deleteDups(Node head) {
		Node current = head;
		while (current != null) {
			Node n = current;
			while (n.next != null) {
				if (n.next.value == current.value) {
					n.next = n.next.next;
				} else {
					n = n.next;
				}
			}
		}
	}
}
