package com.dsa.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class BitManipulationTest {
	
	public static int findSingleNuber(int [] arr) {
		int result =0;
		for(int i=0;i<arr.length;i++) {
			result = result^arr[i];
		}
		System.out.println(result);
		return result;
		
	}
	 public static int[] singleNumber(int[] nums) {

			int[] ans = new int[2];
			int allXor = 0;
			for (int i = 0; i < nums.length; i++) {
				allXor ^= nums[i];
			}
			int xorMask = allXor & (-allXor);

			for (int i = 0; i < nums.length; i++) {
				if ((nums[i] & xorMask) != 0) {
					ans[0] ^= nums[i];
				} else {
					ans[1] ^= nums[i];
				}
			}

			return nums;
	        
	    }
	public static int findMissingNumber(int arr[]) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans ^=arr[i];
			ans^=i+1;
		}
		System.out.println(ans);
		return ans;
		
	}
	public static boolean checkSetBit(int n,int k) {
		int mask = 1<<(k-1);
		if((n&mask)>0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static int setTheKthBit(int n,int k) {
		int mask = 1<<(k-1);
		int res = n | mask;
		return res;
		
	}
	public static int clearIthBit(int n,int k) {
		int mask = 1<<(k-1);
		int compl =~(mask); 
		return n & compl;
		
	}
	
	 public boolean isPowerOfTwo(int n) {
	       if(n>0){
	        return (n & (n - 1)) == 0;
	       }
	       return false;
	    }
	 
	 public static String addBinary(String a, String b) {
		 StringBuilder result = new StringBuilder();
		 
	        int i = a.length() - 1;
	        int j = b.length() - 1;
	        int carry = 0;
	        System.out.println(i);
	        while (i >= 0 || j >= 0 || carry == 1) {
	            int sum = carry;

	            if (i >= 0) {
	            	sum += a.charAt(i--) - '0'; // convert char to int
	            }
	            if (j >= 0) {
	            	sum += b.charAt(j--) - '0';
	            }

	            result.append(sum % 2);  // add current bit
	            carry = sum / 2;         // update carry
	        }

	        return result.reverse().toString(); 
	        
	    }
	 public static int[] plusOne(int[] digits) {
		 int num=1;
		 int result=0;
		 List<Integer> list = new ArrayList<Integer>();
		 for(int i=0;i<digits.length;i++) {
			 result+=digits[i];
			 if(i==digits.length-1)
				 continue;
			 
			 result*=10;
		 }
		 result = result+1;
		 char[] ans = String.valueOf(result).toCharArray();
		 for (int i = 0; i < ans.length; i++) {
			 list.add(ans[i]-'0');  // Convert '1' → 1, etc.
	        }
		 int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
		return arr;
		 
	 }

	public static void main(String arr[]) {
		int [] arr1= {2,2,1};
		int [] arr2= {3,0,1};
		int [] arr3= {1,2,1,3,2,5};
		int [] arr4= {9};
		//BitManipulationTest.findSingleNuber(arr1);
		//BitManipulationTest.findMissingNumber(arr2);
		//System.out.println(BitManipulationTest.checkSetBit(10, 3));
		//System.out.println(BitManipulationTest.setTheKthBit(10, 3));
		//System.out.println(BitManipulationTest.addBinary("11","1"));
		System.out.println(BitManipulationTest.plusOne(arr4));
	}

}
