package com.shahi.dec;

// code to partition a list around value x such that all nodes less than X come before x and
// all nodes greater than x come after x.

public class PartitionAList {
	public Node listPartitioning(Node head, int x) {
		Node beforeX = null;
		Node afterX = null;

		// partition a list around value x.
		while (head != null) {
			Node node1 = head.next;

			// insert node into start of beforeX list
			if (head.value < x) {
				head.next = beforeX;
				beforeX = head;
			} else {

				// insert node into front of afterX list
				head.next = afterX;
				afterX = head;
			}

			head = node1;
		}

		// merge before list and afterX list.
		if (beforeX == null) {
			return afterX;
		}

		head = beforeX;

		// find the end of beforeX list and merge it to afterX list.
		while (beforeX != null) {
			beforeX = beforeX.next;
		}

		beforeX.next = afterX;

		return head;
	}
}
