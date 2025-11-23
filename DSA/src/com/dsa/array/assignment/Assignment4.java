package com.dsa.array.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment4 {
	 public void moveZeroes(int[] nums) {
		  int start =0;
		  int end = nums.length;
	       for(int i=0;i<end;i++) {
	    	   if(nums[i]!=0) {
	    		   int temp = nums[i];
	    		   nums[i] =nums[start];
	    		   nums[start] = temp;
	    		   start++;
	    	   }
	    	   
	       }
	        for(int i=0;i<nums.length;i++) {
	        	System.out.println(nums[i]);
	        }
	    }
	public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) {
            	map.put(nums[i], map.get(nums[i]).intValue()+1);
            }else {
            	map.put(nums[i], 1);
            }
        }
        int counter=0;
        Set<Entry<Integer, Integer>> mapKey = map.entrySet();
        for (Entry<Integer, Integer> entry : mapKey) {
			counter = Math.max(counter, entry.getValue());
		}
        System.out.println(counter);
        if(counter>1) {
        	return true;
        }else {
		return false;
        }
        
    }
	public static void main(String[] args) {
		int []nums = {0,4,5,0,3,6};
		System.out.println(Assignment4.containsDuplicate(nums));
	}

}
