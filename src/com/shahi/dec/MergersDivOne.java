package com.shahi.dec;

import java.util.Arrays;

public class MergersDivOne {
	public static void main(String[] args) {
		float [] revenues = {10, -17};
		Arrays.sort(revenues);
		float avg =0;
		
		for (int i = 0; i < revenues.length; i++) {
			System.out.println(revenues[i]);
		}
		
		for (int i = 0; i < revenues.length; i++) {
			if (i == 0) {
				
				avg = (revenues[i] + revenues[i + 1]) / 2;
				System.out.println(" first avg " + avg);
				i = i + 1;
			} else {
				
				avg = (revenues[i] + avg) / 2;
			}

		}
		
		System.out.println(avg);
	}
}
