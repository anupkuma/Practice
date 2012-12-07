package com.shahi.dec;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 0, 1 };
		int num = 0;
		for (int i = arr.length - 1, j = 0; i >= 0 && j < arr.length; i--, j++) {
			num = (int) (num + arr[i] * Math.pow(2, j));
		}

		System.out.println("num = " + num);
	}
}
