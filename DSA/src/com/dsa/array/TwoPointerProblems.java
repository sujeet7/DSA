package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointerProblems {

	 static void  removeDuplicate(int[] arr) {
		 int point1=0;
		 int point2=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[point1]==arr[point2]) {
				point2++;
				continue;
			}
				arr[point1+1]=arr[point2];
				point2++;
				point1++;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	 }
	 public static List<List<Integer>> tripletSum(int[] arr, int target) {
		 Arrays.sort(arr);
		 List<List<Integer>> ans = new ArrayList<>();
		 for(int i=0;i<arr.length-2;i++) {
			 
			 if(i>0 && arr[i]==arr[i-1]) {
				 continue;
			 }
			 int low=i+1;
			 int high =arr.length-1;
			 while(low<high) {
				 int sum = arr[i]+arr[low]+arr[high];
				 if(sum==target) {
					 ans.add(Arrays.asList(arr[i], arr[low], arr[high]));
					 
					 while(low<high && arr[low]==arr[low+1]) {
						 low++;
					 }
					 while(low<high && arr[high]==arr[high-1]) {
						 high--;
					 }
					 low++;
					 high--;
				 }
				 else if(sum<target) {
					low++;
				 }else {
					 high--;
				 }
			 }
		 }
		 System.out.println(ans);
		return ans;
		  
		}
	 public static int threeSumClosest(int[] nums, int target) {
		 Arrays.sort(nums);
		 int result = Integer.MAX_VALUE;
		 int minDiff = Integer.MAX_VALUE;
		 for(int i=0;i<nums.length;i++) {
			 int low = i+1;
			 int high=nums.length-1;
			 while(low<high) {
				 int sum = nums[i]+nums[low]+nums[high];
				 int diff = Math.abs(sum-target);
				 if(diff<minDiff) {
					 minDiff = diff;
					 result = sum;
				 }
				 else if(sum < target) {
					 low++;
				 }else {
					 high--;
				 }
			 }
		 }
		 System.out.println(result);
		return result;
	        
	    }
	 public static int countPairs(int arr[], int target) {
		 Arrays.sort(arr);
		 int low =0;
		 int high = arr.length-1;
		 List<List<Integer>> ans = new ArrayList<List<Integer>>();
		 while(low<high) {
			 int sum = arr[low]+arr[high];
			 if(sum==target) {
				 ans.add(Arrays.asList(arr[low],arr[high]));
				 low++;
				 high--;
			 }
			 else if(sum<target) {
				 low++;
			 }else {
				 high--;
			 }
		 }
		 System.out.println(ans);
		return ans.size();
		 
	 }
	 public static void sortColors(int[] nums) {
		 int low=0;
		 int mid=0;
		 int high=nums.length-1;
		 while(mid<=high) {
			 if(nums[mid]==0) {
				 int temp = nums[mid];
				 nums[mid]= nums[low];
				 nums[low]=temp;
				 low++;
				 mid++;
			 }
			 else if (nums[mid]==1) {
				 mid++;
			 }else{
				 int temp = nums[mid];
		            nums[mid] = nums[high];
		            nums[high] = temp;
		            
		            high--;
			 }
		 }
		 for(int i=0;i<nums.length;i++) {
			 System.out.println(nums[i]);
		 }
	        
	    }

	public static void main(String[] args) {
		
		int arr [] = {1,2};
		int arr1 [] = {0,0,1,1,1,2,2,3,3,4};
		int arr2[] = {-1, 0, 1, 2, -1, -4};
		int arr3[] = {10,20,30,40,50,60,70,80,90};
		int arr4[] = {2, 4, 3, 5, 6, -1, 8};
		int arr5[] = {2,0,2,1,1,0,0,0};
		TwoPointerProblems.sortColors(arr5);
		//TwoPointerProblems.countPairs(arr4, 7);
		//TwoPointerProblems.threeSumClosest(arr3, 1);
		//TwoPointerProblems.tripletSum(arr2, 0);
		//TwoPointerProblems.removeDuplicate(arr1);
		//System.out.println(TwoPointerProblems.maxProfit(arr));
	}

}
