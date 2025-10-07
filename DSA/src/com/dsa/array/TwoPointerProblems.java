package com.dsa.array;

import java.util.Arrays;

public class TwoPointerProblems {

	public static void removeDuplicateSortedArray(int arr[]) {
		int left =0;
		int right = arr.length;
		for(int i=0;i<arr.length;i++) {
			
		}
	}
	 public static int maxProfit(int[] prices) {
		  if(prices==null || prices.length==1){
	            return 0;
	        }
	         
	       int max = Integer.MIN_VALUE;
		        int min = prices[0];
		        for(int i=0;i<prices.length;i++) {
			        	
			        if(prices[i]<min) {
			        	min = prices[i];
			        }else {
			        	int profit = prices[i]-min;
			        	max = Math.max(profit, max);
			        }
		        
		    }
		        System.out.println(min+","+max);
		        return max==Integer.MIN_VALUE?0:max;
	    
	 }
	public static void main(String[] args) {
		
		int arr [] = {1,2};
		System.out.println(TwoPointerProblems.maxProfit(arr));
	}

}
