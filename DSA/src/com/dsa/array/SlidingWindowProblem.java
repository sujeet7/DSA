package com.dsa.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SlidingWindowProblem {

	int longestSubArray(int arr[],int k) {
		int i,j,sum;
		i=j=sum=0;
		int ans=-1;
		while(j<arr.length) {
			sum = sum+arr[j];
			if(sum==k) {
				while(i<=j && sum > k) {
					sum -=arr[i];
					i++;
				}
				 int len = j - i + 1;
				 ans = Math.max(ans, len);
			}
			j++;
		}
		return ans;
		
	}
	private int maxOnes(int arr[], int k) {
		int i,j,ans;
		i=j=0;
		ans =-1;
		int zeroCount=0;
		while(j<arr.length) {
			if(arr[j]==0) {
				zeroCount++;
			}
			while(k<zeroCount) {
					if(arr[i]==0) {
						zeroCount--;
					}
					i++;
			}
			ans = Math.max(ans, j-i+1);
			j++;
		}
		return ans; 
		
	}
	 static List<Integer> firstNegInt(int arr[], int k) {
		 int i,j;
			i=j=0;
			List<Integer> list = new ArrayList<Integer>();
			List<Integer> ans = new ArrayList<Integer>();
			while(j<arr.length) {
				if(arr[j]<0) {
					list.add(arr[j]);
				}
				if(k==j-i+1) {
					if(list.size()==0) {
						ans.add(0);
					}else {
						ans.add(list.get(0));
						if(list.get(0)==arr[i]) {
							list.remove(0);
						}
						
					}
					i++;
				}
				j++;
			}
		return ans;
	        // write code here
	        
	    }
	public static void main(String[] args) {

	}

}
