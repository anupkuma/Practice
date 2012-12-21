package com.shahi.dec;

// Program to check if two string are palindrome's of each other.

public class CheckForPalindromes {
	public static void main(String[] args) {
		String s1 = " cheap";
		String s2 = " peach";

		boolean ans = chkForPalindrome(s1, s2);
		System.out.println(ans);

	}

	// first we check if string are of same length. Optimization
	public static boolean chkForPalindrome(String one, String two) {
		if (one.length() != two.length()) {
			return false;
		}
		return sort(one).equals(sort(two));
	}

	// here we sort two string and match if they are same or not.
	public static String sort(String first) {
		char[] charArr = first.toCharArray();
		java.util.Arrays.sort(charArr);
		return new String(charArr);
	}

}
