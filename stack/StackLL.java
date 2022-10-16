package stack;
// public class Node<T>{
//	
//	 public T data;
//	 public Node<T> next;
//	 
//	 public Node(T data) {
//		 this.data=data;
//		 this.next=null;
//	 }
//	}

import LinkedList1.Node;

public class StackLL<T> {
		private Node<T> head;
		private int size;
		
		public StackLL() {
			head=null;
			size=0;
		}
		
		//size of stack
		public int size() {
			return size;
		}
		
		//say stack is empty or not
		public boolean isEmpty() {
			return size==0;
		}
		
		//for push element in stack
		public void push(T elem) {
		Node<T> nHead=new Node<T>(elem);
		nHead.next=head;
		head=nHead;
		size++;
		}
		
		//for top data in stack
		public T top() throws StackEmptyException {
			if(head==null) {
			 throw new StackEmptyException();
			}
			return head.data;
		}
		
		//for pop(delete) element and return element of stack
		public T pop() throws StackEmptyException {
			if(head==null) {
				throw new StackEmptyException();
			}
			T temp=head.data;
			head=head.next;
			size--;
			return temp;
		}
	}
