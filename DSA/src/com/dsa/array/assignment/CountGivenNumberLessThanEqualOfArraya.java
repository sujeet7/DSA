package com.dsa.array.assignment;

public class CountGivenNumberLessThanEqualOfArraya {
	
	public static int count(int arr[],int target) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=target) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		
		//int arr[] =   {1, 2, 4, 5, 8, 10};
		int arr[] = {1, 2, 2, 2, 5, 7, 9};
		System.out.println(CountGivenNumberLessThanEqualOfArraya.count(arr,2));
	}

}
