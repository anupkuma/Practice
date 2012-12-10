package com.shahi.dec;

public class NumberIsAPowerOf2 {
	public static void main(String[] args) {
	//	code to check whether a no is power of two or not?
		int num = 64;
		double power = 1;
		int total = 0;
		
		while (true) {
			total  =(int) Math.pow(2, power);
			if(total<num ){
				power = power +1;
			}
			else if (total>num){
				System.out.println(num + " is not a power of 2");
				break;
			}
			else{
				System.out.println(num + " is power of 2");
				break;
			}
		}
			
				
	}
}
