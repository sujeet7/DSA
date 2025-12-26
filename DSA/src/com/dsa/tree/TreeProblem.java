package com.dsa.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Node
{
    int data;
    Node left, right;
}

public class TreeProblem {
		
	int count = 0;
	int sum = 0;

	int countLeaves(Node node) {
		findLeaveNodes(node);

		return count;
	}

	void findLeaveNodes(Node root) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			count++;
		}
		findLeaveNodes(root.left);
		findLeaveNodes(root.right);

	}

	int sumBT(Node root) {
		// Your code here
		findSum(root);

		return sum;
	}

	void findSum(Node root) {
		if (root == null)
			return;

		findSum(root.left);
		findSum(root.right);
		sum += root.data;
	}
	 public int heightOfTree(Node root) {
	        if (root == null) 
	            return -1; // height in edges

	    int leftHeight = heightOfTree(root.left);
	    int rightHeight = heightOfTree(root.right);

	    return Math.max(leftHeight, rightHeight) + 1;
	    
	}
	 
	 
	void sumOfDeepestNode(Node root) {
		if (root == null)
			return;
		sum = 0;
		findLeaveNodes(root.right);
		findLeaveNodes(root.left);
		if (root.left == null && root.right == null) {
			count++;
		}
	}
	
	
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		
		List<Integer> list=null;
		Queue<TreeNode> queue = new ArrayDeque<>();

		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			list = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode curr = queue.poll();
				list.add(curr.val);
				if(curr.left!=null)
					queue.offer(curr.left);
				
				if(curr.right!=null)
					queue.offer(curr.right);
			}
			result.add(list);

	}
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}