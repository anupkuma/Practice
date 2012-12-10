package com.shahi.dec;

public class SecondHighestNumber {
	public static void main(String[] args) {
		// find second highest number in an integer array
		int highest = 0;
		int SecndHighest = 0;
		int[] arr = { 1000, 1, 2, 3, 14, 5, 17, 10000, 24, 28, 7, 27, 100 };
		if (arr[1] > arr[0]) {
			highest = arr[1];
			SecndHighest = arr[0];
		} else {
			highest = arr[0];
			SecndHighest = arr[1];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > highest) {

				SecndHighest = highest;
				highest = arr[i];

			}
			if (highest > arr[i] && arr[i] > SecndHighest) {
				SecndHighest = arr[i];
			}
		}

		System.out.println("highest = " + highest + " and 2nd Highest is "
				+ SecndHighest);
	}
}
