// remove duplicates from linked list using additional buffer.


package com.shahi.dec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(12);
		l1.add(2);
		l1.add(23);
		l1.add(19);
		l1.add(15);
		l1.add(12);
		l1.add(19);
		Iterator iterator;
		 HashSet <Integer>hs = new HashSet <Integer>();
		 for (int i = 0; i < l1.size(); i++) {
			 if(hs.contains(l1.get(i))){
				 continue;
			 }
			hs.add(l1.get(i));
		}
		 
		 iterator = hs.iterator();
		 while (iterator.hasNext()){
			  System.out.print(iterator.next() + " ");  
			  }
	}
}
