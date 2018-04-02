package com.linkedList;

import com.linkedList.LinkedList.Node;

public class LinkedListReverseRecurssion {
	static Node head;
	
	
	
	public static void main(String[] args) {
		LinkedListReverseRecurssion list = new LinkedListReverseRecurssion();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
 
        System.out.println("Original Linked list ");
        list.printList(head);
      //  Node res = list.reverseUtil(head, null);
        list.reverse(head);
        System.out.println("");
        System.out.println("");
        System.out.println("Reversed linked list ");
        //list.printList(head);
    
		
	}



/*	private Node reverseUtil(Node head2, Object object) {
		Node curr = null;
		if(head2!=null) {
		Node next=head2.next;
		 curr=head2;
		 //curr=next;
		reverseUtil(next,curr);
		if(head2==null) {
			curr=head2;
		}
		}
		
		return curr;
	}
*/

	
	

	private void reverse(Node head) {
		if(head==null) {
			System.out.println("empty");
		}
		else {
			Node curr=head;
			Node prev=null;
			Node next=null;
			while(curr!=null) {
				next=curr.next;
				curr.next=prev;
			    prev = curr;
			    curr = next;
	        }
	        head = prev;
			
			printList(head);
		}
	}



	private void printList(Node head2) {
		if(null != head2) {
			while(head2!=null) {
				System.out.print(head2.data +" ");
				head2=head2.next;
			}
		}
		System.out.println();
	//	 reverse(head2);
	}
	

}
