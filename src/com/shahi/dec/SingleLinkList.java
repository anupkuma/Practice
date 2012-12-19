// Remove duplicates from linked list without using additional buffer.
package com.shahi.dec;

public class SingleLinkList {
	public static void main(String[] args) {

		Node one = new Node(1);
		
		one.setNextNode(4);
		one.setNextNode(8);
		one.setNextNode(12);
		one.setNextNode(2);
		one.setNextNode(7);
		
		one.deleteNode(12 , one);

	}
}
