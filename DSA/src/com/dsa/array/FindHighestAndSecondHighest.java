package com.dsa.array;

public class FindHighestAndSecondHighest {

	public static void main(String[] args) {
		int arr[] = {3,5,3,9,0,2,6};
		
		int max=arr[0];
		int secondMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]){
				secondMax =max;
				max=arr[i];
			}
			if(secondMax<arr[i] && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secondMax);

	}

}
