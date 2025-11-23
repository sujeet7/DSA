package com.dsa.stack;

import java.util.Stack;

public class StackProblems {

	public static int[] getPreviousSmallElement(int arr[]) {
		Stack<Integer> st = new Stack<Integer>();
		int[] ans = new int[arr.length];
		for (int i = 0; i <arr.length; i++) {
			while (st.size() > 0 && st.peek() >= arr[i]) {
				st.pop();
			}
			if (st.size() == 0)
				ans[i] = -1;
			else {
				ans[i] = st.peek();
			}
			st.push(arr[i]);
		}
		for (int i = 0; i <ans.length; i++) {
			System.out.println(ans[i]);
		}
		return ans;

	}
	public static int[] getNextGreaterElement(int arr[]) {
		Stack<Integer> st = new Stack<Integer>();
		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (st.size() > 0 && st.peek() <= arr[i]) {
				st.pop();
			}
			if (st.size() == 0)
				ans[i] = -1;
			else {
				ans[i] = st.peek();
			}
			st.push(arr[i]);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		return ans;

	}
	
	public static void main(String[] args) {
		int arr[] = {4,3,1,8,10,0};
		StackProblems.getPreviousSmallElement(arr);
		int arr1[] = {6,8,0,1,3};
		//StackProblems.getNextGreaterElement(arr1);
	}

}
