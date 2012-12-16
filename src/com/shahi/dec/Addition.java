package com.shahi.dec;

public class Addition {
	public static void main(String[] args) {
		int a = 6;
		int b = 7;

		int total = add(a, b);

		System.out.println(total);

	}

	public static int add(int x, int y) {
		int num = 0;
		if (y == 0) {
			return x;
		}

		num = x ^ y;
		y = ((x & y) << 1);
		return add(num, y);

	}
}
