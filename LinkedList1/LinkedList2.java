package LinkedList1;

import java.util.Scanner;

public class LinkedList2 {
	
	public static Node<Integer> takeInputN(){
		Scanner scn=new Scanner(System.in);
		int data=scn.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1) {
			Node<Integer> currNode=new Node<Integer>(data);
			if(head==null) {
				head=currNode;
				tail=currNode;
			}else {
				tail.next=currNode;
				tail=currNode;
			}
			
			data=scn.nextInt();
		}
		return head;
	}
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	
	//@(1)@ program to reverse LL with address by recursive way
	public static Node<Integer> reverseLL1(Node<Integer> head){
		if(head==null||head.next==null) {
			return head;
		}
		
		Node<Integer> smallAns=reverseLL1(head.next);
		Node<Integer> tail=smallAns;
		while(tail.next!=null) {
			tail=tail.next;
		}
		tail.next=head;
		head.next=null;
		return smallAns;
	}
	
	
	//@(Alternate)@program to reverse LL by iterative way
	public static Node<Integer> reverseLL2(Node<Integer> head){
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer> curr=head;
		Node<Integer> prev=null;
		Node<Integer> forw=null;
		while(curr!=null) {
			forw=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forw;
		}
		return prev;
	}
	
	
	//@(2)@ program to find middle Linked List
	public static Node<Integer> middleNode(Node<Integer> head){
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer> fast=head,slow=head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			 fast= fast.next.next;
		}
		return slow;
	}
	
	
	//@(3)@ program to check wheathe A LL is palidrom or not
	public static boolean palidromLL(Node<Integer> head) {
		if(head==null||head.next==null) {
			return true;
		}
		Node<Integer> mid= middleNode(head);
		Node<Integer> nHead=mid.next;
		mid.next=null;
		
		nHead=reverseLL2(nHead);
		
		Node<Integer> c1=head;
		Node<Integer> c2=nHead;
		while(c1!=null && c2!=null) {
			if(c1.data!=c2.data) {
				return false;
			}
			c1=c1.next;
			c2=c2.next;
		}
		return true;
		}
	
	
	//@(4)@ Merge two Sorted Linked List in one LL
	public static Node<Integer> mergeTwoLL(Node<Integer> head1, Node<Integer> head2){
		if(head1==null) {
			return head2;
		}
		if(head2==null) {
			return head2;
		}
		Node<Integer> dummy=new Node<Integer>(-1);
		Node<Integer> tail=dummy;
		
		while(head1!=null&& head2!=null) {
			if(head1.data<head2.data) {
				tail.next=head1;
				head1=head1.next;	
				tail=tail.next;
			}else {
				tail.next=head2;
				head2=head2.next;
				tail=tail.next;
			}
		}
		if(head1!=null) {
			tail.next=head1;
		}
		if(head2!=null) {
			tail.next=head2;
		}
		return dummy.next;
	}
	
	
	//@(5)@ merge sort recursive function to sort Linked list
	public static Node<Integer> mergeSortLL(Node<Integer> head){
		if(head==null|| head.next==null) {
			return head;
		}
		Node<Integer> mid=middleNode(head);
		Node<Integer> half1=head;
		Node<Integer> half2=mid.next;
		mid.next=null;
		
		half1=mergeSortLL(half1);
		half2=mergeSortLL(half2);
		
		Node<Integer> finalHead=mergeTwoLL(half1, half2);
		return finalHead;
	}
	
	
	//@(6)@ find a node recursively in LL
	public static int findNode(Node<Integer> head, int n) {
		if(head==null) {
			return -1;
		}
		if(head.data.equals(n)) {
			return 0;
		}else {
			int smallAns=findNode(head.next, n);
			if(smallAns==-1) {
				return -1;
			}else {
				return smallAns+1;
			}
		}
	}
	
	
	//@(7)@ segregate even odd in linked list
	public static Node<Integer> segregateEvenOdd(Node<Integer> head){
		if(head==null||head.next==null) {
			return head;
		}
		
		Node<Integer> dummyEven=new Node<Integer>(-1);
		Node<Integer> dummyOdd=new Node<Integer>(-1);
		
		Node<Integer> evenTail=dummyEven, oddTail=dummyOdd, curr=head;
		
		while(curr!=null) {
			if(curr.data%2!=0) {
				oddTail.next=curr;
				oddTail=oddTail.next;
				curr=curr.next;
			}else {
				evenTail.next=curr;
				evenTail=evenTail.next;
				curr=curr.next;
			}	
		}
		evenTail.next=dummyOdd.next;
		oddTail.next=null;
		return dummyEven.next;
	}
	
	//@(8)@ segregate zero and one
	public static Node<Integer> segregateZeroOne(Node<Integer> head){
		if(head==null && head.next==null) {
			return head;
		}
		Node<Integer> dummyZero =new Node<Integer>(-1);
		Node<Integer> dummyOne=new Node<Integer>(-1);
	   
		Node<Integer> curr=head, zeroTail=dummyZero, oneTail=dummyOne;
		
		while(curr!=null) {
			if(curr.data==0) {
				zeroTail.next=curr;
				zeroTail=zeroTail.next;
				curr=curr.next;
			}else {
				oneTail.next=curr;
				oneTail=oneTail.next;
				curr=curr.next;
			}
		}
		zeroTail.next=dummyOne.next;
		oneTail.next=null;
		return dummyZero.next;
	}
	
	//
	public static void main(String[] args) {
		Node<Integer> ll=takeInputN();
		ll=segregateZeroOne(ll);
		printLL(ll);
//		boolean pali=palidromLL(LL1);
//		System.out.println(pali);
//		System.out.println(findNode(LL1, 5));
		
//		Node<Integer> mergeLL=mergeSortLL(LL1);
//		printLL(mergeLL);
//		boolean b=palidromLL(LL);
//		System.out.println(b);
//		
//		Node<Integer> node=middleNode(LL);
////		printLL(LL);
//		System.out.println(node.data);
	}
}
