package com.dsa.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class BinaryProblemTest {

	public static int lowerBound(int[] arr, int target) {
		// target 9 ans 3
		// 11 ans 4
		// if no match last index
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		int ans = -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] >= target) {
				ans = mid;
				high = mid - 1;
			}
			if (arr[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return ans == -1 ? arr.length : ans;

	}
	public  static ArrayList<Integer>  firstAndLast(int x, int arr[]) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int last = findLast(arr,x);
		 if(last ==-1) {
			 ans.add(-1);
			 return ans;
		 }
		 int fist = findFirst(arr,x);
		 ans.add(fist);
		 ans.add(last);
		return ans;
        
    }
	
	private static int findFirst(int arr[],int x) {
		int low=0,high=arr.length-1;
		int mid=0;
		int ans = -1;
		while(low<=high) {
			mid = low + (high-low)/2;
			if(arr[mid] ==x) {
				ans = mid;
				high = mid -1;
			}else if(arr[mid]<x) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return ans;
	}
	private static int findLast(int arr[],int x) {
		int low=0,high=arr.length-1;
		int mid=0;
		int ans = -1;
		while(low<=high) {
			mid = low + (high-low)/2;
			if(arr[mid] ==x) {
				ans = mid;
				low = mid +1;
			}else if(arr[mid]<x) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return ans;
	}
	public static long floorSqrt(int n) {
        int sq =1;
        int low=0;
        int high = n-1;
        long ans =1;
        while(low<=high){
        	int mid = low+(high-low)/2;
            long squere = mid*mid;
            if(squere==n){
                return mid;
            }
            else if(squere>n){
                high =mid-1;
            }else{
            	ans = mid;
                low = mid+1;
            }
            
        }
        return ans;
    }
	public static int findPeakElement(int arr[]) {
		int low =0,high=arr.length-1;
		int mid=0;
		if(arr.length==1) 
			return 0; 
	       if(arr[0]>arr[1]) 
	         return 0; 
	       int n=arr.length;
	       if(arr[n-1]>arr[n-2]) 
	         return n-1;
	       
		while(low<=high) {
			mid = low + (high - low)/2;
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
				return mid;
			}else if (arr[mid]<arr[mid+1]) {
				low = mid+1;
			}else {
				high = mid -1;
			}
		}
		
		return -1;
		
	}
	 public static int shipWithinDays(int[] weights, int days)    {
		 int totalWeight = 0;
		 int maxWeight =0;
		 for(int i=0;i<weights.length;i++) {
			 totalWeight += weights[i];
			 maxWeight = Math.max(maxWeight, weights[i]);
			 
		 }
		 /*for(int cap =maxWeight;cap<=totalWeight;cap++) {
			 int currDays = calculateCapacityByDays(weights,cap);
			// System.out.println(currDays);
			 if(currDays==days) {
				 return days;
			 }
		 }*/
		 int low=maxWeight,high=totalWeight;
		 int ans=-1;
		 int mid = 0;
		 while(low<=high) {
			 mid = low + (high - low)/2;
			 int currDays = calculateCapacityByDays(weights,mid);
			 if(currDays<=days) {
				 ans = currDays;
				 high = mid -1;
			 }else {
				 low = mid +1;
			 }
		 }
		return ans; 
	 }
	private static int calculateCapacityByDays(int w[], int cap) {
		int ans=1,load=0;
		for(int i=0;i<w.length;i++) {
			if(w[i]+load<=cap) {
				load+=w[i];
			}else {
				ans++;
				load =w[i];
			}
		}
		return ans;
	}
	
	 public static int search(int[] nums, int target) {
		 int low =0,high = nums.length-1;
		 int mid =0;
		 while(low<=high) {
			 mid = low + (high-low)/2;
			 if(target ==nums[mid]) {
				 return nums[mid];
			 } 
			 if(nums[low] == nums[mid] && nums[low] == nums[high]) {
				 low++;
				 high++;
			 }
			 //left sorted array
			 if(nums[low]<=nums[mid]) {
					if (target >= nums[low] && target < nums[mid]) {
						high = mid - 1;
					} else {
						low = mid + 1;
					}
			 }
			//right sorted array
			 else {
					if (target > nums[mid] && target <= nums[high]) {
						low = mid + 1;
					} else {
						high = mid - 1;
					}
			 }
		 }
		  
		 return -1;
	        
	    }
	 public static boolean search1(int[] nums, int target) {
		 int low =0,high = nums.length-1;
		 int mid =0;
		 while(low<=high) {
			 mid = low + (high-low)/2;
			 if(target ==nums[mid]) {
				 return true;
			 } 
			 if(nums[low] == nums[mid] && nums[low] == nums[high]) {
				 low++;
				 high++;
			 }
			 //left sorted array
			 if(nums[low]<=nums[mid]) {
					if (target >= nums[low] && target < nums[mid]) {
						high = mid - 1;
					} else {
						low = mid + 1;
					}
			 }
			//right sorted array
			 else {
					if (target > nums[mid] && target <= nums[high]) {
						low = mid + 1;
					} else {
						high = mid - 1;
					}
			 }
		 }
		  
		 return false;
	        
	    }
	public static void main(String[] args) {
		int [] arr3= {2, 3, 7, 10, 11, 11, 25};
		int [] arr4= {1, 3, 3, 4};
		int [] arr5= {1,2,1,3,5,6,4};
		int [] arr6= {1,2,3,4,5,6,7,8,9,10};
		int [] arr7= {4,5,6,7,0,1,2};
		int [] arr8= {2,5,6,0,0,1,2};
		//System.out.println(BinaryProblemTest.lowerBound(arr3, 100));
		//System.out.println(BinaryProblemTest.firstAndLast(3,arr4));
		//System.out.println(BinaryProblemTest.floorSqrt(5));
		//System.out.println(BinaryProblemTest.findPeakElement(arr5));
		//System.out.println(BinaryProblemTest.shipWithinDays(arr6,5));
		System.out.println(BinaryProblemTest.search1(arr8,3));
	}

}
