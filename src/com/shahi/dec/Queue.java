package com.shahi.dec;

public class Queue {
	Node first;
	Node last;
	
	public void enqueue(int num){
		if(first!=null){
			Node node = new Node(num);
			last.next=node;
			node=last;
		}
		else{
			last= new Node(num);
			first=last;
		}
	}
	
	public Object dequeue(){
		if(first!=null){
			int val = first.value;
			first = first.next;
			return val;
		}
		
		return null;
		
	}

}
