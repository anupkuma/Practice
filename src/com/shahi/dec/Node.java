package com.shahi.dec;

public class Node {
	int value;
	Node next = null;

	public Node(int value) {
		this.value = value;
	}


	public void setNextNode(int d) {
		// TODO Auto-generated method stub
		Node end = new Node(d);
        Node n = this;
        while(n.next!=null){
        	n=n.next;
        }
        n.next=end;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public Node deleteNode(int i, Node one){
		Node head = one;
		if(head.value==i){
			return head.next;
		}
		while(head.next!=null){
			if(head.next.value==i){
				head.next=head.next.next;
				return head;
			}
			head=head.next;
		}
		return head;
	}
}
