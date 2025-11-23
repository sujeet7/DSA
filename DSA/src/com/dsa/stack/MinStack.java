package com.dsa.stack;

import java.util.Stack;

public class MinStack {
	Stack<int[]> st;

	public MinStack() {
		st = new Stack<int[]>();
	}

	public void push(int val) {
		if (st.size() == 0) {
			int[] curr = new int[] { val, val };
			st.push(curr);
		} else {
			int[] last = st.peek();
			int min = Math.min(val, last[1]);
			st.push(new int[] { val, min });
		}
	}

	public void pop() {
		st.pop();
	}

	public int top() {
		return st.peek()[0];

	}

	public int getMin() {
		return st.peek()[1];

	}
}
