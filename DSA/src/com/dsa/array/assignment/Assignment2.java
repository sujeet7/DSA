package com.dsa.array.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment2 {
	public static int [] moveAllZero(int arr[]) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=i;j<arr.length-1;j++) {
				if(arr[j]==0 && arr[j+1]!=0) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

	public static int findMajorityElement(int arr[]) {
		int key = 0;
		int value = 0;
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]).intValue() + 1);
			} else {
				map.put(arr[i], 1);
			}

		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (key < entry.getValue()) {
				key = entry.getValue();
				value = entry.getKey();
			}

		}
		return value;

	}
	 public static int[] runningSum(int[] nums) {
		 int sum =0;
		 for(int i=0;i<nums.length;i++) {
			 sum = sum+nums[i];
			 nums[i]=sum;
		 }
		return nums;
	        
	    }
	 public static boolean threeConsecutiveOdds(int[] arr) {
			int oddCounter = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 != 0) {
					oddCounter++;
					if (oddCounter == 3)
						break;
				} else {
					oddCounter = 0;
				}
			}

			return oddCounter == 3;

		}
	 public static List<List<Integer>> minimumAbsDifference(int[] arr) {
		// Input: arr = [4,2,1,3]
		//		 Output: [[1,2],[2,3],[3,4]]
		 List mainList = new ArrayList();
		 int d=arr[0];
		 for(int i=0;i<arr.length-1;i++) {
			
			 for(int j=i;j<arr.length-1;j++) {
				
				 if(arr[j]<arr[j+1]) {
					 d = arr[j+1]-arr[j];
				 }else {
					 d= arr[j]-arr[j+1];
				 }
				
					 
				 
			 }
			 System.out.println(d);
			 
		 }
		 
		return null;
	        
	    }
	public static void main(String[] args) {
		/*
		  int arr1[] = { 0, 1, 0, 3, 12 };
		  
		  int[] newArr = Assignment2.moveAllZero(arr1); for (int i = 0; i <
		  newArr.length; i++) { System.out.println(newArr[i]); }
		
		int arr2[] = {3,3,4};
		int majority = Assignment2.findMajorityElement(arr2);
		System.out.println(majority);
		 
		int [] arr3 = {1,2,3,4};
		Assignment2.runningSum(arr3);
		int [] arr4 = {1,2,34,3,4,5,7,23,12};
		System.out.println(Assignment2.threeConsecutiveOdds(arr4));
		*/
		int arr5 [] = {4,2,1,3};
		Assignment2.minimumAbsDifference(arr5);
	}

}
