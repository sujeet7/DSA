package com.dsa.array.assignment;

import java.util.Arrays;

public class RemoveElementMaxMinExceptOne {
	
	public static int findLastOfTheArray(int arr[]) {
		
		Arrays.sort(arr);
		//2,3,4,5,7,8,9
		//1,2,3,4,5,7,8,9
		
		if ((arr.length) % 2 == 0) {
			return arr[(arr.length / 2) - 1];
		} else {
			return arr[arr.length / 2];
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] =  {7, 8, 3, 4, 2, 9, 5};
		//int arr[] = {8, 1, 2, 9, 4, 3, 7, 5};
		System.out.println(RemoveElementMaxMinExceptOne.findLastOfTheArray(arr));
	}

}
