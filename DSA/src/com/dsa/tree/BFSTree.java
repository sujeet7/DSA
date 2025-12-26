package com.dsa.tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	
	Integer val;
	TreeNode left=null;
	TreeNode right=null;
	
	public TreeNode(Integer val) {
		this.val =val;
	}
}

public class BFSTree {
	
	   public static void bfs(TreeNode root) { 
	        if (root == null) return; 
	        Queue<TreeNode> queue = new LinkedList<>(); 
	        queue.offer(root); 
	        while (!queue.isEmpty()) { 
	            TreeNode curr = queue.poll(); 
	            System.out.print(curr.val + " "); 
	            if (curr.left != null) 
	                queue.offer(curr.left); 
	            if (curr.right != null) 
	                queue.offer(curr.right); 
	        } 
	    } 
	   
		public static int deepestLeavesSum(TreeNode root) {
			if (root == null)
				return 0;

			Queue<TreeNode> q = new ArrayDeque<>();
			q.offer(root);
			int sum = 0;
			while (!q.isEmpty()) {
				sum = 0;
				int size = q.size();
				while (size != 0) {
					TreeNode curr = q.poll();
					sum += curr.val;
					if (curr.left != null)
						q.offer(curr.left);

					if (curr.right != null)
						q.offer(curr.right);
				}
			}
			return sum;
		}

	public static void main(String[] args) {
				/* 
		        1 
		       / \ 
		      2   3 
		     / \   \ 
		    4   5   6 
		  */ 
		   TreeNode root = new TreeNode(1); 
	        root.left = new TreeNode(2); 
	        root.right = new TreeNode(3); 
	        root.left.left = new TreeNode(4); 
	        root.left.right = new TreeNode(5); 
	        root.right.right = new TreeNode(6); 

	       // BFSTree.bfs(root); 
	        
	    	/* 
	        1 
	       / \ 
	      2   3 
	     / \   \ 
	    4   5   6 
	   /		 \
	  7			  8
	  */ 
	        TreeNode root1 = new TreeNode(1); 
	        root1.left = new TreeNode(2); 
	        root1.right = new TreeNode(3); 
	        root1.left.left = new TreeNode(4); 
	        root1.left.right = new TreeNode(5); 
	        root1.right.right = new TreeNode(6); 
	        root1.left.left.left = new TreeNode(7); 
	        root1.right.right.right = new TreeNode(8); 
	        BFSTree.bfs(root1); 
	       // BFSTree.deepestLeavesSum(root1);
	    } 

	}

