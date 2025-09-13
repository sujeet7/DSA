package com.dsa.array;

public class CountPairsSum {
	public static int countPairs(int arr[], int target) {
	      int count=0;
	        for(int i=0;i<arr.length;i++){
	            for(int j=i;j<arr.length;j++){
	                if(arr[i]+arr[j]==target){
	                    count++;
	                }
	            }
	            
	        }
	        
	    return count;
	    }
	public static void main(String[] args) {
		// [1, 5, 7, -1, 5], target = 6

		// Input: arr[] = [1, 1, 1, 1], target = 2

		// Input: arr[] = [10, 12, 10, 15, -1], target = 125
			
		int arr[] = {1, 5, 7, -1, 5};
		System.out.println(CountPairsSum.countPairs(arr, 6));

	}

}
