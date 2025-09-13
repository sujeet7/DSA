package com.dsa.array;

public class PlaceAllZeroLeftSide {

	public static void main(String[] args) {
		int arr []= {0,1,0,3,12};
		
		int right=0;
		int left=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[left]=arr[i];
				left--;
			}else {
				arr[right]=arr[i];
				right++;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}

	}

}
