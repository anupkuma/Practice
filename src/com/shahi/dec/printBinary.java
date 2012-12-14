package com.shahi.dec;

public class printBinary {
	public static void main(String[] args) {
		double num= 0.50;
		
		if(num>=1 || num<=0){
			System.out.println("error");
			System.exit(0);
		}
		
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		while (num>0) {
			if(binary.length()>=32){
				System.out.println("error");
				System.exit(0);
			}
			double r = num * 2;
			if(r>=1){
				binary.append(1);
				num = r-1;
			}
			else {
				binary.append(0);
				num=r;
			}
			
		}
		System.out.println("binary representation = " + binary);
		
		
	}
}
