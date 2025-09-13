package com.dsa.basic;

//An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

//Given an integer n, return true if n is an ugly number.
public class UglyNumber {

	public static boolean isUglyNumber(int n) {
		while(n%2==0) {
			n = n/2;	
		}
		while(n%3==0) {
			n=n/3;
		}
		while(n%5==0) {
			n=n/5;
		}
		
		return n==1;
	}
	public static void main(String[] args) {
		System.out.println(UglyNumber.isUglyNumber(7));

	}

}
