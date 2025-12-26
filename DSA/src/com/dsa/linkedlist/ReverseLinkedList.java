package com.dsa.linkedlist;
class ListNode{
	int data;
	ListNode next;
	ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListNode1{
	int data;
	ListNode1 next;
	ListNode1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
	static ListNode head;
	static ListNode1 head1;
	
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
		  ListNode linked2 =revLinkedList(l2);
		  ListNode ansList = new ListNode(0);
		  ListNode dumy = ansList;
		  int sum,carry = 0;
		  
		  while(linked1!=null || linked2!=null) {
			  int x=(linked1==null)?0 : linked1.data; 
			  int y=(linked2==null)?0 : linked2.data; 
			  sum = x+y+carry;
			  carry=sum/10; 
			  sum=sum%10; 
			  ListNode currSum = new ListNode(sum);
			  ansList.next =currSum;
			  ansList=ansList.next;
			  if(linked1!=null) {
				  linked1 = linked1.next;
			  }
			  if(linked2!=null) {
				  linked2 = linked2.next;
			  }
		  }
		  if(carry>0) {
			  ListNode carrySum = new ListNode(carry);
			  ansList.next =carrySum;
			  ansList=ansList.next;
		  }
		return revLinkedList(dumy.next);
	        
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
	  

	  ListNode addNode(ListNode head) {
		  int pos=5;
		  ListNode newNode = new ListNode(15);

		    if (pos == 1) {        // beginning
		        newNode.next = head;
		        return newNode;
		    }

		    ListNode temp = head;
		    for (int i = 1; i < pos - 1 && temp != null; i++) {
		        temp = temp.next;
		    }

		    if (temp == null) return head; // invalid position

		    newNode.next = temp.next;
		    temp.next = newNode;

		    return head;
	  }
	  ListNode deleteNode(ListNode head) {
		  int pos=2;

		    if (pos == 1) {        // beginning
		        return head.next;
		    }

		    ListNode temp = head;
		    for (int i = 1; i < pos - 1 && temp != null; i++) {
		        temp = temp.next;
		    }

		    if (temp == null || temp.next == null) return head; // invalid position

		    temp.next =temp.next.next;
		    
		    
		    return head;
	  }
	  
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		 	list.head = new ListNode(10);
	        list.head.next = new ListNode(20);
	        list.head.next.next = new ListNode(30);
	        
	        //ListNode res = list.deleteLastNode(head);
	       ListNode node = new ListNode(15);
	      // System.out.println(head +" :: "+head1);
	       ListNode res =list.deleteNode(head);
		      while(res!=null) {
		    	  System.out.println(res.data);
		    	  res = res.next;
		      }

	}

}
