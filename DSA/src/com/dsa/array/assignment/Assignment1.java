package com.dsa.array.assignment;

import java.util.Arrays;

public class Assignment1 {
	
	public boolean isArrayPerfect(int arr[]){
		int count = arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]==arr[count]) {
				count--;
			}
		}
		return count==arr.length/2;
	}

	public int findValueToBalanceArray(int arr[]){
		
		int leftSum = 0;
		int rightSum = 0;
		int count = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			leftSum = leftSum + arr[i];
			rightSum = rightSum + arr[count];
			count--;
		}
		if (leftSum > rightSum) {
			return leftSum - rightSum;
		}else {
			return rightSum - leftSum;
		}
		
	}
	public int countEachValueLestThanEqaualToTarget(int arr[],int target) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=target) {
				count++;
			}
		}
		return count;
	}
	public int findLastElementOfTheArrayBasedOnPatternMaxMinRemoval(int arr[]) {
		Arrays.sort(arr);
		//2,3,4,5,7,8,9
		//1,2,3,4,5,7,8,9
		
		if ((arr.length) % 2 == 0) {
			return arr[(arr.length / 2) - 1];
		} else {
			return arr[arr.length / 2];
		}
	}
	public int [] skipTwoGreatestElement(int arr[]) {
		Arrays.sort(arr);
		int newArr [] = new int[arr.length-2];
		for(int i=0;i<arr.length-2;i++) {
			newArr[i] =arr[i];
		}
		return newArr;
		
	}
	public static int sumOfNNumbers(int n) {
		int sum = n*(n+1)/2;
		return sum;
	}
	public static int sumOfArrays(int arr[]) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	public static int printValueAtGivenIndex(int arr[],int index) {
		
		return arr[index];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
