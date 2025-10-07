package com.dsa.array.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
	 public static int[][] transpose(int[][] matrix) {
		 int rows = matrix.length;       
	     int cols = matrix[0].length;
		 int [][] arr = new int [cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[j][i]= matrix[i][j];
                    
            }
        }
        return arr;
		 
	 }
	 public static int maximumWealth(int[][] accounts) {
		 int rows = accounts.length;       
	     int cols = accounts[0].length;
	     int result =0;
		 for(int i=0;i<rows;i++) {
             int sum =0;
			 for(int j=0;j<cols;j++) {
				 sum = sum+accounts[i][j];
			 }
			result = Math.max(result, sum);
		 }
		 
		return result;
	        
	    }
	 public static List<List<Integer>> minimumAbsDifference(int[] arr) {
		 List<List<Integer>> res = new ArrayList();
	        Arrays.sort(arr);

	        int min = Integer.MAX_VALUE;
	  
	        for (int i = 0; i < arr.length - 1; i++) {
	            int diff = arr[i + 1] - arr[i];
	            if (diff < min) {
	                min = diff;
	                res.add(Arrays.asList(arr[i], arr[i + 1]));
	            } else if (diff == min) {
	                res.add(Arrays.asList(arr[i], arr[i + 1]));
	            }
	        }
	        return res;
 
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
	 public static int numJewelsInStones(String jewels, String stones) {
		char[] jewelsArr = jewels.toCharArray();
		char[] stoneArr = stones.toCharArray();
		int counter=0;
		for(int i=0;i<jewelsArr.length;i++) {
			for(int j=0;j<stoneArr.length;j++) {
				if(jewelsArr[i]==stoneArr[j]) {
					counter++;
				}
			}
		}
		return counter;
	        
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
		
		int arr5 [] = {4,2,1,3};
		System.out.println(Assignment2.minimumAbsDifference(arr5));
		
		int arr6 [][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr6 [][] ={{1,2,3},{4,5,6}};
		Assignment2.transpose(arr6);
		int accounts [][] = {{1,2,3},{3,2,1}};
		Assignment2.maximumWealth(accounts);
		
		System.out.println(Assignment2.numJewelsInStones("aA", "aAAbbbb"));
		*/
	}

}
