package com.shahi.dec;

import java.util.ArrayList;

public class DecimalToBinary {
	public static void main(String[] args) {
		int num = 100;
		ArrayList<Integer> binary = new ArrayList<Integer>();
		while (num>=1) {
			if(num%2==0){
				binary.add(0);
				num = num/2;
				System.out.println("num is " + num);
			}
			else{
				binary.add(1);
				num= num/2;
				System.out.println("num is " + num);
			}
		}
		
		for (int i = 0; i < binary.size(); i++) {
			System.out.println(binary.get(i));
		}
	}
}
