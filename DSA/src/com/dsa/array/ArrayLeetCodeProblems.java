package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayLeetCodeProblems {
	 public static List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
		 int sum =0;
		 for(int i=0;i<nums.length;i++) {
			 for(int j=i;j<nums.length-2;j=j+2) {
				 sum = sum+nums[i]+nums[j+1]+nums[j+2];
				 System.out.println(sum);
				 if(sum==0 && sum==sum+nums[i]+nums[j+1]+nums[j+2]) {
					 if(!res.contains(Arrays.asList(nums[i],nums[j+1],nums[j+2]))) {
					 res.add(Arrays.asList(nums[i],nums[j+1],nums[j+2]));
					 }
					 sum=0;
				 }
			 }
		 }
		 System.out.println(res);
		return res;
	        
	    }
	 
	 public static int removeDuplicateFromSoretedArray(int [] nums)  {
		 int counter1=0;
		 for(int i=0;i<nums.length-1;i++) {
				if(nums[i]==nums[i+1]) {
					continue;
				}else {
					nums[counter1] =nums[i];
						counter1++;
				}
			}
		 nums[counter1] =nums[nums.length-1];
			
		return counter1+1;
		 
	 }
	 public static int[] productOfArrayExceptSelf(int [] arr)  {
			int newArr[] = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				int productResult = 1;
				for (int j = 0; j < arr.length; j++) {
					if (i != j) {
						productResult = productResult * arr[j];

					}
				}
				newArr[i] = productResult;
			}
			for (int i = 0; i < newArr.length; i++) {
				System.out.println(newArr[i]);
			}
			return arr;
		 
	 }
	 public static int[] twoSum(int[] numbers, int target) {
	        int left =0;
	        int right = numbers.length-1;
	        		while(left<right) {
	        			int sum = numbers[left]+numbers[right];
	        			if(sum == target) {
	        				return new int[] {left,right};
	        			}
	        			if(target<sum) {
	        				right--;
	        			}else {
	        				left++;
	        			}
	        		}
			return numbers;
	        
	    }
	  public static int romanToInt(String s) {
	       char[] chaArr =  s.toCharArray();
	       int value=0;
	       String match ="";
	       for(int i=0;i<chaArr.length;i++) {
	    	   
	    	   match = match+chaArr[i];
	    	    
	    	    if(chaArr[i]=='I') {
	    		   value =value+1;
	    	   }if(match.equals("IV")) {
	    		   value =value*4;
	    	   }
	    	   else if(chaArr[i]=='V') {
	    		   value =value+5;
	    	   } else if(match.equals("XC")) {
	    		   value =value+90;
	    	   }else if(chaArr[i]=='X') {
	    		   value =value+10;
	    	   }else if(chaArr[i]=='L') {
	    		   value =value+50;
	    	   }else if(match.equals("CM")) {
	    		   value =value+900;
	    	   }
	    	   else if(chaArr[i]=='C') {
	    		   value =value+100;
	    	   }else if(chaArr[i]=='D') {
	    		   value =value+500;
	    	   }else if(chaArr[i]=='M') {
	    		   value =value+1000;
	    	   }
	    	    
	    	  System.out.println(match);
	       }//MCMXCIV M = 1000, CM = 900, XC = 90 and IV = 4.
	       System.out.println(value);
			 return value;
	         

	        
	    }
	  public static int removeDuplicates(int[] nums) {
			int counter1 = 0;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] == nums[i + 1]) {
					continue;
				} else {
					nums[counter1] = nums[i];
					counter1++;
				}
			}
			nums[counter1] = nums[nums.length - 1];

			return counter1 + 1;
}
	  public static int removeElement(int[] nums, int val) {
			int counter = 0;
			for (int i = 0; i < nums.length; i++) {
				if (val == nums[i]) {
					continue;
				} else {
					nums[counter] = nums[i];
					counter++;
				}
			}
			for (int i = 0; i < counter; i++) {
				System.out.println(nums[i]);
			}

			return counter;
	        
	    }
	  public static int[] plusOne(int[] digits) {
		  int counter=0;
	        for(int i=0;i<digits.length;i++){
	            if(i==digits.length-1){
	                int value = digits[i]+1;
	                if(value>9){
	                	
	                	digits[counter]=value/10;
	                     
	                     digits[counter]=value%10; 
	                     System.out.println(value/10+",,,"+value%10);
	                     
	                    }
	                
	                counter++;
	            }
	            else{
	                digits[counter]=digits[i]; 
	                counter++;
	            }
	        }
	        for(int i=0;i<digits.length;i++) {
	        	System.out.println(digits[i]);
	        }
	        return digits;
	    }
	  public static int majorityElement(int[] nums) {
		  int majrity =nums[0];
		  int counter =1;
		  for(int i=1;i<nums.length;i++) {
			  if(nums[i]==majrity) {
				  counter++;
			  }else {
				  counter--;
				  if(counter==0) {
					  counter++;
					  majrity=nums[i];
					 
				  }
				 
				  
			  }
			  
		  }
		return majrity;
		  
	  }
	  
	  
	  public static boolean checkXMatrix(int[][] grid) {
	        int rows = grid.length;
	        int cols = grid[0].length;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (i == j || (i + j == cols - 1)) {
						if(grid[i][j]==0)
		                    return false;
		           }
					else if(grid[i][j]!=0){
		            return false;
		           }
				}
	    }
	    return true;
	  }
	  
	  public static List<Integer> spriralMatrix(int[][] matrix) {
			List<Integer> list = new ArrayList<Integer>();
			int top = 0;
			int bottom = matrix.length - 1;
			int left = 0;
			int right = matrix[0].length - 1;
			int size = matrix[0].length*matrix.length;
			while (list.size()<size) {
				for (int i = left; i <= right && list.size()<size; i++) {
					System.out.println(top + " : " + i);
					list.add(matrix[top][i]);
				}
				top++;
				for (int i = top; i <= bottom && list.size()<size; i++) {
					System.out.println(i + " : " + right);
					// System.out.println(matrix[i][right]);
					list.add(matrix[i][right]);
				}
				right--;
				if (top <= bottom) {
					for (int i = right; i >= left && list.size()<size; i--) {
						System.out.println(bottom + " : " + i);
						// System.out.println(matrix[bottom][i]);
						list.add(matrix[bottom][i]);

					}
					bottom--;
				}

				if (left <= right) {
					for (int i = bottom; i >= top && list.size()<size; i--) {
						System.out.println(i + " : " + left);
						// System.out.println(matrix[i][left]);
						list.add(matrix[i][left]);

					}

				}
				left++;
			}
			return list;
            
	  }
	public static void main(String[] args) {
		int arr1[] = {-100,-70,-60,110,120,130,160};
		//ArrayLeetCodeProblems.threeSum(arr1);
		 int arr[] = {0,0,1,1,1,2,2,3,3,4};
		//System.out.println( ArrayLeetCodeProblems.removeDuplicateFromSoretedArray(arr));
		 int arr2[] = {1,2,3,4};
		 //ArrayLeetCodeProblems.productOfArrayExceptSelf(arr2);
		 int arr3[] = {2,7,11,15};
		 int target = 9;
		 //ArrayLeetCodeProblems.twoSum(arr3, target);
		 //ArrayLeetCodeProblems.romanToInt("MCMXCIV");
		 int arr4[] = {1,1,2};
		 //ArrayLeetCodeProblems.removeDuplicates(arr4);
		 int arr5[] = {3,2,2,3};
		
		 //System.out.println( ArrayLeetCodeProblems.removeElement(arr5, 3));
		 int arr6[] = {9};
		 //System.out.println( ArrayLeetCodeProblems.plusOne(arr6));
		 //int arr7[] = {3,2,3};
		// System.out.println(ArrayLeetCodeProblems.majorityElement(arr7));
		 int [][]matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		 //System.out.println(ArrayLeetCodeProblems.checkXMatrix(matrix));
		 
		 int [][]matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		 //System.out.println(ArrayLeetCodeProblems.spriralMatrix(matrix1));
		 
	}

}
