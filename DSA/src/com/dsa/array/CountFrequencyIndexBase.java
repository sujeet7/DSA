package com.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyIndexBase {
		
	public static Map getFrequecyOfIndex(int arr[]) {
			Map<Integer,Integer> map = new HashMap();
			for(int i=1;i<=arr.length;i++) {
				int count = 0;
				for(int j=0;j<arr.length;j++) {
					if(i==arr[j]) {
						count++;
					}
				}
				map.put(i, count);
			}
			return map;
		}
		public static Map getFrequecyOfIndex1(int arr[]) {
			Map<Integer,Integer> map = new HashMap();
			
			for(int i=0;i<arr.length;i++) {
				
				if(map.containsKey(arr[i])){
					map.put(arr[i], map.get(arr[i]).intValue()+1);
				}else {
					map.put(arr[i], 1);
				}
			}
			for(int i=1;i<arr.length;i++) {
				if(map.containsKey(i)) {
					map.put(i, map.get(arr[i]).intValue());
				}else {
					map.put(i, 0);
				}
			}
			
			return map;
		}
	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 3, 5};
		
		System.out.println(CountFrequencyIndexBase.getFrequecyOfIndex1(arr));
	}

}
