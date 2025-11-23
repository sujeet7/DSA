package com.dsa.stack;

import java.util.Stack;

public class MinStackSecondApproach {
	Stack<Integer> st;
	Stack<Integer> minSt;

	public MinStackSecondApproach() {
		st = new Stack<Integer>();
		minSt = new Stack<Integer>();
	}

	public void push(int val) {
		if (st.size() == 0) {
			st.push(val);
			minSt.push(val);
		} else {
			int last = minSt.peek();
			int min = Math.min(val, last);
			st.push( val);
			minSt.push(min);
		}
	}

	public void pop() {
		st.pop();
	}

	public int top() {
		return st.peek();

	}

	public int getMin() {
		return minSt.peek();

	}
}
