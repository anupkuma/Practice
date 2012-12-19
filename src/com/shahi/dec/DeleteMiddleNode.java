package com.shahi.dec;
// Implement an algorithm to delete a node in the middle of a singly Linked list, given only access to that node.

public class DeleteMiddleNode {
	public void deleteNode(Node n) {
		if(n==null|| n.next==null){
			System.out.println("Failure");
			System.exit(0);
		}
		Node next = n.next;
		n.value = next.value;
		n.next = next.next;
		System.out.println("Success");
	}
}
