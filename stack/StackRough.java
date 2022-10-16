package stack;

import java.util.Stack;

public class StackRough {
	
	public static boolean balanceParanthesis(String str) {
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
		 char curr=str.charAt(i);
		 if(curr=='('||curr=='{'||curr=='[') {
			 st.push(curr);
		 }else {
			 if(st.isEmpty()) {
				 return false;
			 }else if(!isMatching(st.peek(),curr)){
				return false; 
			 }else {
				 st.pop();
			 }
		 }
	  }
		return st.isEmpty();
	}
	
 private static boolean isMatching(char a, char b) {
		return (a=='(' && b==')')||(a=='{' && b=='}')||(a=='[' && b==']');
 }

public static void main(String[] args) {
	 String s="[{(((a+b)))}]";
	 System.out.println(balanceParanthesis(s));
	
}

}
