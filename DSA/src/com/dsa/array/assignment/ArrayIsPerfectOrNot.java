package com.dsa.array.assignment;

public class ArrayIsPerfectOrNot {

	public static void main(String[] args) {
		int arr[] =   {1, 2, 3, 4,5,4,3,2,1};
		int count = arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]==arr[count]) {
				count--;
			}
		}
		System.out.println(count==arr.length/2);
	}

}
