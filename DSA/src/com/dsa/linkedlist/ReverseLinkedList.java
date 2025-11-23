package com.dsa.linkedlist;
class ListNode{
	int data;
	ListNode next;
	ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
	static ListNode head;
	
	ListNode revLinkedList(ListNode head) {
		ListNode curr, prev, nxt;
		curr = head;
		prev = nxt = null;
		while (curr != null) {
			nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;
		}
		return prev;
	}
	
	
	  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		  ListNode linked1 =revLinkedList(l1);
		  ListNode linked2 =revLinkedList(l1);
		  ListNode ansList = new ListNode(0);
		  int carry = 0;
		  
		  while(linked1!=null || linked2!=null) {
			  
		  }
		return ansList;
	        
	    }
	  
	  ListNode deleteLastNode(ListNode head) {
		  if(head==null && head.next==null) {
			  return null;
		  }
		  ListNode temp = head;
		  
		  while(temp!=null && temp.next.next!=null) {
			  temp = temp.next;
		  }
		  temp.next=null;
		  return head;
	  }
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		 list.head = new ListNode(10);
	        list.head.next = new ListNode(20);
	        list.head.next.next = new ListNode(30);
	        ListNode res = list.deleteLastNode(head);
	      while(res!=null) {
	    	  System.out.println(res.data);
	    	  res = res.next;
	      }

	}

}
