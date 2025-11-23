package com.dsa.array.assignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class PracticeTest {

	int longestSubArray(int arr[], int k) {
		int i, j, sum;
		i = j = sum = 0;
		int ans = -1;
		while (j < arr.length) {
			sum = sum + arr[j];
			if (sum == k) {
				while (i <= j && sum > k) {
					sum -= arr[i];
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
		int i, j, ans;
		i = j = 0;
		ans = -1;
		int zeroCount = 0;
		while (j < arr.length) {
			if (arr[j] == 0) {
				zeroCount++;
			}
			while (k < zeroCount) {
				if (arr[i] == 0) {
					zeroCount--;
				}
				i++;
			}
			ans = Math.max(ans, j - i + 1);
			j++;
		}
		return ans;

	}

	int smallSubArray(int arr[], int k) {
		int i, j, sum;
		i = j = sum = 0;
		int ans = 2000;
		while (j < arr.length) {
			sum = sum + arr[j];
			System.out.println(sum);
			if (sum == k || sum > k) {
				while (i < j) {
					sum -= arr[i];
					System.out.println(sum);
					i++;
				}

			}
			int len = j - i + 1;
			ans = Math.min(ans, len);
			j++;
		}
		return ans;
	}

	static List<Integer> firstNegInt(int arr[], int k) {
		int i, j;
		i = j = 0;
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> ans = new ArrayList<Integer>();
		while (j < arr.length) {
			if (arr[j] < 0) {
				list.add(arr[j]);
			}
			if (k == j - i + 1) {
				if (list.size() == 0) {
					ans.add(0);
				} else {
					ans.add(list.get(0));
					if (list.get(0) == arr[i]) {
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

	static List<Integer> maxSlidingWindow(int arr[], int k) {
		int i, j;
		i = j = 0;
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> ans = new ArrayList<Integer>();
		int ans1 = 0;
		if (arr.length < k) {
			if (arr.length == 1) {
				ans.add(arr[0]);
			} else {
				ans.add(arr[0]);
				ans.add(arr[1]);
			}

			return ans;
		}
		while (j < arr.length) {
			ans1 = Math.max(ans1, arr[j]);
			if (k == j - i + 1) {
				ans.add(ans1);
				i++;
			}
			j++;
		}
		return ans;
		// write code here

	}

	public int maxSubArray(int[] nums) {
		int ans, currSum;
		ans = currSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currSum = Math.max(currSum + nums[i], nums[i]);
			ans = Math.max(ans, currSum);

		}
		return 0;

	}

	public int countAnagram(String text, String pattern) {
		char[] arr = text.toCharArray();
		int i, j;
		i = j = 0;
		int count=0;
		StringBuilder s = new StringBuilder();
		List<StringBuilder> ans = new ArrayList<StringBuilder>();
		while (j < arr.length) {
			if (pattern.contains(String.valueOf(arr[j]))) {
				s.append(arr[j]);
			} else {
				s.setLength(0);
				// continue;
			}
			if (s.equals(pattern) || s.length() == pattern.length()) {
				System.out.println(s);
				ans.add(s);
				s.setLength(0);
			}
			j++;
		}
		return ans.size();

	}
	
	 public int[] productExceptSelf(int[] nums) {
		
		 int [] ans = new int[nums.length];
		 int [] p = new int[nums.length];
		 int [] s = new int[nums.length];
		 int prod=1;
		 for(int i=0;i<nums.length;i++) {
			 p[i] *=prod;
			 prod *=nums[i];
		 }
		 prod=1;
		 for(int i=nums.length-1;i>0;i--) {
			 s[i] *=prod;
			 prod *=nums[i];
		 }
		 for(int i=0;i<nums.length;i++) {
			ans[i]*=p[i]*s[i];
		 }
		 
		return ans;
	        
	    }
	 public List<List<Integer>> threeSum(int[] nums) {
		 int n=nums.length;
		 Arrays.sort(nums);
		 for(int i=0;i<n-2;i++) {
			 for(int j=1;j<n-1;j++) {
				 
			 }
		 }
		return null;
	        
	    }
	
	 public static boolean isPowerOfTwo(int n) {
		if(n==0) {
			return false;
		}
		if(n==1) {
			return true;
		}
		if(n%2!=0) {
			return false;
		}
		return isPowerOfTwo(n/2);
		
	      
	    }
	 
	 void fun(int n) {
		 if(n>0) {
			 fun(n-1);
			 System.out.println(n);
		 }
	 }
	 
	  public List<String> summaryRanges(int[] nums) {
		  List<String> ans = new ArrayList<String>();
		  String s = "";
		  int j=0;
		  for(int i=0;i<nums.length-1;i++) {
			  if(s.isEmpty()) {
				  s+=nums[i];
			  }
			 if(nums[i+1]-nums[i]==1) {
				 j=i;
				  continue;
			 }if(!String.valueOf(nums[i]).equals(s)) {
				 s=s+"->";
				 s+=nums[i];
			 }
			
			  ans.add(String.valueOf(s)); 
			  s="";
			  j=i;
			  //System.out.println(i);
		  }
		  if(nums[j+1]-nums[j]==1) {
			  s="";
			  s=s+nums[j]+"->"+nums[j+1];
			  ans.add(String.valueOf(s));
		  }else {
			  //ans.add(String.valueOf(nums[j]));
			  ans.add(String.valueOf(nums[j+1]));
		  }
			 // ans.add(String.valueOf(nums[nums.length-1]));
			  System.out.println(ans);
		return ans;
	        
	    }
	public static void main(String[] args) {
		PracticeTest obj = new PracticeTest();
		int arr[] = {-8,2,3,-6,10};
		int arr1[] = { 1, 0, 0, 1, 0, 1, 0, 1 };
		int arr2[] = { 1 };
		int arr3[] = {0,2,3,4,6,8,9};
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		// System.out.println(obj.smallSubArray(arr, 6));
		// System.out.println(obj.maxOnes(arr1, 2));
		// System.out.println(obj.maxSlidingWindow(arr2, 3));
		//System.out.println(obj.countAnagram("cbaebabacd", "abc"));
		//obj.fun(4);
		//obj.summaryRanges(arr3);
		
		String s="hello";
		char[] ch = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		for (char c : ch) {
			st.push(c);
		}
		for(int i=0;i<s.length();i++) {
			ch[i]=st.pop();
		}
		System.out.println(ch);
		
	}

}
