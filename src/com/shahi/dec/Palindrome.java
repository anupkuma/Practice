package com.shahi.dec;

public class Palindrome {
	public static String str  = "madam";
	public static void main(String[] args) {
		
		boolean ans = isPalindrome();
		if(ans==true){
			System.out.println("is palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
		
	}
	public static boolean isPalindrome(){
		int low =0;
		int high = str.length()-1 ;
		
		while(low<high){
			if(str.charAt(low)!=str.charAt(high)){
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
	
}
