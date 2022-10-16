package stack;

public class StackArray {
  private int data[];
  private int topIndex;
  
  public StackArray() {
	  data=new int[2];
	  topIndex=-1;
  }
  
  public StackArray(int size) {
	  data=new int[size];
	  topIndex=-1;
  }
  
  //for find size of stack
  public int size() {
	  return topIndex+1;
  }
  
  //for check stack is empty or not
  public boolean isEmpty() {
	  return topIndex==-1;
  }
  
  //for push element in stack
  public void push(int elem) {
	  if(topIndex==data.length-1) {
//		  throw new StackFullException();
		  doubleCapacity();
	  }
	  data[++topIndex]=elem;
  }
  
  private void doubleCapacity() {
	  System.out.println("dc");
  int temp[]=data;
  data=new int[2*temp.length];
  for(int i=0; i<temp.length; i++) {
	  data[i]=temp[i];
  }
}

//for find the top of element in stack
  public int top() throws StackEmptyException {
	  if(topIndex==-1) {
		  throw new StackEmptyException();
	  }
	  return data[topIndex];
  }
  
  
  //for delete element in stack
  public int pop() throws StackEmptyException {
	  if(topIndex==-1) {
		  throw new StackEmptyException();
	  }
	  int temp=data[topIndex];
	  topIndex--;
	  return temp;
  }
   
}
