package com.dsa.stack;

import java.util.Stack;

public class Assignment {
	public static String decodeString(String s) {
		 Stack<Integer>stackCount = new Stack<Integer>();
		 Stack<String>stringCount = new Stack<String>();
		 String num="";
		 String curr="";
		 for(char c : s.toCharArray()) {
			 
			 if(Character.isDigit(c)) {
				 num+=c;
			 }else if(c=='[') {
				 stackCount.push(Integer.parseInt(num));
				 stringCount.push(curr);
				 num="";
				 curr="";
			 }else if(c==']') {
				 int repeatCounter = stackCount.pop();
				 StringBuffer sb = new StringBuffer(stringCount.pop());
				 for(int i=0;i<repeatCounter;i++) {
					 sb.append(curr);
				 }
				 curr = sb.toString();
			 }else {
				 curr+=c;
			 }
			 
		 }
		 System.out.println(curr);
		 return curr;
	    }
	 
	 public boolean backspaceCompare(String s, String t) {
		    return build(s).equals(build(t));
		}

		private String build(String str) {
		    Stack<Character> stack = new Stack<>();

		    for (char ch : str.toCharArray()) {
		        if (ch != '#') {
		            stack.push(ch);
		        } else if (!stack.isEmpty()) {
		            stack.pop();
		        }
		    }

		    StringBuilder sb = new StringBuilder();
		    for (char c : stack) {
		    	sb.append(c);
		    }
		    return sb.toString();
		}
		
		public String makeGood(String s) {
		    Stack<Character> stack = new Stack<>();

		    for (char ch : s.toCharArray()) {
		        if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) {
		            stack.pop(); // cancel previous
		        } else {
		            stack.push(ch);
		        }
		    }

		    StringBuilder sb = new StringBuilder();
		    for (char c : stack) {
		    	sb.append(c);
		    }
		    return sb.toString();
		}
		
		 public static int calPoints(String[] operations) {
				Stack<Integer> stack = new Stack<Integer>();
				int total = 0;
				for (String s : operations) {
					if (s.equals("D")) {
						stack.push(2 * stack.peek());
					} else if (s.equals("C")) {
						stack.pop();
					} else if (s.equals("+")) {
						int value = stack.pop();
						int sum = value + stack.peek();
						stack.push(value);
						stack.push(sum);
					} else {
						stack.push(Integer.parseInt(s));
					}
				}
				for (int c : stack) {
					total += c;
				}
				// System.out.println(total);
				return total;
		    }
		 
		 public static String removeDuplicates(String s) {
			 Stack<Character> stack = new Stack<Character>();
			 for(Character ch:s.toCharArray()) {
				 if(!stack.isEmpty() && stack.peek()==ch) {
						stack.pop();
				 }else {
					 stack.push(ch);
				 }
			 }
			  StringBuilder sb = new StringBuilder();
			    for (char c : stack) {
			    	sb.append(c);
			    }
			    System.out.println(sb);
			    return sb.toString();
		        
		    }
	public static void main(String[] args) {
		//Assignment.decodeString("3[a]");
		String [] ops = {"5","-2","4","C","D","9","+","+"};
		//Assignment.calPoints(ops);
		Assignment.removeDuplicates("abbaca");

	}

}
