package com.dsa.basic;

import java.util.HashSet;
import java.util.Set;

/*A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.*/

public class HappyNumber {

	public static boolean isHappyNumber(int n) {
		Set<Integer> hs = new HashSet<>();
		hs.add(n);
		while(n>0) {
			int sum =sumofDigit(n);
			if(sum==1) {
				return true;
			}else {
				if(hs.contains(sum)) {
					return false;
				}else {
					hs.add(sum);
				}
			}
			n=sum;
		}
		return false;
		
		
	}
	
	public static boolean isHappyNumbeWithoutHashSet(int n) {
		
		while(n>0) {
			int sum =sumofDigit(n);
			if(sum==1) {
				return true;
			}if(sum==4) {
				return false;
			}
			n=sum;
		}
		return false;
		
		
	}
	private static int sumofDigit(int n) {
		int sum=0;
		while(n>0) {
			int digit =n%10;
			n = n/10;
			sum=sum+digit*digit;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(HappyNumber.isHappyNumbeWithoutHashSet(3));
	}

}
