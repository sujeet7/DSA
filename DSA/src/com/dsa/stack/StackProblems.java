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
	static int []  getPrevSmall(int arr[]) {
		Stack<Integer> st = new Stack<>();
		int ans[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(st.size()>0 && st.peek()>=arr[i]) {
				st.pop();
			}
			if(st.size()==0) {
				ans[i]=-1;
			}else {
				ans[i]=st.peek();
			}
			st.push(arr[i]);
		}
		for (int i = 0; i < ans.length; i++) {
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
	
	
	 public static void asteroidCollision(int[] asteroids) {
			Stack<Integer> stack = new Stack<>();
			for (int a : asteroids) {
				boolean destroyed = false;
				// Collision condition
				while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
					if (stack.peek() < -a) {
						// top asteroid is smaller → destroy it
						stack.pop();
						continue;
					} else if (stack.peek() == -a) {
						// both same size → both destroyed
						stack.pop();
					}
					// current asteroid destroyed
					destroyed = true;
					break;
				}
				if (!destroyed) {
					stack.push(a);
				}
			}

			System.out.println(stack);
		}
	 
	public static void main(String[] args) {
		//int arr[] = {4,3,1,8,10,0};
		//StackProblems.getPrevSmall(arr);
		int arr1[] = {6,8,0,1,3};
		//StackProblems.getNextGreaterElement(arr1);
		//int [] arr2 = {5,10,-10};
		//int [] arr3 = {5,10,-15};
		//int [] arr4 = {5,10,-10};
		//StackProblems.asteroidCollision(arr2);
	
		
	}

}
