package com.dsa.array;

import java.util.HashMap;

public class TwoSum {
	
	   public static int[] TwoSum(int[] nums, int target) { 
		   HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		   
		   for(int i=0;i<nums.length;i++) {
			   int d = target-nums[i];
			   if(!hm.containsKey(d)) {
				   hm.put(nums[i], i);
			   }else {
				   System.out.println(i+","+hm.get(d));
				   return new int[] {i,hm.get(d).intValue()};
				   
				   
			   }
		   }
		   return nums;
	   }

	public static void main(String[] args) {
		int arr[] = {3,3};
		System.out.println(TwoSum.TwoSum(arr, 6));

	}

}
