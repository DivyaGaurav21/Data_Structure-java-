package stack;

public class stackUse {

	public static void main(String[] args) throws StackEmptyException, StackFullException {
		StackArray st=new StackArray();
//    StackLL<Integer> st=new StackLL<Integer>();
    int arr[]= {1,2,3,4,5,6};
    for(int i=0; i<arr.length; i++) {
    	st.push(arr[i]);
    }
    while(!st.isEmpty()) {
    	System.out.println("size of stack==>"+st.size());
    	System.out.println(st.pop());
    }
		
	} 

}
