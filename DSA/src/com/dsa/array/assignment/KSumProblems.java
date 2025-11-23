package com.dsa.array.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KSumProblems {

	 public static List<List<Integer>> threeSum(int[] nums) {
		 	int target = 0;
	        Arrays.sort(nums);
	        Set<List<Integer>> set = new HashSet<>();
	        List<List<Integer>> output = new ArrayList<>();
	        for (int i = 0; i < nums.length; i++){
	            int left = i + 1;
	            int rifht = nums.length - 1;
	            while (left < rifht) {
	                int sum = nums[i] + nums[left] + nums[rifht];
	                if (sum == target) {
	                	set.add(Arrays.asList(nums[i], nums[left], nums[rifht]));
	                	left++;
	                	rifht--;
	                } else if (sum < target) {
	                	left++;
	                } else {
	                	rifht--;
	                }
	            }
	        }
	        output.addAll(set);
	        return output;
	    }
	public static void main(String[] args) {
		
		int nums[] = {-1,0,1,2,-1,-4};
		KSumProblems.threeSum(nums);
	}

}
