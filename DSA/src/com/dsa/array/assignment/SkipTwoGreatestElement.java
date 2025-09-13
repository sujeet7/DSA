package com.dsa.array.assignment;

import java.util.Arrays;

public class SkipTwoGreatestElement {

	public static void main(String[] args) {
		int arr[] =    {2, 8, 7, 1, 5};
		int skip = 2;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-skip;i++) {
			System.out.println(arr[i]);
		}
	}

}
