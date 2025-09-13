package com.dsa.basic;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class AnagramCheck {
	
	public static boolean isAnagram(String s, String t) {
		char[] arr = s.toCharArray();
		char[] arr1 = t.toCharArray();
		HashMap<Character, Integer> hs = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!hs.containsKey(arr[i])) {
				hs.put(arr[i], 1);
			}else {
				hs.put(arr[i], hs.get(arr[i]).intValue()+1);
			}
		}
		for(int j=0;j<arr1.length;j++) {
			if(hs.containsKey(arr1[j])) {
				if(hs.get(arr1[j]).intValue()==1) {
					hs.remove(arr1[j]);
				}else {
					hs.put(arr1[j],(hs.get(arr1[j]).intValue())-1);
				}
			}
			
		}
		return hs.size()==0;
	}
	
	public static void main(String[] args) {
		String s="rat";
		String t="car";
		
		System.out.println(AnagramCheck.isAnagram(s, t));
	}

}
