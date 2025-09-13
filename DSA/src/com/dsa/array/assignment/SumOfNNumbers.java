package com.dsa.array.assignment;

public class SumOfNNumbers {
	public static int sumOfNNumbers(int n) {
		int sum = n*(n+1)/2;
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println(SumOfNNumbers.sumOfNNumbers(4));
	}

}
