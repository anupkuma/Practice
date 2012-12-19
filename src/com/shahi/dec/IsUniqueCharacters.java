package com.shahi.dec;

// Algorithm to determine if string has all unique characters.
// We can also do it by comparing each character to every other
// character but that will take O(n2) time.
// Also we can sort string and compare every character to adjacent
//  character to determine if String contains unique chars.
public class IsUniqueCharacters {
	static boolean[] charAt = new boolean[256];

	public static void main(String[] args) {
		String str = "chopper";

		if (str.length() > 256) {
			System.out.println("Not Unique");
			System.exit(0);
		}
		boolean ans = isUniqChars(str);
		System.out.println(ans);

	}

	public static boolean isUniqChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (charAt[val]) {
				System.out.println("Not Unique");
				System.exit(0);
			}
			charAt[val] = true;
		}
		return true;
	}
}
