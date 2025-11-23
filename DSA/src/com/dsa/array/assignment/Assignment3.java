package com.dsa.array.assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment3 {
public static List<List<Integer>> generate(int numRows) {
	List<List<Integer>> ans = new ArrayList<List<Integer>>();
	List<Integer> list = null;
	for(int i=0;i<=numRows;i++) {
		list = new ArrayList<Integer>();
		for(int j=0;j<=i;j++) {
			if(i==j || j==0) {
				list.add(1);
			}else {
				 int val = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
				 list.add(val);
			}
		}
		
		ans.add(list);
	}
	System.out.println(ans);
	
	return ans;
        
    }
public static List<Integer> getRow(int rowIndex) {
	List<List<Integer>> ans = new ArrayList<List<Integer>>();
	List<Integer> list = null;
	for(int i=0;i<=rowIndex;i++) {
		list = new ArrayList<Integer>();
		for(int j=0;j<=i;j++) {
			if(i==j || j==0) {
				list.add(1);
			}else {
				int value=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
				list.add(value);
			}
		}
		if(i==rowIndex) {
			return list;
		}
		ans.add(list);
	}
	return list;
    
}

public static int[] twoSum(int[] nums, int target) {
	
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i=0;i<nums.length;i++) {
		  int d = target-nums[i];
		if(!map.containsKey(d)) {
			map.put(nums[i],i);
		}else {
			System.out.println(i+","+map.get(d).intValue());
			return new int[] {i,map.get(d).intValue()};
		}
	}
	
	return null;
    
}
public static int[] twoSumSecond(int[] nums, int target) {
	int left =0;
	int right=nums.length;
	
	while(left<right) {
		int sum = nums[left]+nums[right];
		if(target==sum) {
			return new int[] {left+1,right+1};
		}
		if(target<sum) {
			right--;
		}else {
			left++;
		}
	}
	
	return nums;
	
    
}
public List<List<Integer>> threeSum(int[] nums) {
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

public static List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    Set<List<Integer>> set = new HashSet<>();
    List<List<Integer>> output = new ArrayList<>();
	for (int i = 0; i < nums.length - 2; i++) {
		for (int j = 1; j < nums.length - 1; j++) {
			int left = j + 1;
			int rifht = nums.length - 1;
			while (left < rifht) {
				int sum = nums[i] + nums[j] + nums[left] + nums[rifht];
				if (sum == target) {
					set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[rifht]));
					left++;
					rifht--;
				} else if (sum < target) {
					left++;
				} else {
					rifht--;
				}
			}
		}
	}
	output.addAll(set);
	return output;
    
}
public static int maxProfit(int[] prices) {
	//{7,1,5,3,6,4};
	int minPrice = Integer.MAX_VALUE;
	int maxProfit =Integer.MIN_VALUE;
	for(int i=0;i<prices.length;i++) {
		if(minPrice>prices[i]) {
			minPrice = prices[i];
		}
		
		maxProfit = Math.max(maxProfit,prices[i]-minPrice);
		
	}
	return maxProfit;
    
}

public static int maxProfit1(int[] prices) {
	//{7,1,5,3,6,4};
	 int profit = 0;
     for(int i=1;i<prices.length;i++) {
         if(prices[i] > prices[i-1]) {
             profit += prices[i] - prices[i-1];
         }
     }
     return profit;
    
}

public int majorityElement(int[] nums) {
	Integer majority =nums[0];
	int counter =0;
	for(int i=1;i<nums.length;i++) {
		if(majority==nums[i] ) {
			counter++;
		}else {
			counter--;
			if(counter==0) {
				counter++;
				majority=nums[i];
			}
		}
	}
	
	return majority;
    
}

public List<Integer> majorityElementList(int[] nums) {
	int n = nums.length;
    int count1 = 0, count2 = 0;
    Integer candidate1 = null, candidate2 = null;
    
   
    
    return null;
    
}

	public static void main(String[] args) {
		int arr[] = {2,7,11,15};
		int arr1[] = {-1,0,1,2,-1,-4};
		int arr2[]= {1,2,3,4,5};
		int nums[]= {1,0,-1,0,-2,2};
		//Assignment3.generate(3);
		//System.out.println(Assignment3.getRow(3));
		//System.out.println(Assignment3.twoSumSecond(arr,9));
		//System.out.println(Assignment3.threeSum(arr1));
		System.out.println(Assignment3.fourSum(nums,0));
	}

}
