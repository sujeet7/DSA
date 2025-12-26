package com.dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlidingWindowTest {
		void maxValueEachWindow(int [] arr1) {
			int arr[] = {1,3,-1,-3,5,3,6,7};
			int k=3;
			int j=0;
			int i=0;
			int n = arr.length-1;
			int sum=0;
			int result = Integer.MIN_VALUE;
			List<Integer> ans = new ArrayList<Integer>();
			
			while(j<=n) {
				if(result<arr[j]) {
					result = arr[j];
				}
				while(j-i+1>=k) {
					ans.add(result);
					i++;
				}
				j++;
			}
			System.out.println(ans);
		}
		void longestSubstring(String str1) {
			String str = "abcadef";
			char[] arr =str.toCharArray();
			Map<Character,Integer> map = new HashMap<Character,Integer>();
			int low=0;
			int high=0;
			int ans = Integer.MIN_VALUE;
			while(high<arr.length) {
				if(map.containsKey(arr[high])) {
					map.put(arr[high], map.get(arr[high]).intValue()+1);
				}else {
					map.put(arr[high], 1);
				}
				int len = high-low+1;
				while(len>map.size()) {
					map.put(arr[low], map.get(arr[low]).intValue()-1);
					if(map.get(arr[low]).intValue()==0) {
						map.remove(arr[low]);
					}
					low++;
					len = high-low+1;
				}
				high++;
				ans = Math.max(ans, len) ;
				
			}
			System.out.println(ans);
		}
		void longestAtMostKFrequency(String str1, int k1) {
			String str = "eceba";
			int k=2;
			char[] arr =str.toCharArray();
			int low=0;
			int high=0;
			int ans = 0;
			Map<Character,Integer> map = new HashMap<Character,Integer>();
			while(high<=arr.length-1) {
				if(map.containsKey(arr[high])) {
					map.put(arr[high], map.get(arr[high]).intValue()+1);
				}else {
					map.put(arr[high], 1);
				}
				while(map.get(arr[high]).intValue()>k) {
					map.put(arr[low], map.get(arr[low]).intValue()-1);
					if(map.get(arr[low]).intValue()==0) {
						map.remove(arr[low]);
					}
					low++;
				}
				ans = Math.max(ans, high - low + 1);
				high++;
			}
			System.out.println(ans);
		}
		public int maxSubarraySum(int[] arr, int k) {
			int low=0;
			int high=0;
			int sum=0;
			int ans =0;
			while(high<arr.length) {
				sum+=arr[high];
				int len = high-low+1;
				if(len>k) {
					sum-=arr[low];
					ans = Math.max(ans, sum);
					
					low++;
				}
				high++;
			}
			return ans;
	    }
		public int longestKSubstr(String s, int k) {
	           char[] arr =s.toCharArray();
				int low=0;
				int high=0;
				int ans = 0;
				Map<Character,Integer> map = new HashMap<Character,Integer>();
				while(high<arr.length) {
					if(map.containsKey(arr[high])) {
						map.put(arr[high], map.get(arr[high]).intValue()+1);
					}else {
						map.put(arr[high], 1);
					}
					while(map.size()>k) {
						map.put(arr[low], map.get(arr[low]).intValue()-1);
						if(map.get(arr[low]).intValue()==0) {
							map.remove(arr[low]);
						}
						low++;
					}
						if (map.size() == k) {
		                    ans = Math.max(ans, high - low + 1);
		                }
					high++;
				}
				return ans==0?-1:ans;
	      }
		int longestOnes(int[] arr1, int k1) {
			int k=2;
			int[] arr = {1,1,0,0,1,1,0,1,1};
			int low=0;
			int high=0;
			int ans = 0;
			int count =0;
			while(high<arr.length) {
				if(arr[high]==0) {
					count++;
				}
				while(count>k) {
					 if (arr[low] == 0) {
						 count--;
					 }
					low++;
				}
				ans = Math.max(ans, high-low+1);
				high++;
			}
			return ans;
		
		}
		  public int totalFruit(int[] fruits) {
		        int low=0;
				int high=0;
				int ans = 0;
		        int k=2;
				Map<Integer,Integer> map = new HashMap<Integer, Integer>();
				while(high<fruits.length) {
						if (map.containsKey(fruits[high])) {
							map.put(fruits[high], map.get(fruits[high]).intValue() + 1);
						} else {
							map.put(fruits[high], 1);
						}
						if (map.size() > k) {
							map.put(fruits[low], map.get(fruits[low]).intValue() - 1);
							if (map.get(fruits[low]).intValue() == 0) {
								map.remove(fruits[low]);
							}
							low++;
						}
						ans = Math.max(ans, high - low + 1);
						high++;
					}
		            return ans;
		    }
	public static void main(String[] args) {
		int k=2;
		String s = "ABAB";
		char [] arr =s.toCharArray();
		int low=0;
		int high=0;
		int ans = 0;
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		while(high<arr.length) {
				if (map.containsKey(arr[high])) {
					map.put(arr[high], map.get(arr[high]).intValue() + 1);
				} else {
					map.put(arr[high], 1);
				}
				if (map.size() > k) {
					map.put(arr[low], map.get(arr[low]).intValue() - 1);
					if (map.get(arr[low]).intValue() == 0) {
						map.remove(arr[low]);
					}
					low++;
				}
				ans = Math.max(ans, high - low + 1);
				high++;
			}
	
		
		System.out.println(ans);
	}

}
