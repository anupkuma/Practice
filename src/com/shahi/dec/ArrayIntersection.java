package com.shahi.dec;

import java.util.HashMap;

public class ArrayIntersection {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,5,5,6,6,7,6,7,1};
		int [] arr2 = {1,2,3,5,5,11};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count =0;
		
		for (int i = 0; i < arr1.length; i++) {
			
			if(hm.containsKey(arr1[i])){
				//System.out.println("in if");
				count = 1 + hm.get(arr1[i]);
				hm.put(arr1[i],count );
				//System.out.println(arr1[i] + " & " + count );
			}
			else {
				//System.out.println("in else");
				count = 1;
				hm.put(arr1[i], count);
				//System.out.println(arr1[i] + " & " + count );
			}
			
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-");
	for (int i = 0; i < arr2.length; i++) {
			if(hm.containsKey(arr2[i])){
				System.out.println("yes it contains " + arr2[i] + " & no. of times. is "+ hm.get(arr2[i]) +". " );
			}
			else {
				System.out.println("No it lacks " + arr2[i] + "." );
			}
		}
		
		
	}
}
