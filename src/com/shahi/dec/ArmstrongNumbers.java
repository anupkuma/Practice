package com.shahi.dec;

public class ArmstrongNumbers {
 public boolean isArmstrong(int number){
	 int num = number;
	  int sum=0;
	  while(num!=0){
		 num = number%10;
		 sum = sum + (num * num * num) ;
		 num = num / 10;
	  }
	  if(sum==number){
		  return true;
	  }
	  return false;
  }
}
