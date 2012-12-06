package com.shahi.dec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicates {
	public static void main(String[] args) {
		// In an array 1-100 many numbers are duplicates, how do you find it?
		
		int arr[] = {1, 2, 4, 5, 3, 3, 1};		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(hm.containsKey(arr[i])){
				count = count + hm.get(arr[i]);
				hm.put(arr[i], count);
			}
			else {
				count = 1;
				hm.put(arr[i], count);
			}
			
		}
		
		Iterator itr = hm.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, Integer> map = (Map.Entry)itr.next();
			if(map.getValue()>1){
				System.out.print(map.getKey());
				System.out.println(" is duplicate. ");
			}
		}
		
	}
}
