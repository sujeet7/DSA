package com.dsa.stack;

import java.util.Stack;

public class NextProblem {
	 public static int[] nearestGreateToRight(int arr[]) {
		 Stack<Integer> stack = new Stack<Integer>();
		 int [] res = new int[arr.length];
		 
		 for(int i=arr.length-1;i>=0;i--) {
			 while(!stack.isEmpty() && stack.peek()<=arr[i]) {
				 stack.pop();
			 }
			 res[i]= stack.isEmpty()? -1:stack.peek();
			 stack.push(arr[i]);
			 
		 }
		 for(int i=0;i<res.length;i++) {
			 System.out.println(res[i]);
		 }
		 return res;
			
		}
	 public static int[] nearestGreateToLeft(int arr[]) {
		 Stack<Integer> stack = new Stack<Integer>();
		 int [] res = new int[arr.length];
		 
		 for(int i=0;i<arr.length;i++) {
			 while(!stack.isEmpty() && stack.peek()<=arr[i]) {
				 stack.pop();
			 }
			 res[i]= stack.isEmpty()? -1:stack.peek();
			 stack.push(arr[i]);
			 
		 }
		 for(int i=0;i<res.length;i++) {
			 System.out.println(res[i]);
		 }
		 return res;
			
		}
	 public static int[] nearestSmallerToRight(int arr[]) {
		 Stack<Integer> stack = new Stack<Integer>();
		 int [] res = new int[arr.length];
		 
		 for(int i=arr.length-1;i>=0;i--) {
			 while(!stack.isEmpty() && stack.peek()>=arr[i]) {
				 stack.pop();
			 }
			 res[i]= stack.isEmpty()? -1:stack.peek();
			 stack.push(arr[i]);
			 
		 }
		 for(int i=0;i<res.length;i++) {
			 System.out.println(res[i]);
		 }
		 return res;
			
		}
	 public static int[] nearestSmallerToLeft(int arr[]) {
		 Stack<Integer> stack = new Stack<Integer>();
		 int [] res = new int[arr.length];
		 
		 for(int i=0;i<arr.length;i++) {
			 while(!stack.isEmpty() && stack.peek()>=arr[i]) {
				 stack.pop();
			 }
			 res[i]= stack.isEmpty()? -1:stack.peek();
			 stack.push(arr[i]);
			 
		 }
		 for(int i=0;i<res.length;i++) {
			 System.out.println(res[i]);
		 }
		 return res;
			
		}
	public static void main(String[] args) {
		int arr[] = {4, 5, 2, 10}; //output : [5, 10, 10, -1], for left Output: [-1, -1, 5, -1]
		NextProblem.nearestSmallerToLeft(arr);

	}

}
