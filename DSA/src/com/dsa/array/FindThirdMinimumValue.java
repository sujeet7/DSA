package com.dsa.array;

public class FindThirdMinimumValue {

	 public static int thirdMax(int[] nums) {
	        int one = (int) Long.MIN_VALUE;
	         int two = (int) Long.MIN_VALUE;
	          int three = (int) Long.MIN_VALUE;
	         
	        for(int i=0;i<nums.length;i++){
	         if(nums[i]==one || nums[i] ==two|| nums[i]==three)
	            continue;
	         
	            if(one<nums[i]){
	                three = two;
	                two = one;
	                one = nums[i];
	            }else if(two<nums[i]){
	                three=two;
	                two=nums[i];
	            }else if(three<nums[i]){
	                three=nums[i];
	            } 
	    }

	    if(three == (int) Long.MIN_VALUE)
	        three=one;
	        
	    return three;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,-2147483648};
		System.out.println(FindThirdMinimumValue.thirdMax(arr));
	}

}
