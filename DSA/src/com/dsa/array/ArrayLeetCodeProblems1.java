package com.dsa.array;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayLeetCodeProblems1 {
	
	public static int mostFrequentEven(int[] nums) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int count=1;
		int maxEven = Integer.MIN_VALUE;
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i]) && nums[i]%2==0) {
				map.put(nums[i], map.get(nums[i]).intValue()+1);
			}else if(nums[i]%2==0) {
				map.put(nums[i], count);
			}
		}
		if(map.isEmpty()) {
			return -1;
		}
		for (Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue()>maxEven || entry.getValue()==maxEven && entry.getKey()<ans) {
				maxEven = entry.getValue();
				ans = entry.getKey();
			}
			
		}
		
		return ans;
		
	        
	    }
public static String frequencySort(String s) {
	char[] arr = s.toCharArray();
	StringBuilder sb = new StringBuilder();
	Map<Character,Integer> map = new HashMap<Character, Integer>();
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i]).intValue()+1);
		}else {
			map.put(arr[i], 1);
		}
		
	}
	 Map<Character, Integer> sortedMap = map.entrySet()
             .stream()
             //.sorted(Map.Entry.comparingByValue()) // ascending
             .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()) // descending
             .collect(Collectors.toMap(
                     Map.Entry::getKey,
                     Map.Entry::getValue,
                     (e1, e2) -> e1,
                     LinkedHashMap::new
             ));
	 System.out.println(sortedMap);
	 for (Entry<Character,Integer> entry : sortedMap.entrySet()) {
		 for(int i=0;i<entry.getValue();i++) {
			 sb.append(entry.getKey());
		 }
		 
	 }
	return sb.toString();
        
        
    }

public static int[] topKFrequent(int[] nums, int k) {
	int [] newArr = new int[k];
	if(nums.length==1) {
		 newArr[0]=nums[0];
		 return newArr;
	}
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i=0;i<nums.length;i++) {
		if(map.containsKey(nums[i])) {
			map.put(nums[i], map.get(nums[i]).intValue()+1);
		}else {
			map.put(nums[i], 1);
		}
		
	}
	PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
    for(int Key: map.keySet()){
        pq.add(new int[]{Key,map.get(Key).intValue()});
    }
    for(int i=0;i<k;i++){
        int [] temp = pq.remove();
        newArr[i] = temp[0];
        System.out.println(newArr[i]);
    }
	return newArr;
    
}
public static void rotate(int[][] matrix) {
	int n = matrix[0].length;
	
	matrix =transpose(matrix,n);
	matrix = swap(matrix,n);
	for (int i = 0; i <= 2; i++) {
	    for (int j = 0; j <=2; j++) {
	    	System.out.println(matrix[i][j]);
	    }
	}
}
private static int [][] transpose(int [][] matrix, int n){
	int rows = matrix.length;
	int cols = matrix[0].length;
	for (int i = 0; i <rows; i++) {
	    for (int j = i+1; j<cols; j++) {
	    	 int temp=matrix[i][j]; 
	         matrix[i][j]=matrix[j][i]; 
	         matrix[j][i]=temp; 
	    }
	}
	return matrix;
	
}
private static int [][] swap(int [][] matrix, int n){
	for (int i = 0; i <n; i++) {
	    for (int j = 0; j<n/2; j++) {
	    	int temp = matrix[i][j];
			matrix[i][j] = matrix[i][n - 1 - j];
			matrix[i][n - 1 - j] = temp;
	    }
	}
	return matrix;
	
}
public static int[][] merge(int[][] intervals) {
	Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
	List<int[]> merged = new ArrayList<int[]>();
	for (int[] interval : intervals) {
		 if(merged.isEmpty()) {
			 merged.add(interval);
		 }else {
			  int[] last= merged.get(merged.size()-1); 
			  if(last[1] >=interval[0]) { 
		       //find min & max 
		       last[0]=Math.min(last[0],interval[0]); 
		       last[1]=Math.max(last[1],interval[1]); 
		      } 
		      else 
		      { 
		       merged.add(interval); 
		      } 
		 }
	}
	
	return merged.toArray(new int[merged.size()][]);
	
    
}
public int[][] insert(int[][] intervals, int[] newInterval) {
    //Arrays.sort(intervals,(a,b)->Integer.comapre(a[0],b[0]));
    List<int[]> merged = new ArrayList<int[]>();
    for (int[] interval : intervals) {
         if(interval[1]<newInterval[0]) { 
             merged.add(interval); 
        }else if(interval[0]>newInterval[1]) {
            merged.add(newInterval); 
            newInterval =interval;
        }
     //overlapping case 
        else { 
         newInterval[0]= Math.min(newInterval[0], interval[0]); 
         newInterval[1]= Math.max(newInterval[1], interval[1]); 
         
              
        } 
      
    } 
      merged.add(newInterval);  
        return merged.toArray(new int[merged.size()][]); 
}
public static int countDays(int days, int[][] meetings) {
	Arrays.sort(meetings,(a,b)->Integer.compare(a[0], b[0]));
	int counter=1;
	int counter1=0;
	for (int[] meeting : meetings) {
		int startIndex = meeting[0];
		int endIndex = meeting[1];
		for(int i=startIndex;i<=endIndex;i++) {
			//System.out.println(counter+":::"+i);
			if(counter!=i) {
				System.out.println(counter);
				i--;
				counter1++;
			}
			counter++;
		}
		
	}
	
	return counter1;
    
}
public static int maxSubarraySum(int[] arr, int k) {
	int i,j,ans,sum;
	 i=j=ans=sum=0;
	 int n = arr.length;
	 while(j<n) {
		  sum+=arr[j]; 
		     ans=Math.max(ans,sum); 
		   //if we reached window size 
		   if(j-i+1==k) 
		   { 
		   //remove value at index I 
		  // move I 1 step ahead 
		  sum-=arr[i]; 
		  i++; 
	 }
	j++;
	}	
	return ans;
    // Code here
    
}
public static int longestKSubstr(String s, int k) {
	int i,j,ans,c;
	i=j=ans=c=0;
	Map<Character,Integer> map = new HashMap<Character, Integer>();
	char [] arr =s.toCharArray();
	while(j<arr.length) {
		if (map.containsKey(arr[j])) {
			map.put(arr[j], map.get(arr[j]).intValue() + 1);
		} else {
			map.put(arr[j], 1);
		}

		while(k < map.size()) {
			int count = map.get(arr[i]).intValue() - 1;
			if (count == 0) {
				map.remove(arr[i]);
			} else {
				map.put(arr[i], count);
			}

			i++;
		}
		ans = Math.max(ans, j - i + 1);
		j++;
	}
	if (i == 0 && map.size() == 1) {
		return -1;
	}
	return ans;
	// code here
    
}
	public static void main(String[] args) {
		int arr7[] = {0,0,0,0,0,0,0,0};
		int arr8[] = {1,2,1,2,1,2,3,1,3,2};
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int matrix1[][] = {{1,3},{8,10},{2,6},{15,18}};
		int arr9[] = {100, 200, 300, 400};
		
		System.out.println(matrix1);
		 //System.out.println(ArrayLeetCodeProblems1.mostFrequentEven(arr7));
		 //System.out.println(ArrayLeetCodeProblems1.frequencySort("Aabb"));
		 //System.out.println(ArrayLeetCodeProblems1.topKFrequent(arr8,2));
		 //ArrayLeetCodeProblems1.rotate(matrix);
		//System.out.println(ArrayLeetCodeProblems1.maxSubarraySum(arr9, 2));
		//System.out.println(ArrayLeetCodeProblems1.longestKSubstr("eceba", 2));
		int arr10[][]= {{2,4},{1,3}};
		ArrayLeetCodeProblems1.countDays(5,arr10);

	}

}
