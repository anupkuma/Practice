package com.shahi.dec;

public class BitSwapRequired {
	public static void main(String[] args) {
		
		// determine the number of bits required to convert integer A to integer B
		int n1 = 31;
		int n2 = 14;
		int count = 0;
		
		int num = n1 ^ n2;
		
		while (num>0) {
			count = count + (num & 1);
			num = num>>1;
		}
		
		System.out.println("Number of bits required to convert integer n1 to integer n2 = " + count);
	}
}
