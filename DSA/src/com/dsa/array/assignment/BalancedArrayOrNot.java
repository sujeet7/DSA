package com.dsa.array.assignment;

public class BalancedArrayOrNot {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 2, 1, 3 };
		int leftSum = 0;
		int rightSum = 0;
		int count = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			leftSum = leftSum + arr[i];
			rightSum = rightSum + arr[count];
			count--;
		}

		if (leftSum > rightSum) {
			System.out.println(leftSum - rightSum);
		} else {
			System.out.println(rightSum - leftSum);
		}
	}

}
