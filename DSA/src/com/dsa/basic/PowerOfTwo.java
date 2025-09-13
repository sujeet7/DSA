package com.dsa.basic;

public class PowerOfTwo {


	public static boolean isPowerOfTwo(int n) {
		 if(n<=0)
			 return false;
		 if(n>1) {
			 while(n!=1) {
				 int rem = n%2;
				 n = n/2;
				 if(rem==1) 
					 return false;
			 }
			 
		 }
		 return true;
	}
	public static void main(String[] args) {
		
		boolean result = PowerOfTwo.isPowerOfTwo(1);
		System.out.println(result);
	}

}
