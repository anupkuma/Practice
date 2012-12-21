package com.shahi.dec;

public class CheckForPalindromes {
	public static void main(String[] args) {
		String s1  =" cheap";
		String s2 = " peach";
		
		boolean ans  = chkForPalindrome(s1, s2);
		System.out.println(ans);
		
		
	}
	
	public static boolean chkForPalindrome(String one, String two){
		if(one.length()!=two.length()){
			return false;
		}
		return sort(one).equals(sort(two));
	}
	
	public static String sort (String first){
		char[] charArr = first.toCharArray();
		java.util.Arrays.sort(charArr);
		return new String (charArr);
	}
	
}
